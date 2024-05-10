package pack1;

public class SecondSubClass extends Parent {
	void message()
	{
		System.out.println("This is second class");
	}
	public static void main(String[] args) {
		SecondSubClass obj1=new SecondSubClass();
		obj1.message();
		FirstSubClass obj2=new FirstSubClass();
		obj2.message();
		
	}

}
