package pack1;

public class Patterns {

	public static void main(String[] args) {
	    int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=5-i;s++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println("------------------");
		int rows=5;
		for(int i=1;i<=rows;i++)
		{
			for(int s=1;s<=5-i;s++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println("------------------");
		int m=5;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		int a=5;
		for(int i=0;i<=5;i++)
		{
		    for(int j=1;j<=5-i;j++)
		    {
			  System.out.print("*");
		    }
		    System.out.println();
		}
		System.out.println("------------------");
		int alphabet=65;
		for(int i=0;i<=5;i++) 
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print((char)(alphabet+j)+ " ");
			}
			System.out.println();
		}
	}

}
