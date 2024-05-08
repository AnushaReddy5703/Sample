package pack1;

public class Rectangle {
	int length;
	int breadth;
	
	Rectangle(int length,int breadth)
	{
		System.out.println(length*breadth);
		/*this.length=length;
		this.breadth=breadth;*/
		
	}
	int area() {
		return length*breadth;
	}

	public static void main(String[] args) {
		
		Rectangle rectangle1=new Rectangle(4,5);
       // System.out.println("Area of rectangle1 is :" +(rectangle1.area()));
        Rectangle rectangle2=new Rectangle(5,8);
        //System.out.println("Area of rectangle1 is :" +(rectangle2.area()));
	}

}
