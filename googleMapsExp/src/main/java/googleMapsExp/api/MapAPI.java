package googleMapsExp.api;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;


public class MapAPI {
	
	private static MapAPI INSTANCE = new MapAPI();
	
	private Client client = null;

	private static final String GOOGLE_MAP_BASE_URI = "https://maps.googleapis.com/maps/api/directions";
//	private static final String VALUE_ORIGIN = "BTM Layout 2nd Stage";
//	private static final String VALUE_DESTINATION = "BTM Layout 1";
	private static final String PARAM_ORIGIN="origin";
	private static final String PARAM_DESTINATION="destination";
	private static final String PARAM_SENSOR = "sensor";
	private static final String PARAM_KEY = "key";
	private static final String VALUE_KEY = "AIzaSyCCtVJ4t5ZyrtVBQRhVCsCyVldi_RLcqtA";
	
	private MapAPI(){
		this.client = ClientBuilder.newClient();
	}
	
	public static MapAPI getInstance(){
		return INSTANCE;
	}
	
	public String getDirectionJson(String from, String to){
		
		WebTarget target = client.target(GOOGLE_MAP_BASE_URI);

		String responseMsg = target.path("json")
				.queryParam(PARAM_ORIGIN, from)
				.queryParam(PARAM_DESTINATION, to)
				.queryParam(PARAM_SENSOR, "false")
				.queryParam(PARAM_KEY, VALUE_KEY)
				.request()
				.get(String.class);
		
		
		return responseMsg;
	}
	
	private void stopAPI(){
		this.client.close();
	}
	
	public synchronized static void stopMapAPI(){
		INSTANCE.stopAPI();
	}
}
