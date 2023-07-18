public class Array {

    public static void main(String[] args) {

        int a[] = { 10, 20, 30, 40, 50 };
        int b[] = { 60, 70, 80, 90, 100 };
        int sum[] = new int[5];

        for (int i = 0; i < sum.length; i++) {

            sum[i] = a[i] + b[i];
        }

        for (int i = 0; i < sum.length; i++) {

            System.out.println(sum[i]);
        }

    }
}