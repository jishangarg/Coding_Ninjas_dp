import java.util.*;
public class Main{
  
  public static int fib(int n,int[] arr)
  {
    if(n==0 || n==1)
      return 1;
    if(arr[n]!=0)
      return arr[n];
    int output=fib(n-1,arr)+fib(n-2,arr);
    arr[n]=output;
    return output;
  }
  
  public static void main(String[]args)
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n+1];
    System.out.println(fib(n,arr));
  }
}
