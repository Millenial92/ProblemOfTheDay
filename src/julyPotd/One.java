package julyPotd;

public class One {
    public static int setBits(int N) {
        int count = 0;
        while (N > 0) {
            N = N & (N - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(setBits(6)); // Output: 2
        System.out.println(setBits(8)); // Output: 1
    }
}

