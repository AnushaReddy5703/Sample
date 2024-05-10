package pack1;

public class Square1 extends Rectangle1 {

	void printSquare() 
	{
		super.meth1();
		System.out.println("Square is a rectangle");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square1 square=new Square1();
		square.printSquare();
		square.printRectangle();
	}

}
