package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	private static Properties properties;
	private final String propertyFilePath = "./Configurations/config.properties";

	public ReadConfig() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null) {
			return url;
		} else {
			throw new RuntimeException("url not specified in the Configuration.properties file.");
		}
	}

	public String getBrowser() {
		String br = properties.getProperty("browser");
		if (br != null) {
			return br;
		} else {
			throw new RuntimeException("browser not specified in the Configuration.properties file.");
		}
	}

	public String getChromeDriverPath() {
		String driverPath = properties.getProperty("chromeDriverPath");
		if (driverPath != null) {
			return driverPath;
		} else {
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
		}
	}

	public String getFirefoxDriverPath() {
		String driverPath = properties.getProperty("firefoxDriverPath");
		if (driverPath != null) {
			return driverPath;
		} else {
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
		}
	}

}