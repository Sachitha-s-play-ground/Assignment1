public class Demo6TaskA {
    public static void main(String[] args) {
        String RED = "\033[41m";
        String GREEN = "\033[42m";
        String RESET = "\033[0m";

        System.out.printf("%s[%8s%s%s%-8s]%3$s\n", RED,"5",RESET,GREEN,"0%");
    }
}