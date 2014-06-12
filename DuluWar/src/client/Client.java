package client;
//프로세싱과 연동하여 화면을 출력하는 클래스
public class Client {

	public Client() {
		ClientNetwork network = new ClientNetwork(this);
	}
	
	public void paint() {
		System.out.println("클라이언트 PAINT 출력");
	}
	
	public static void main(String args) {
		new Client();
	}
}
