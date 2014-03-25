package googleMapsExp.api;

public class Duration {
	private String value;// indicates the duration in seconds.
	private String text;// contains a human-readable representation of the
						// duration.
	// These fields may be absent if the duration is unknown.

	private Duration() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Duration(String value, String text) {
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
		return "Duration [value=" + value + ", text=" + text + "]";
	}

}
