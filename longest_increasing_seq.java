import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt(); 
    }
    System.out.println(lis(arr,n));
  }
    public static int lis(int[] input,int n)
    {
      int output[]=new int[n];
      output[0]=1;
      for(int i=1;i<n;i++)
      {
        output[i]=1;
        for(int j=i-1;j>=0;j--)
        {
          if(input[j]<input[i] && output[j]>=output[i])
          {
            output[i]=output[j]+1;
          }
        }
      }
      
      int max=0;
      for(int i=0;i<n;i++)
      {
        if(output[i]>max)
          max=output[i];
      }
      
      return max;
    }
  
}
