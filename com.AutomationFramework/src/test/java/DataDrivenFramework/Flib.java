package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Flib {
	
	public String getDataFromProperty(String Path,String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream(Path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(Key);
		return value;
		
	}
	
	//create the method for fetching the data from excel file
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
