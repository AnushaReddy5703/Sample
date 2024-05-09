package pack1;

public class Main {

	public static void main(String[] args) {
		
		ParentClass pobj=new ParentClass();
		ChildClass cobj=new ChildClass();
		pobj.parent(); 
        cobj.child();   
        cobj.parent();

	}

}
