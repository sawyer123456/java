import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class TestCalendar2 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入日期（格式为：2010-3-3）：");
        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine(); // 2010-3-1
        // 将输入的字符串转化成日期类
        System.out.println("您刚刚输入的日期是：" + dateString);
        String[] str = dateString.split("-");
        int year = Integer.parseInt(str[0]);
        int month = new Integer(str[1]);
        int day = new Integer(str[2]);
        Calendar c = new GregorianCalendar(year, month - 1, day); // Month:0-11
     
        c.set(Calendar.DATE, 1);
        int dow = c.get(Calendar.DAY_OF_WEEK); // week:1-7 日一二三四五六
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int i = 0; i < dow - 1; i++) {
            System.out.print("\t");
        }
        int maxDate = c.getActualMaximum(Calendar.DATE);
        for (int i = 1; i <= maxDate; i++) {
            StringBuilder sBuilder = new StringBuilder();
            if (c.get(Calendar.DATE) == day) {
                sBuilder.append(c.get(Calendar.DATE) + "*\t");
            } else {
                sBuilder.append(c.get(Calendar.DATE) + "\t");
            }
            System.out.print(sBuilder);       
 
            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.print("\n");
            }
            c.add(Calendar.DATE, 1);
        }
    }
}