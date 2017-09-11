package ReadPropertiesFile;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePickerHandling {
	public static void main(String[] args) {
		String datevalue="10/09/2017";
		//.//*[contains(text(),'September 2017')]
		Date d=new Date(datevalue);
		SimpleDateFormat formater=new SimpleDateFormat("MMMM/dd/yyyy");
	String convertedDate=	formater.format(d);
	System.out.println(convertedDate);
	
	String [] monthcal=convertedDate.split("/");
	
	String month=monthcal[0]+" "+monthcal[2];
	System.out.println(month);
		
	}

}
