package pack1;

public class PrintIntegerAndCharacter {
	void printIntChar(int num,char ch)
	{
          System.out.println("Integer : " +num);
          System.out.println("Character : "+ch);
    }
	void printIntChar(char ch,int num)
	{
          System.out.println("Character : " +ch);
          System.out.println("Integer : "+ch);
    }

	public static void main(String[] args) {
		PrintIntegerAndCharacter obj=new PrintIntegerAndCharacter();
		obj.printIntChar(7, 'A');
		obj.printIntChar('S', 5);
	}
}
