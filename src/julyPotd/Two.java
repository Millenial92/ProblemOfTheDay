package julyPotd;


    public class Two {
        public static int setSetBit(int X, int Y, int L, int R) {

            int mask = ((1 << (R - L + 1)) - 1) << (L - 1);

            X = X & (~mask);
            int setBits = Y & mask;

            // Copy the set bits from Y to X
            X = X | setBits;

            return X;
        }

        public static void main(String[] args) {
            int X = 44, Y = 3, L = 1, R = 5;
            System.out.println(setSetBit(X, Y, L, R));

            X = 16; Y = 2; L = 1; R = 3;
            System.out.println(setSetBit(X, Y, L, R));
        }
    }

