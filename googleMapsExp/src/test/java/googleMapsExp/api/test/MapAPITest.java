package googleMapsExp.api.test;

import java.io.IOException;

import googleMapsExp.api.DirectionsResponse;
import googleMapsExp.api.MapAPI;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapAPITest {
	private static final Logger logger = LoggerFactory.getLogger(MapAPITest.class);
	private static final ObjectMapper objectMapper = new ObjectMapper();
	private static final String VALUE_ORIGIN = "BTM Layout 2nd Stage";
	private static final String VALUE_DESTINATION = "BTM Layout 1";
	public static void main(String[] args) {
		String routeJson = MapAPI.getInstance().getDirectionJson(VALUE_ORIGIN, VALUE_DESTINATION);
		logger.info("route = {}", routeJson);
		DirectionsResponse response = null;
		try {
			response = objectMapper.readValue(routeJson, DirectionsResponse.class);
			logger.info("direction Object : {}" , response.toString());
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MapAPI.stopMapAPI();
	}
}
