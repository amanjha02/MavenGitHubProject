package ReadPropertiesFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesfile {
public static void main(String[] args) throws FileNotFoundException, IOException {
	System.out.println(System.getProperty("user.dir"));
	Properties prop=new Properties();
	File file=new File(System.getProperty("user.dir")+"\\OR.properties");
	FileReader reader=new FileReader(file);
	prop.load(new FileReader(file));
	
	System.out.println(prop.getProperty("name"));
}
}
