package Assignment;

import java.util.Date;

public class Data {
	
	public static void main(String[] args) {
		
		String date = new Date().toString().replace(" ", "_").replace(":", "_");
		
		System.out.println(date);
	}

}
