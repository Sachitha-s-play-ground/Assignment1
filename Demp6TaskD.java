public class Demp6TaskD {
    public static void main(String[] args) {
        String BLUECOLOR = "\033[34m";
        String GREENCOLOR = "\033[32m";
        String PINKCOLOR = "\033[95m";
        String YELLOWCOLOR = "\033[33m";
        String BOLD = "\033[1m";
        String RESET = "\033[0m";

        String line1 = YELLOWCOLOR+"----------"+RESET;
        String line2 = YELLOWCOLOR+"-------"+RESET;
        String GreenLine1 = GREENCOLOR+"----------"+RESET;
        String GreenLine2 = GREENCOLOR+"-------"+RESET;
        String devider1= YELLOWCOLOR+"+"+RESET;
        String devider2= YELLOWCOLOR+"|"+RESET;

        String title1 = BOLD+" ITEM"+RESET;
        String title2 = BOLD+" QUANTITY"+RESET;
        String title3 = BOLD+" PRICE"+RESET;

        String item1 = " Apples";
        String item2 = " Oranges";

        String quantity1 = BLUECOLOR+"5 "+RESET;
        String quantity2 = BLUECOLOR+"10 "+RESET;

        String price1 = GREENCOLOR+"$"+RESET+PINKCOLOR+"0.99 "+RESET;
        String price2 = GREENCOLOR+"$"+RESET+PINKCOLOR+"1.49 "+RESET;

        System.out.printf("%s%s%1$s%2$s%1$s%s%1$s\n", devider1,line1,line2);
        System.out.printf("%s%-18s%1$s%-18s%1$s%-15s%1$s\n", devider2,title1,title2,title3);
        System.out.printf("%s%s%1$s%s%1$s%s%1$s\n", devider1,GreenLine1,line1,GreenLine2);
        System.out.printf("%s%-10s%1$s%19s%1$s%25s%1$s\n", devider2,item1,quantity1,price1);
        System.out.printf("%s%-10s%1$s%19s%1$s%25s%1$s\n", devider2,item2,quantity2,price2);
        System.out.printf("%s%s%1$s%s%1$s%s%1$s\n", devider1,GreenLine1,line1,GreenLine2);








    }
}
