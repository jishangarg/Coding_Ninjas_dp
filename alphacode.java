import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
      Scanner in=new Scanner(System.in);
      while(true){
      	String s=in.next();
        if(s.equals("0"))
          break;
        int[] arr=new int[s.length()+1];
        
        int ans=num_codes(s,arr,s.length());
        System.out.println(ans);
      }
      
	}
  
  public static int num_codes(String s,int[] arr,int size)
  {
    if(size==0)
      return 1;
    if(size==1)
      return 1;
    
    if(arr[size]!=0)
      return arr[size];
    int output=num_codes(s,arr,size-1)%1000000007;
    
    if((s.charAt(size-2)-48)*10+s.charAt(size-1)-48<=26)
    {
      output=(int)((output+num_codes(s,arr,size-2)%1000000007+(long)0)%1000000007);
    }
    arr[size]=output;
    return output;
  }

}
