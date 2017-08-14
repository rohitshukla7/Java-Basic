/******************************************************************************
 *  Compilation:  javac DayOfWeek.java
 *  Execution:    java DayOfWeek m d y
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   09-08-2017
 *
 *  Read in the month , day , and year and print out what
 *  day of the week it falls on according to the Gregorian calendar.
 *  For M use 1 for January, 2 for February, and so forth. Outputs
 *  0 for Sunday, 1 for Monday, and so forth.
 *
 *        y0 = year - (14 - month) / 12
 *        x = y0 + y0/4 - y0/100 + y0/400
 *        m0 = month + 12 * ((14 - month) / 12) - 2
 *        d0 = (day + x + (31*m0)/12) mod 7
 *
 *
 *  % java DayOfWeek 8 2 1953      // August 2, 1953
 *  0                              // Sunday
 *
 *  % java DayOfWeek 1 1 2000      // January 1, 2000
 *  6                              // Saturday
 *
 ******************************************************************************/

public class DayOfWeek 
{
        static int month,day,year,x,y0,m0,d0;
    public static void main(String[] args) 
    { 
        month = Integer.parseInt(args[0]);
        day = Integer.parseInt(args[1]);
        year = Integer.parseInt(args[2]);
        System.out.println("Month:"+month+","+"Day:"+day+","+"Year:"+year);

        y0 = year - (14 - month) / 12;
        x = y0 + y0/4 - y0/100 + y0/400;
        m0 = month + 12 * ((14 - month) / 12) - 2;
        d0 = (day + x + (31*m0)/12) % 7;

        switch(d0)                          //switch is used to represent different outputs as days for different values of d0
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday");
                break;                

        }
    }

}
