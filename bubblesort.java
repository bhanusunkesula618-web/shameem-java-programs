//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        int n, i, j, temp;
        int a[] = new int[20];
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter total number of elements:");
        n = Sc.nextInt();
        System.out.println("Enter elements:");
        for (i = 0; i < n; i++) {
            a[i] = Sc.nextInt();
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (a[i] > a[j]) {
                        temp = a[j];
                        a[j] = a[i + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            System.out.println("the sorted elements are:");
            for (i = 0; i < n; i++) {
                System.out.print("\t" + a[i]);
            }
        }
    }
}