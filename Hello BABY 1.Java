import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = sc.nextInt();
        System.out.println("Nhập m:");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Nhập giá trị cho arr[%d][%d]:", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Hiển thị mảng vừa nhập");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%8d", arr[i][j]);
            }
            System.out.println();
        }
    }
}