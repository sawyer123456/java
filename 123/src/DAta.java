import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DAta {
public static void main(String[] args) throws ParseException {
	
	
	DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
	String str =df.format(new Date(5555555));
	String str2 =df.format(new Date());
	DateFormat str3 = new SimpleDateFormat("D"); //今年第多少天
	Date date =df.parse("1938-05-16");
	
	System.out.println(str3.format(new Date()));
	System.out.println(date);
	System.out.println(str);
	System.out.println(str2);
	
}
}
