import java.util.ArrayList;

/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        mainV1();
    }

    public static ArrayList<String> mainV1() {
        ArrayList<String> collector = new ArrayList<>();
        int i = 1;
        while (i < 100) {
            i = next(i, collector);
        }
        return collector;
    }

    public static ArrayList<String> mainV2() {
        ArrayList<String> collector = new ArrayList<>();
        for (int i = 1; i < 100; ++i) {
            next(i, collector);
        }
        return collector;
    }

    static <T> void printAdd(T message, ArrayList<String> list) {
        System.out.println(message);
        list.add(message.toString());
    }

    public static int next(int i, ArrayList<String> collector) {
        if (i % 3 == 0 && i % 5 == 0) {
            printAdd("FizzBuzz", collector);
            // System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            printAdd("Fizz", collector);
            // System.out.println("Fizz");
        } else if (i % 5 == 0) {
            printAdd("Buzz", collector);
            // System.out.println("Buzz");
        } else {
            printAdd(i, collector);
            // System.out.println(i);
        }
        i += 1;
        return i;
    }
}
