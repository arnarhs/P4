package app;

import java.util.HashMap;

public class LogOutput implements Output{

	@Override
	public void Log(String output) {
		System.out.println(output);
	}

	@Override
	public void Result(HashMap<Double, Double> result) {
		// TODO Auto-generated method stub
		
	}

	
}
