package presentation_class_day4;

import java.util.Scanner;

public class MergeArray {
	public static int[] MergeArray(int[] a,int [] b)
	{
		int c[]=new int[a.length+b.length];
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			c[a.length+i]=b[i];
		}
		return c;
	}

	public static void printArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size1");
		int size1=sc.nextInt();
		int a[]=new int[size1];
		System.out.println("enter array size2");
		int size2=sc.nextInt();
		int b[]=new int[size2];
		System.out.println("enter array a elements"+size1);
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter array b elements:"+size2);
		{
			for(int i=0; i<b.length; i++)
			{
				b[i]=sc.nextInt();
			}
		}
		int c[]=MergeArray(a,b);
		printArray(c);
	}
}
