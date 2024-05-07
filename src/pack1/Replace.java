package pack1;

public class Replace {

	public static void main(String[] args) {
		String message = "That was great - lol";
		String replacedMessage=message.replaceAll("lol","laugh out loud");
		
        System.out.println(replacedMessage);
	}

}
