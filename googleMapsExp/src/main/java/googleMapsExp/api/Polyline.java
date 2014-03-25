package googleMapsExp.api;

public class Polyline {
	private String points;

	private Polyline() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Polyline(String points) {
		super();
		this.points = points;
	}

	/**
	 * @return the points
	 */
	public String getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(String points) {
		this.points = points;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Polyline [points=" + points + "]";
	}
	
	
}
