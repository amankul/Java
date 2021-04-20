package main.algorithmic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.StringTokenizer;

public class DateTimeStringSpilt {

  public static void main(String[] args) throws ParseException {

  String dateTime = LocalDateTime.now().toString();
  System.out.println(dateTime);

    String[] date1 = dateTime.split("-");
    System.out.println("YEAR is " + date1[0] + "\n" + "MONTH is " + date1[1] + "\n" ) ;

    StringTokenizer st = new StringTokenizer(dateTime.substring(dateTime.indexOf("T")+1),":");                  // Splits time into tokens
    System.out.println("HOUR is " + st.nextToken(":"));
    System.out.println("MINUTE is " + st.nextToken(":"));


    Date date = new Date();
    System.out.println(date);
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm a");

//    Date date = formatter.parse(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm a")));

    String strDate = formatter.format(date);
    System.out.println(strDate);

}

}