package presentation_class_day4;

import java.util.Scanner;

public class SumOfPrimeArray {
	public static boolean isPrime(int num)
	{
		int count=0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
			return true;
		else
		return false;
	}
	public static int[] verifyArray(int[] arr)
	{
		int count=0;
		int index=0;
		for(int i=0; i<arr.length; i++)
		{
			if(isPrime(arr[i]))
			{
				count++;
			}
		}
		int primeArray[]=new int[count];
		for(int i=0; i<arr.length; i++)
		{
		if(isPrime(arr[i]))
		{
			
			primeArray[index++]=arr[i];
		}
		}
		return primeArray;
	}
	public static int sumArray(int []arr)
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void printArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in );
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements of array"+size);
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int primeArray[]=verifyArray(arr);
		printArray(primeArray);
		int sumArray=sumArray(primeArray);
		System.out.println("sum of primeArray:");
		System.out.println(sumArray);
		
	}
}
