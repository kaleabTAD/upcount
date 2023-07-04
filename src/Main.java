public class Main {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, -6, 8, -3, -1, 2};
        System.out.println(upcount(a, 5));
    }

    public static int upcount(int[] a, int n) {
        int PreviousPartialsum = 0;
        int PartialSum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            PreviousPartialsum = PartialSum;
            PartialSum = PartialSum + a[i];
            if (PreviousPartialsum <= n && PartialSum > n ) {
                count++;
            }
        }
        return count;
    }
}
