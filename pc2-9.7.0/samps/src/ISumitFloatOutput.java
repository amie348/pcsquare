// Copyright (C) 1989-2019 PC2 Development Team: John Clevenger, Douglas Lane, Samir Ashoo, and Troy Boudreau.
import java.io.*;

//
// File:    ISumitFloatOutput.java
// Purpose: to sum the integers from stdin, producing the sum of the positive integers as a FLOAT output value.

// Author:  pc2@ecs.csus.edu or http://www.ecs.csus.edu/pc2
// 
// Thu Oct  2 20:25:28 PDT 2003
// 
// $Id: isumit.java 1962 2009-11-25 03:42:12Z boudreat $
//

public class ISumitFloatOutput {
    public static void main(String[] args) 
    {
	try
	{	
		BufferedReader br = new BufferedReader (
			new InputStreamReader (System.in), 1);
		
		String line;
		int sum = 0;
		int rv = 0;
		while((line = br.readLine()) != null) 
		{			
			rv = new Integer(line.trim()).intValue();
			if (rv > 0)
				sum = sum + rv;
			// System.out.println(line);
		}
		System.out.print("The sum of the integers is ");
		System.out.println(new Double(sum));
	}
	catch(Exception e)
	{
		System.out.println("Possible trouble reading stdin");
		System.out.println("Message: "+ e.getMessage());
	}			
    }
}

// eof isumit.java $Id: isumit.java 1962 2009-11-25 03:42:12Z boudreat $

