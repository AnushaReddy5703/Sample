package pack1;

public class Subclass extends A {
	void a_method() {
		System.out.println("This is abstract method");
	}
	public static void main(String[]args) {
		Subclass obj=new Subclass();
		obj.a_method();
		obj.meth1();
	}

}
