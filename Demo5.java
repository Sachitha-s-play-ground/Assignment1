public class Demo5 {
    public static void main(String[] args) {
        int firstPart = 978;
        int secondPart = 3;
        int thirdPart = 16;
        int fourthPart = 1484100;

        String COLOR1 = "\033[32m";
        String COLOR2 = "\033[33m";
        String COLOR3 = "\033[34m";
        String COLOR4 = "\033[35m";
        String RESET = "\033[0m";

        System.out.printf("%s%s%s-%s%s%3$s-%s%s%3$s-%s%s%3$s\n", COLOR1,firstPart,RESET,COLOR2,secondPart,COLOR3,thirdPart,COLOR4,fourthPart);
    }
}
