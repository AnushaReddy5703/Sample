package pack1;

public class Multi3 extends Multi2 {
	void meth3() {
		System.out.println("This is grand child");
	}

	public static void main(String[] args) {
		Multi3 obj=new Multi3();
        obj.meth1();
        obj.meth2();
        obj.meth3();
	}

}
