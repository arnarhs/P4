package app;

public class LogOutput implements Output{

	@Override
	public void Send(String output) {
		System.out.println(output);
	}

}
