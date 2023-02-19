import java.util.*;

public class largestAndSmallestNumber {
    public static void main(String args[]) {
        int n, temp;
        int[] A = new int[100];
        System.out.print("how many numbers do you want to input: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Input " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] > A[j]) {
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}
