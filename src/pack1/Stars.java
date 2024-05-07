package pack1;

public class Stars {

	public static void main(String[] args) {
		for(int i=3;i>=1;i--)
		{
			for(int s=1;s<=3-i;s++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
		
		System.out.println();
	    }
		for(int i=1;i<=2;i++)
        {
                 for(int s=1; s<=2-i;s++)
                 {
                       System.out.print(" ");
                 }
                 for(int j=1;j<=i*2+1;j++)
                 {
                       System.out.print("*");
                 }
           System.out.println();
        } 

	}

}
