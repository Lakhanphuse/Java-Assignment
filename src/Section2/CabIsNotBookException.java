package Section2;

public class CabIsNotBookException extends RuntimeException {

	public String getMessage()
	{
		return "First you have to book a Cab to cancel";
	}
}
