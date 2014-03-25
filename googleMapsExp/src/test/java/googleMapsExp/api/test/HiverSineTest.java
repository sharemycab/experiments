package googleMapsExp.api.test;

import googleMapsExp.api.DirectionsResponse;
import googleMapsExp.api.MapAPI;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HiverSineTest {
	/*
	 d is the distance between the two points (along a great circle of the sphere; see spherical distance),
r is the radius of the sphere,
phi_1, phi_2: latitude of point 1 and latitude of point 2
lambda_1, lambda_2: longitude of point 1 and longitude of point 2
On the left side of the equals sign d/r is the central angle, assuming angles are measured in radians 
	(note that φ and λ can be converted from degrees to radians by multiplying by π/180 as usual).
Solve for d by applying the inverse haversine (if available) or by using the arcsine (inverse sine) function:
d = 2*r*arcsin(sqrt(sin^2((phi_2 - phi_1)/2) + cos(phi_1)*cos(phi_2)*sin^2((lambda_2 - lambda_1)/2)))
	 */
	private static final String HPPetrolPump = "HP Petrol Bunk Outer Ring Rd, BTM Layout Bangalore, Karnataka";
	private static final Logger logger = LoggerFactory.getLogger(MapAPITest.class);
	private static final ObjectMapper objectMapper = new ObjectMapper();
	private static final String BTM_LAYOUT_2 = "BTM Layout 2nd Stage";
	private static final String BTM_LAYOUT_1 = "BTM Layout 1";
	private static final String CCD_BTM_2 = "Cafe Coffee Day Outer Ring Rd, Stage 2, BTM Layout 2nd Stage Bangalore, Karnataka 560076";
	public static void main(String[] args) {
		
		
	//		Double phi_1 = 12.9164942;
	//		Double phi_2 = 12.9185615;
	//		Double lambda_1 = 77.6111899;
	//		Double lambda_2 = 77.612241;
		
		Double phi_1 = 12.9165559;
		Double phi_2 = 12.9164942;
		Double lambda_1 = 77.6087016;
		Double lambda_2 = 77.6111899;
		
		
		
		Double radius_of_earth = 6371.0 ;// in km
		logger.info("phi_1={}, phi_2={}, lambda_1={}, lambda_2={}, radius_of_earth={}", new Object[] {phi_1,phi_2,lambda_1,lambda_2, radius_of_earth});
		
		Double distance = 2 * radius_of_earth * Math.asin( Math.sqrt( Math.pow(Math.sin( Math.toRadians((phi_2 - phi_1 )/2) ) , 2) + Math.cos(Math.toRadians(phi_1))* Math.cos(Math.toRadians(phi_2)) * Math.pow(Math.sin( Math.toRadians((lambda_2 - lambda_1)/2)), 2)  ) );
		
		logger.info("distance = {}", distance);
		
//		String routeJson = MapAPI.getInstance().getDirectionJson(HPPetrolPump, CCD_BTM_2);
//		logger.info("route = {}", routeJson);
//		DirectionsResponse response = null;
//		try {
//			response = objectMapper.readValue(routeJson, DirectionsResponse.class);
//			logger.info("direction Object : {}" , response.toString());
//		} catch (JsonParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		MapAPI.stopMapAPI();
	}
	
}
