
    import java.util.Scanner;

    public class arraySum {
        static int sum = 0;

        public static void main(final String[] args) {
             int a[] = new int[5];
            System.out.println("Enter all the 5  elements of array:");
            for (int i = 0; i < 5; i++) {
                a[i] = new Scanner(System.in).nextInt();
            }
            for (int i = 0; i < 5; i++) {
                sum = sum + a[i];

        }

        System.out.print("sum of all number: "+sum);
    }
}
