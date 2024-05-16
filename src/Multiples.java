public class Multiples {
    public static void main(String[] args) {
        int ctr = 0;
        for (int i = 1; i < 1000; ++i) {
            if (isMultiple(i)) {
                ++ctr;
            }
        }
        System.out.println(ctr);
    }

    static boolean isMultiple(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
