package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertyFile {
	
	public static void main(String[] args) throws IOException {
		

		Flib lib = new Flib();
		String browser = lib.getDataFromProperty("./src/test/resources/CommanData.properties", "Browser");
		
		System.out.println(browser);
		
	}

}
