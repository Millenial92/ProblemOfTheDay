package julyPotd;

public class Four {

        public int countSubArrayProductLessThanK(int a[], int n, int k) {
            int pro = 1;
            int count = 0;
            int r=0, l=0;

            while (r < n) {
                pro *= a[r];

                while (l < n && pro >= k) {
                    pro = pro / a[l];
                    l++;
                }

                if (pro < k)
                    count = count + (r - l + 1);

                r++;
            }

            return count;
        }

    public static void main(String[] args) {
        Four solution = new Four();
        int [] a = {1, 2, 3, 4};
        int n = 4;
        int k = 10;
        int result = solution.countSubArrayProductLessThanK(a, n, k);
        System.out.println("Number of contiguous subarrays with product less than " + k + ": " + result);
    }
    }

