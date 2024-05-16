public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int ctr = 0;
        while (num > 0) {
            num = next(num);
            ++ctr;
        }
        assert num == 0;
        System.out.println(ctr);
    }

    static int next(int x) {
        return x % 2 == 0 ? x / 2 : x - 1;
    }
}
