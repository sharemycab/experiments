package googleMapsExp.api;

public class DirectionResponseStatus {
	private String status;
	private String error_message;

	public DirectionResponseStatus(String status){
		this.status = status;
	}
	private DirectionResponseStatus() {
		super();
	}

	public DirectionResponseStatus(String status, String error_message) {
		super();
		this.status = status;
		this.error_message = error_message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getError_message() {
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}

	@Override
	public String toString() {
		return "DirectionResponseStatus [status=" + status + ", error_message="
				+ error_message + "]";
	}
}
