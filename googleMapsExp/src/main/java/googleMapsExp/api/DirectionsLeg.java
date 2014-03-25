package googleMapsExp.api;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DirectionsLeg {
	private DirectionsStep[] steps; //	 [] contains an array of steps denoting information about each separate step of the leg of the journey. (See Directions Steps below.)
	private Distance distance; // indicates the total distance covered by this leg, as a field with the following elements:

	private Duration duration; // indicates the total duration of this leg, as a field with the following elements:



	private Duration duration_in_traffic; // indicates the total duration of this leg, taking into account current traffic conditions. The duration in traffic will only be returned if all of the following are true:

//	The directions request includes a departure_time parameter set to a value within a few minutes of the current time.
//	The request includes a valid Maps for Business client and signature parameter.
//	Traffic conditions are available for the requested route.
//	The directions request does not include stopover waypoints.
//	The duration_in_traffic will contain the following fields:
//
//	value indicates the duration in seconds.
//	text contains a human-readable representation of the duration.
	private String arrival_time;// contains the estimated time of arrival for this leg. This property is only returned for transit directions. The result is returned as a Time object with three properties:
//	value the time specified as a JavaScript Date object.
//	text the time specified as a string. The time is displayed in the time zone of the transit stop.
//	time_zone contains the time zone of this station. The value is the name of the time zone as defined in the IANA Time Zone Database, e.g. "America/New_York".
	private String departure_time;// contains the estimated time of departure for this leg, specified as a Time object. The departure_time is only available for transit directions.
	private LatLng start_location;// contains the latitude/longitude coordinates of the origin of this leg. Because the Directions API calculates directions between locations by using the nearest transportation option (usually a road) at the start and end points, start_location may be different than the provided origin of this leg if, for example, a road is not near the origin.
	private LatLng end_location; // contains the latitude/longitude coordinates of the given destination of this leg. Because the Directions API calculates directions between locations by using the nearest transportation option (usually a road) at the start and end points, end_location may be different than the provided destination of this leg if, for example, a road is not near the destination.
	private String start_address;// contains the human-readable address (typically a street address) reflecting the start_location of this leg.
	private String end_address; // contains the human-readable address (typically a street address) reflecting the end_location of this leg.
	
	public DirectionsLeg(DirectionsStep[] steps, Distance distance,
			Duration duration, Duration duration_in_traffic,
			String arrival_time, String departure_time, LatLng start_location,
			LatLng end_location, String start_address, String end_address) {
		super();
		this.steps = steps;
		this.distance = distance;
		this.duration = duration;
		this.duration_in_traffic = duration_in_traffic;
		this.arrival_time = arrival_time;
		this.departure_time = departure_time;
		this.start_location = start_location;
		this.end_location = end_location;
		this.start_address = start_address;
		this.end_address = end_address;
	}
	public DirectionsLeg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DirectionsStep[] getSteps() {
		return steps;
	}
	public void setSteps(DirectionsStep[] steps) {
		this.steps = steps;
	}
	public Distance getDistance() {
		return distance;
	}
	public void setDistance(Distance distance) {
		this.distance = distance;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public Duration getDuration_in_traffic() {
		return duration_in_traffic;
	}
	public void setDuration_in_traffic(Duration duration_in_traffic) {
		this.duration_in_traffic = duration_in_traffic;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public LatLng getStart_location() {
		return start_location;
	}
	public void setStart_location(LatLng start_location) {
		this.start_location = start_location;
	}
	public LatLng getEnd_location() {
		return end_location;
	}
	public void setEnd_location(LatLng end_location) {
		this.end_location = end_location;
	}
	public String getStart_address() {
		return start_address;
	}
	public void setStart_address(String start_address) {
		this.start_address = start_address;
	}
	public String getEnd_address() {
		return end_address;
	}
	public void setEnd_address(String end_address) {
		this.end_address = end_address;
	}
	

	@Override
	public String toString() {
		return "DirectionsLeg [steps=" + Arrays.toString(steps) + ", distance="
				+ distance + ", duration=" + duration
				+ ", duration_in_traffic=" + duration_in_traffic
				+ ", arrival_time=" + arrival_time + ", departure_time="
				+ departure_time + ", start_location=" + start_location
				+ ", end_location=" + end_location + ", start_address="
				+ start_address + ", end_address=" + end_address + "]";
	}	
		

}
