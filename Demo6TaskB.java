public class Demo6TaskB {
    public static void main(String[] args) {
        String title1 = " NAME";
        String title2 = "AGE ";
        String name1 = " Alice";
        String name2 = " Bob";
        String line1 = "-----------------";
        String line2 = "-----";
        
        int age1 = 24;
        int age2 = 30;

        String BLUECOLOR = "\033[34m";
        String PINKCOLOR = "\033[95m";
        String YELLOWCOLOR = "\033[33m";
        String BOLD = "\033[1m";
        String RESET = "\033[0m";

        System.out.printf("%s+%17s+%5s+%s\n", YELLOWCOLOR,line1,line2,RESET);
        System.out.printf("%s|%s%s%s%-17s%2$s%2$s%1$s|%2$s%3$s%4$s%5s%2$s%2$s%1$s|%2$s\n", YELLOWCOLOR,RESET,BOLD,BLUECOLOR,title1,title2);
        System.out.printf("%s+%17s+%5s+%s\n", YELLOWCOLOR,line1,line2,RESET);
        System.out.printf("%s|%s%-17s%1$s|%2$s%s%4s %2$s%1$s|%2$s\n", YELLOWCOLOR,RESET,name1,PINKCOLOR,age1);
        System.out.printf("%s|%s%-17s%1$s|%2$s%s%4s %2$s%1$s|%2$s\n", YELLOWCOLOR,RESET,name2,PINKCOLOR,age2);
        System.out.printf("%s+%17s+%5s+%s\n", YELLOWCOLOR,line1,line2,RESET);
    }
}
