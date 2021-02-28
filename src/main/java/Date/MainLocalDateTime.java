package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MainLocalDateTime {
  public static void main(String[] args) {

//    LocalDate outToday;
//    LocalDate outYesterday;
//    LocalTime outTime;
//    LocalTime outTimePlus;
//    LocalDateTime outDateTimeToday;
//    LocalDateTime outDateTimeChange;
//    outTime = LocalTime.now();
//    outToday = LocalDate.now();
//    outYesterday = outToday.minusDays(1);
//    outYesterday = outYesterday.minusYears(20);
//    outTimePlus = outTime.plusHours(2);
//    outDateTimeToday = LocalDateTime.now();
//    outDateTimeChange = outDateTimeToday.plusHours(2).minusDays(2).plusYears(4);

    LocalDateTime exercise = LocalDateTime.of(2010,05,15,10,00,00);

    LocalDateTime exerciseOutput = exercise.plusYears(4).plusMonths(6).plusHours(13);

    System.out.println(exercise);
    System.out.println(exerciseOutput);

//    System.out.println(outToday);
//    System.out.println(outYesterday);
//    System.out.println(outTime);
//    System.out.println(outTimePlus);
//    System.out.println(outDateTimeToday);
//    System.out.println(outDateTimeChange);
  }
}
