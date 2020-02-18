package keyworddrivenframework;

import java.io.FileInputStream;
import java.util.Properties;

public class KeywordMainClass {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("./data1/commonData.property");
	Properties prop=new Properties();
	prop.load(fis);
}
}
