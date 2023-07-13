import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class LatinSquare_Check {
    public static boolean checkLatin(char[][] m, int n) {
        int k, l;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (k = j + 1, l = i + 1; k < n && l < n; k++, l++) {
                    if (m[i][j] == m[i][k] || m[i][k] > (65 + n -1)) {
                        if (m[i][k] > (65 + n-1)) {
                            System.out.println("Wrong input:the letters must be from A to " + (char) (65 + n - 1));
                            return false;
                        }
                        System.out.println("Wrong input:the letters must be from A to " + (char) (65 + n - 1));
                        return false;
                    }
                    if (m[l][j] > (65 + n-1) || m[i][j] == m[l][j]) {
                        if (m[l][j] > (65 + n-1)) {
                            System.out.println("Wrong input:the letters must be from A to " + (char) (65 + n - 1));
                            return false;
                        }
                        System.out.println("Wrong input:the letters must be from A to " + (char) (65 + n - 1));
                        return false;
                    }
                }
            }
        }
        System.out.println("The input array is a latin square");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] m = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.next().charAt(0);
            }
        }
        checkLatin(m, n);

    }
}