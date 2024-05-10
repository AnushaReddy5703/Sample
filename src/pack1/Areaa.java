package pack1;

public class Areaa {
	void Area(int length,int breadth)
	{
		System.out.println("Area of Rectangle is : "+(length*breadth));
	}
	void Area(int side)
	{
		System.out.println("Area of Square is : "+(side*side));
	}

	public static void main(String[] args) {
		Areaa obj=new Areaa();
		obj.Area(5,7);
		obj.Area(5);
		

	}

}
