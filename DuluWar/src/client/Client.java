package client;
//���μ��̰� �����Ͽ� ȭ���� ����ϴ� Ŭ����
public class Client {

	public Client() {
		ClientNetwork network = new ClientNetwork(this);
	}
	
	public void paint() {
		System.out.println("Ŭ���̾�Ʈ PAINT ���");
	}
	
	public static void main(String args) {
		new Client();
	}
}
