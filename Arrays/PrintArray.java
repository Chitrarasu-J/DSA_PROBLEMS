
import java.util.*;

class PrintArray {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}
