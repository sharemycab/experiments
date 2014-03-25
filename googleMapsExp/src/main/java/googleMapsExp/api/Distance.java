package googleMapsExp.api;

public class Distance {
	private String value; // indicates the distance in meters
	private String text; // contains a human-readable representation of the
							// distance, displayed in units as used at the
							// origin (or as overridden within the units
							// parameter in the request). (For example, miles
							// and feet will be used for any origin within the
							// United States.) Note that regardless of what unit
							// system is displayed as text, the distance.value
							// field always contains a value expressed in
							// meters.
	// These fields may be absent if the distance is unknown.

	private Distance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distance(String value, String text) {
		super();
		this.value = value;
		this.text = text;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Distance [value=" + value + ", text=" + text + "]";
	}

}
