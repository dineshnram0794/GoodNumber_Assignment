   import java.util.Scanner;

   public class GoodNumberOrNot
   {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);          //Here We use Scanner Class for take Input from User....
		System.out.print("Enter any Number: ");
		int n = sc.nextInt();                       //For Check Number Weather it is good or not......
		
		System.out.print("Enter divisible(a) value: ");
		int a=sc.nextInt();                         //for Divisible Number....
		
		boolean found=false;
		int x=n;                                    //Here X Assign of N Value for further Purpose.......
		while(n!=0)                                 //use while loop for check the given number is not zero
		{
			int digit=n%10;                         //Here One by One Given Number of digit Assign 
			if(digit==a)                            //Check One by One digit to contain Divisible Value or not in given number
			{
				System.out.println("\n N="+x+", Answer: false (contain "+a+") means "+x+" is not a Good Number.........1427");
				 found=true;
				 break;
			}
			n=n/10;
		}
		if(!found)
		{
		
			if(x%a==0)                               //check condition the given number is divisible or not 
			{
				System.out.println("\nN="+x+", Answer: true , means "+x+" is a Good Number........");
			}
			else
			{
				System.out.println("\n N="+x+", Answer: false (not divisible by "+a+") means "+x+" is not a Good Number........");
			}
			
		}
	}

   }
