
import java.util.Scanner;

public class MaximumElement {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int max = a[0];
        for (int i = 1; i < size; i++) {
            max = Math.max(max, a[i]);
        }
        System.out.print(max);
    }

}
