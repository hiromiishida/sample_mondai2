public class Main {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(84));
    }

    private static String fizzBuzz(int num) {
        String result;
        if (num % 3 == 0 && num % 5 == 0) {
            result = "3と5で割り切れる";
        } else if (num % 3 == 0) {
            result = "3で割り切れる";
        } else if (num % 5 == 0) {
            result = "5で割り切れる";
        } else {
            result = "3でも5でも割り切れない";
        }

        return result;
    }
}