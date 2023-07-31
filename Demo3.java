public class Demo3 {
    public static void main(String[] args){
        int firstPart = 123;
        int secondPart = 456;
        int thirdPart = 7890;

        String COLOR = "\033[34m";
        String RESET = "\033[0m";

        System.out.printf("%s(%s)%s %s-%s\n", COLOR,firstPart,RESET,secondPart,thirdPart);
    }
}
