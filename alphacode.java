import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
      Scanner in=new Scanner(System.in);
      while(true){
      	String s=in.next();
        if(s.equals("0"))
          break;
        int flag=0;
        
        int ans=0;
        
          int[] arr=new int[s.length()+1];

          //ans=num_codes(s,arr,s.length());
          ans=num_codes2(s,s.length());
        
        
        System.out.println(ans);
      }
      
	}
	
	public static int num_codes2(String s,int size)
	{
		int[] output=new int[size+1];
		output[0]=1;
		output[1]=1;
		for(int i=2;i<=size;i++)
		{
          if(s.charAt(i-1)!='0')
			output[i]=output[i-1];
		  if((s.charAt(i-2)-48)*10+s.charAt(i-1)-48<=26 && (s.charAt(i-2)-48)*10+s.charAt(i-1)-48>=10)
			output[i]=(int)((output[i]+output[i-2]%1000000007+(long)0)%1000000007);
		}
		return output[size];
	}
	
  
//   public static int num_codes(String s,int[] arr,int size)
//   {
//     if(size==0)
//       return 1;
//     if(size==1)
//       return 1;
    
//     if(arr[size]!=0)
//       return arr[size];
//     int output=0;
//     if(s.charAt(size-1)>'0')
//     	output=num_codes(s,arr,size-1)%1000000007;
   
//     if((s.charAt(size-2)-48)*10+s.charAt(size-1)-48<=26 && (s.charAt(size-2)-48)*10+s.charAt(size-1)-48>=10)
//     {
//       output=(int)((output+num_codes(s,arr,size-2)%1000000007+(long)0)%1000000007);
//     }
    
//     arr[size]=output;
//     return output;
//   }

}
