package BasicCode_03常用API;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Q34_输出某一年的各个月份的天数_Calendar {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int year = console.nextInt();

        //write your code here......
        Calendar c = Calendar.getInstance();
        for (int month = 1; month <= 12; month++) {
            c.set(year, month, 0);
            System.out.println(year + "年" + month + "月:" + c.get(c.DAY_OF_MONTH) + "天");
            //System.out.println(year + "年" + month + "月:" + LocalDate.of(year,month,1).lengthOfMonth() + "天");
        }

    }
}