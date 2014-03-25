package googleMapsExp.api.rest;

import googleMapsExp.api.MapAPI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("getDirection")
public class GetDirectionResultRest {

	private static final Logger logger = LoggerFactory.getLogger(GetDirectionResultRest.class);

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDirection( @QueryParam("source") String source , @QueryParam("destination") String destination){
		
		MapAPI mapAPI = MapAPI.getInstance();
		String directionResult = mapAPI.getDirectionJson(source, destination);
		
		logger.info("returning directionResult = {}" ,directionResult);
		
		return directionResult;
	}
}
