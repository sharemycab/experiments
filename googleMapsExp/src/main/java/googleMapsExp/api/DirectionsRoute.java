package googleMapsExp.api;

import java.util.Arrays;

public class DirectionsRoute {
	private String summary; // contains a short textual description for the route, suitable for naming and disambiguating the route from alternatives.
	private DirectionsLeg[] legs; // [] contains an array which contains information about a leg of the route, between two locations within the given route. A separate leg will be present for each waypoint or destination specified. (A route with no waypoints will contain exactly one leg within the legs array.) Each leg consists of a series of steps. (See Directions Legs below.)
	private int[] waypoint_order; // contains an array indicating the order of any waypoints in the calculated route. This waypoints may be reordered if the request was passed optimize:true within its waypoints parameter.
	private Polyline overview_polyline; // contains an object holding an array of encoded points that represent an approximate (smoothed) path of the resulting directions.
	private LatLngBound bounds; // contains the viewport bounding box of the overview_polyline.
	private String copyrights; // contains the copyrights text to be displayed for this route. You must handle and display this information yourself.
	private String[] warnings; //[] contains an array of warnings to be displayed when showing these directions. You must handle and display these warnings yourself.
	public DirectionsRoute() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DirectionsRoute(String summary, DirectionsLeg[] legs,
			int[] waypoint_order, Polyline overview_polyline, LatLngBound bounds,
			String copyrights, String[] warnings) {
		super();
		this.summary = summary;
		this.legs = legs;
		this.waypoint_order = waypoint_order;
		this.overview_polyline = overview_polyline;
		this.bounds = bounds;
		this.copyrights = copyrights;
		this.warnings = warnings;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public DirectionsLeg[] getLegs() {
		return legs;
	}
	public void setLegs(DirectionsLeg[] legs) {
		this.legs = legs;
	}
	public int[] getWaypoint_order() {
		return waypoint_order;
	}
	public void setWaypoint_order(int[] waypoint_order) {
		this.waypoint_order = waypoint_order;
	}
	public Polyline getOverview_polyline() {
		return overview_polyline;
	}
	public void setOverview_polyline(Polyline overview_polyline) {
		this.overview_polyline = overview_polyline;
	}
	public LatLngBound getBounds() {
		return bounds;
	}
	public void setBounds(LatLngBound bounds) {
		this.bounds = bounds;
	}
	public String getCopyrights() {
		return copyrights;
	}
	public void setCopyrights(String copyrights) {
		this.copyrights = copyrights;
	}
	public String[] getWarnings() {
		return warnings;
	}
	public void setWarnings(String[] warnings) {
		this.warnings = warnings;
	}
	@Override
	public String toString() {
		return "DirectionsRoute [summary=" + summary + ", legs="
				+ Arrays.toString(legs) + ", waypoint_order="
				+ Arrays.toString(waypoint_order) + ", overview_polyline="
				+ overview_polyline + ", bounds=" + bounds + ", copyrights="
				+ copyrights + ", warnings=" + Arrays.toString(warnings) + "]";
	}
	
	
}
