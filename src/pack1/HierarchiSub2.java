package pack1;

public class HierarchiSub2 extends HierarchiMain{
	void msg2() {
		System.out.println("msg2");
	}

	public static void main(String[] args) {
		HierarchiSub1 obj1=new HierarchiSub1();
		obj1.msg();
		obj1.msg1();
		HierarchiSub2 obj2=new HierarchiSub2();
		obj2.msg();
		obj2.msg2();
		
		// TODO Auto-generated method stub

	}

}
