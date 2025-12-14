package presentation_class_day4;

import java.util.Scanner;

public class SmallestDigit {
	public static int VerifySmallest(int num,int N)
	{
		int res=0;
		int count=0;
		for(int i=0; i<=9; i++)
		{
			int temp=num;
			boolean found=false;
			while(temp!=0)
			{
				int rem=temp%10;
				if(rem==i)
				{
					found=true;
					break;
					
				}
				
				temp=temp/10;
			}
			if(found)
			{
				count++;
			}
		
		if(count==N)
		
			return i;
		
		}
		return 0;

	
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println("enter N value:");
		int N=sc.nextInt();
		System.out.println(VerifySmallest(num,N));
	}

}
