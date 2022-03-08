package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configreader
{
public Properties prop;

/*
 * This will read the property file
 */
public Properties init_prop()
{
	prop=new Properties();
		try {
			FileInputStream fip=new FileInputStream("/Users/timmegowdashekar/eclipse-workspace/CucumberPOMSeries/src.test.resource/config/config.properties");
			
				prop.load(fip);	
			
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
