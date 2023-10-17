import java.util.Scanner;
public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Rows of 1st matrix: ");
        int n = sc.nextInt();
        System.out.print("Enter the no. of Columns of 1st matrix: ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the values of 1st matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter the no. of Rows of 2nd matrix: ");
        int p = sc.nextInt();
        System.out.print("Enter the no. of Columns of 2nd matrix: ");
        int q = sc.nextInt();
        int arr2[][] = new int[p][q];
        System.out.println("Enter the values of 2nd matrix: ");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print((arr[i][j]+arr2[i][j])+" ");
            }
            System.out.println();
        }
        System.close();
    }
}
