package Section2;

public class Sim {
	
	private int simNo;
	private String serviceProvider;
	private String colour;
	
	public Sim(int simNo,String serviceProvider,String colour) {
		
		this.simNo=simNo;
		this.serviceProvider=serviceProvider;
		this.colour=colour;
		}

	public int getSimNo() {
		return simNo;
	}

	public void setSimNo(int simNo) {
		this.simNo = simNo;
	}

	public String getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public String getColour() {
		return colour;
	}

}
