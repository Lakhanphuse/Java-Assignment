package Section2;

public class Cab {
	
	private int cabNo;
	private String carName;
	private String driverName;
	private String detination;
	private String pickup;
	private int otp;
	
	public Cab(int cabNo, String carName, String driverName, String detination, String pickup, int otp) {
		super();
		this.cabNo = cabNo;
		this.carName = carName;
		this.driverName = driverName;
		this.detination = detination;
		this.pickup = pickup;
		this.otp = otp;
	}

	public int getCabNo() {
		return cabNo;
	}

	
	public String getCarName() {
		return carName;
	}

	
	public String getDriverName() {
		return driverName;
	}


	public String getDetination() {
		return detination;
	}

	public void setDetination(String detination) {
		this.detination = detination;
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}
	
	
	

}
