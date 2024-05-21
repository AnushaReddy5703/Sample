package pack1;

public interface InterfaceWithDefault {
	default void meth1()
	{
		System.out.println("I'm default method");
	}
	static void meth2()
	{
		System.out.println("I m static method");
	}

}
