package googleMapsExp.api;

import java.util.Arrays;

public class DirectionsStep {
	private String html_instructions; // contains formatted instructions for
										// this step, presented as an HTML text
										// string.
	private Distance distance; // contains the distance covered by this step
								// until the next step. (See the discussion of
								// this field in Directions Legs above.) This
								// field may be undefined if the distance is
								// unknown.
	private Duration duration; // contains the typical time required to perform
								// the step, until the next step (See the
								// description in Directions Legs above.) This
								// field may be undefined if the duration is
								// unknown.
	private LatLng start_location; // contains the location of the starting
									// point of this step, as a single set of
									// lat and lng fields.
	private LatLng end_location; // contains the location of the last point of
									// this step, as a single set of lat and lng
									// fields.
	private DirectionsStep[] sub_steps; // contains detailed directions for
										// walking or driving steps in transit
										// directions. Substeps are only
										// available when travel_mode is set to
										// "transit". The sub_steps array is of
										// the same type as steps.
	private String transit_details;// contains transit specific information.
									// This field is only returned with
									// travel_mode is set to "transit". See
									// Transit Details below.
	
	private String maneuver;
	private Polyline polyline;

	private String travel_mode;
	
	/**
	 * @return the travel_mode
	 */
	public String getTravel_mode() {
		return travel_mode;
	}

	/**
	 * @param travel_mode the travel_mode to set
	 */
	public void setTravel_mode(String travel_mode) {
		this.travel_mode = travel_mode;
	}

	/**
	 * @return the polyline
	 */
	public Polyline getPolyline() {
		return polyline;
	}

	/**
	 * @param polyline the polyline to set
	 */
	public void setPolyline(Polyline polyline) {
		this.polyline = polyline;
	}

	public DirectionsStep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DirectionsStep(String html_instructions, Distance distance,
			Duration duration, LatLng start_location, LatLng end_location,
			DirectionsStep[] sub_steps, String transit_details) {
		super();
		this.html_instructions = html_instructions;
		this.distance = distance;
		this.duration = duration;
		this.start_location = start_location;
		this.end_location = end_location;
		this.sub_steps = sub_steps;
		this.transit_details = transit_details;
	}

	/**
	 * @return the maneuver
	 */
	public String getManeuver() {
		return maneuver;
	}

	/**
	 * @param maneuver the maneuver to set
	 */
	public void setManeuver(String maneuver) {
		this.maneuver = maneuver;
	}

	public String getHtml_instructions() {
		return html_instructions;
	}

	public void setHtml_instructions(String html_instructions) {
		this.html_instructions = html_instructions;
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

	public DirectionsStep[] getSub_steps() {
		return sub_steps;
	}

	public void setSub_steps(DirectionsStep[] sub_steps) {
		this.sub_steps = sub_steps;
	}

	public String getTransit_details() {
		return transit_details;
	}

	public void setTransit_details(String transit_details) {
		this.transit_details = transit_details;
	}

	@Override
	public String toString() {
		return "DirectionsStep [html_instructions=" + html_instructions
				+ ", distance=" + distance + ", duration=" + duration
				+ ", start_location=" + start_location + ", end_location="
				+ end_location + ", sub_steps=" + Arrays.toString(sub_steps)
				+ ", transit_details=" + transit_details + "]";
	}

}
