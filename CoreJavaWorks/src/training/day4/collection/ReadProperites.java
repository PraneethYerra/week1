package training.day4.collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperites {
public static void main(String[] args) throws FileNotFoundException, IOException {
	Properties prop = new Properties();
	
	
	prop.load(new FileReader("d.properties"));

System.out.println("User name"+prop.getProperty("username"));

System.out.println("User name"+prop.getProperty("password"));

System.out.println("User name"+prop.getProperty("db"));

}
	
	
	
	
}
