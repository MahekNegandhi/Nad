import java.util.Scanner;
public class GaussElimination
{
  public static int[][] input()
  {
    System.out.println("Enter n:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[n][n+1];
    System.out.println("Enter Array:");
    for(int i=0;i<n;i++)
      for(int j=0;j<n+1;j++)
         a[i][j] = sc.nextInt();
    return a;
  }
  public static void main(String[] args)
  {
     int[][] a = input();
     int k,sum;
     for(int i=0;i<a.length;i++)
     {
       System.out.println("");
       for(int j=0;j<a[i].length;j++)
           System.out.print(" "+a[i][j]);
     }
     int n = a.length;
     int[] x = new int[n];
     for(int i = 0;i<= n-2;i++)
       for(int j = i+1;j<=n-1;j++)
     {
       k = a[j][i] / a[i][i];
       for(int z = j-1;z<=n;z++)
         a[j][z] = a[j][z] - ( k * a[i][z] );
  }
     for(int i=0;i<a.length;i++)
     {
       System.out.println("");
       for(int j=0;j<a[i].length;j++)
           System.out.print(" "+a[i][j]);
     }
     System.out.println("Yaaha tk chala");
     x[n-1] = a[n-1][n]/a[n-1][n-1];
      System.out.println("Yaaha tk chala");
     for(int i=n-2;i>=1;i--)
     {
       sum = 0;
       for(int j=i+1;j<=n-1;j++)
          sum = sum + a[i][j] * x[j];
       x[i] = (a[i][n] - sum) / a[i][i]; 
     }
     System.out.println("Yaaha tk chala");
     for(int j=0;j<n;j++)
           System.out.println(x[j]);
  }
}
