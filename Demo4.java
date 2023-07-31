public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        String DAYCOLOR = "\033[32m";
        String MONTHCOLOR = "\033[33m";
        String YEARCOLOR = "\033[34m";
        String HOURCOLOR = "\033[35m";
        String MINUTECOLOR = "\033[36m";
        String SECONDCOLOR = "\033[38m";
        String RESET = "\033[0m";

        System.out.printf("%s%s%s/%s%s%3$s/%s%s%3$s %s%s%3$s:%s%s%3$s:%s%s%3$s\n", DAYCOLOR,day,RESET,MONTHCOLOR,month,YEARCOLOR,year,HOURCOLOR,hour,MINUTECOLOR,minute,SECONDCOLOR,second);
    }
}
