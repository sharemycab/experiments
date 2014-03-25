package googleMapsExp.route;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RouteTest {
	private static final String GOOGLE_MAP_BASE_URI = "https://maps.googleapis.com/maps/api/directions";
	private static final String VALUE_ORIGIN = "BTM Layout 2nd Stage";
	private static final String VALUE_DESTINATION = "BTM Layout 1";
	private static final String PARAM_ORIGIN="origin";
	private static final String PARAM_DESTINATION="destination";
	private static final String PARAM_SENSOR = "sensor";
	private static final String PARAM_KEY = "key";
	private static final String VALUE_KEY = "AIzaSyCCtVJ4t5ZyrtVBQRhVCsCyVldi_RLcqtA";
	
	private static final Logger logger = LoggerFactory.getLogger(RouteTest.class);
	
	private static Client client = null;
	
	public static void main(String[] args) {
		client = ClientBuilder.newClient();
		WebTarget target = client.target(GOOGLE_MAP_BASE_URI);

		String responseMsg = target.path("json")
				.queryParam(PARAM_ORIGIN, VALUE_ORIGIN)
				.queryParam(PARAM_DESTINATION, VALUE_DESTINATION)
				.queryParam(PARAM_SENSOR, "false")
				.queryParam(PARAM_KEY, VALUE_KEY)
				.request()
				.get(String.class);
		
		
		logger.info("JSON route {}", responseMsg);
		client.close();
	}

}
