	package googleMapsExp.api;

public class LatLngBound {
	private LatLng northeast;
	private LatLng southwest;
	private LatLngBound() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LatLngBound(LatLng northeast, LatLng southwest) {
		super();
		this.northeast = northeast;
		this.southwest = southwest;
	}
	/**
	 * @return the northeast
	 */
	public LatLng getNortheast() {
		return northeast;
	}
	/**
	 * @param northeast the northeast to set
	 */
	public void setNortheast(LatLng northeast) {
		this.northeast = northeast;
	}
	/**
	 * @return the southwest
	 */
	public LatLng getSouthwest() {
		return southwest;
	}
	/**
	 * @param southwest the southwest to set
	 */
	public void setSouthwest(LatLng southwest) {
		this.southwest = southwest;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LatLngBound [northeast=" + northeast + ", southwest="
				+ southwest + "]";
	}
}
