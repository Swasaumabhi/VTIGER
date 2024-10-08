package genericUtility;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	//Generate Random Number
public int GetRandomNumber() {
	Random random=new Random();
	int r = random.nextInt(5000);
	return r;
}
//Get System Date
public String GetSystemDateyyyyMMdd() {
	Date dateobj=new Date();
	SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
	
	 String date = sim.format(dateobj);
	 return date;
	
}
//Get Required Date

public String GetRequiredDateyyyyMMdd(int days) {
	Date dateobj=new Date();
	SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
	sim.format(dateobj);
	Calendar cal = sim.getCalendar();
	
	 cal.add(Calendar.DAY_OF_MONTH, days);
	String reqdate = sim.format(cal.getTime());
	return reqdate;
	 
}


}
