package googleMapsExp.api;

import java.util.Arrays;

public class DirectionsResponse {
	private DirectionResponseStatus status;
	private DirectionsRoute[] routes;
	public DirectionsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DirectionsResponse(DirectionResponseStatus status,
			DirectionsRoute[] routes) {
		super();
		this.status = status;
		this.routes = routes;
	}
	public DirectionResponseStatus getStatus() {
		return status;
	}
	public void setStatus(DirectionResponseStatus status) {
		this.status = status;
	}
	public DirectionsRoute[] getRoutes() {
		return routes;
	}
	public void setRoutes(DirectionsRoute[] routes) {
		this.routes = routes;
	}
	@Override
	public String toString() {
		return "DirectionsResponse [status=" + status + ", routes="
				+ Arrays.toString(routes) + "]";
	}
}
