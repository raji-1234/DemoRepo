package keyworddrivenframework;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GenericKeyword {
public static String getKeyPropValue(String propPath,String key) throws IOException
{
	FileInputStream fis = new FileInputStream("./data1/commonData.property");
	Properties prop = new Properties();
	prop.load(fis);
	String propValue=prop.getProperty(key, "key not found");
	return propValue;
}


}
//public static String getKeyPropValue(String propertyPath, String key) {
//	// TODO Auto-generated method stub
//	return null
//}
//}
