package amazon;

import java.io.File;
import java.util.Date;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	String s= System.getProperty("user.dir")+"\\src\\test\\resources\\property.properties";
	  //  System.out.println(s);
		Date d= new Date();
		String c="D://"+d.toString().replaceAll(":","-");
		File f=new File(c);
		f.mkdir();
		
	}

}
