package sendingData;

import java.io.Serializable;

//클라이언트에서 서버로 전송하는 데이터
public class ClientToServer implements Serializable {

	public int X;
	public int Y;
	public int command; //1~4 : Q~R
	
}