package week1day2;

public class Mobile {

	public void sendMessage() {
		System.out.println("sendMessage");
		
	}
	public void shareDocument() {
		System.out.println("shareDocument");
		
	}
	public void Call() {
		System.out.println("Call");
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.sendMessage();
		obj.shareDocument();
	}
}
