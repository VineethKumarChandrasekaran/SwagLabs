package com.ecommerce.generic.fileutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Gaurav Singh
 */
public class FileUtility {
	public String getDataFromPropertyFile(String key) throws IOException {
		FileInputStream file = new FileInputStream("./src/test/resource/swaglabs.properties");
		Properties properties = new Properties();
		properties.load(file);
		return properties.getProperty(key);
	}

}
