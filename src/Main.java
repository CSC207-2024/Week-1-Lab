public class Main {
    public static void main(String[] args) {
//        FizzBuzz.next(5);
        FizzBuzz.main(args);
        // or
//        FizzBuzz.main(new String[0]);
        assert FizzBuzz.mainV1().equals(FizzBuzz.mainV2());
    }
}[]