import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class Canlender {
public static void main(String[] args) {
	
	Random ran =new Random();
	
//	Scanner sc =new Scanner(System.in); //console 输入数据
//	String str =sc.nextLine();
//	System.out.println(str);
	
	System.out.println(Math.pow(2, 10)); //pow(2,10) 是2的10次方
	System.out.println("*******"+10+ran.nextInt(10));
	
	
	Calendar calendar =new GregorianCalendar(2019,12,1,12,15);
	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH);
	System.out.println(year);
	System.out.println(month);
	System.out.println(Calendar.WEEK_OF_MONTH);
	System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
	calendar.add(Calendar.YEAR,-100); //时间减100年
	System.out.println(calendar.get(Calendar.YEAR));
}
}
