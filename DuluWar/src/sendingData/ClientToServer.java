package sendingData;

import java.io.Serializable;

//Ŭ���̾�Ʈ���� ������ �����ϴ� ������
public class ClientToServer implements Serializable {

	public int X;
	public int Y;
	public int command; //1~4 : Q~R
	
}