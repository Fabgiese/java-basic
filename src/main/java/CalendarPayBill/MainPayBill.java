package CalendarPayBill;

import jdk.jshell.Snippet;

import java.util.Calendar;
import java.util.Scanner;

public class MainPayBill {
  public static void main(String[] args) {

    Calendar calendar = Calendar.getInstance();
    Scanner scn = new Scanner(System.in);

    System.out.println("Qual o dia de vencimento do boleto?");
    int day = scn.nextInt();
    System.out.println("Qual o mês de vencimento do boleto?");
    int month = scn.nextInt() - 1;
    System.out.println("Qual o ano de vencimento do boleto?");
    int year = scn.nextInt();

    calendar.set(year,month,day);
    calendar.add(calendar.DAY_OF_MONTH, 10);

    if((calendar.get(calendar.DAY_OF_WEEK) == 1) || (calendar.get(calendar.DAY_OF_WEEK) == 7)){
      calendar.add(calendar.DAY_OF_MONTH,1);
      if(calendar.get(calendar.DAY_OF_WEEK) == 1) {
        calendar.add(calendar.DAY_OF_MONTH,1);
      }
    }

    System.out.println(String.format("O dia de para pagar é %d/%d/%d", calendar.get(calendar.DATE),calendar.get(calendar.MONTH ) + 1, calendar.get(calendar.YEAR)));
  }
}
