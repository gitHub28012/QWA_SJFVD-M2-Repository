package com.TimesheetManagementToolProject.GenericLib;

import java.util.Random;

public class WorkLib {
	
	
	public int randomNo()
	{
		Random ram = new Random();
		int no = ram.nextInt(1000);
		return no;
	}

}
