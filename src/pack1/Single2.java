package pack1;

public class Single2 extends Single1 {
	
	void meth1() {
		super.meth1();
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
        Single2 obj=new Single2();
        obj.meth1();
        //obj.meth2();
	}

}
