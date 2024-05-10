package pack1;

public class Shape1 { 
	void draw(int r) {
		System.out.println("Circle");
	}
	void draw(float side) {
		System.out.println("Square");
	}
	void draw(int length,int breadth) {
		System.out.println("Rectangle");
	}

	public static void main(String[] args) {
		Shape1 obj=new Shape1();
		obj.draw(0);
		obj.draw(5.2f);
		obj.draw(2,3);
		// TODO Auto-generated method stub

	}

}
