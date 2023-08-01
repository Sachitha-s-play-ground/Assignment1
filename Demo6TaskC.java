public class Demo6TaskC {
    public static void main(String[] args) {
        String GREENCOLOR = "\033[32m";
        String PINKCOLOR = "\033[95m";
        String YELLOWCOLOR = "\033[33m";
        String BOLD = "\033[1m";
        String RESET = "\033[0m";

        String line1 = "-----------------";
        String line2 = "-------------";
        String devider= YELLOWCOLOR+"|"+RESET;

        String title1 = BOLD+" CITY"+RESET;
        String title2 = BOLD+" STATE"+RESET;
        String title3 = BOLD+" POPULATION"+RESET;

        String city1 = " Los Angeles";
        String city2 = GREENCOLOR+"New"+RESET+" York";

        String state1 = " California";
        String state2 = GREENCOLOR+"New"+RESET+" York";

        int population1 = 3966936;
        int population2 = 8336817;

        System.out.printf("%s+%s+%s+%3$s+%s\n", YELLOWCOLOR,line1,line2,RESET);
        System.out.printf("%s%-25s%1$s%-21s%1$s%-21s%1$s\n", devider,title1,title2,title3);
        System.out.printf("%s+%s+%s+%3$s+%s\n", YELLOWCOLOR,line1,line2,RESET);
        System.out.printf("%s%-17s%1$s%-13s%1$s%s%,12d %s%1$s\n", devider,city1,state1,PINKCOLOR,population1,RESET);
        System.out.printf("%s+%s+%s+%3$s+%s\n", YELLOWCOLOR,line1,line2,RESET);
        System.out.printf("%s%-26s%1$s%-22s%1$s%s%,12d %s%1$s\n", devider,city2,state2,PINKCOLOR,population2,RESET);
        System.out.printf("%s+%s+%s+%3$s+%s\n", YELLOWCOLOR,line1,line2,RESET);

    }
}
