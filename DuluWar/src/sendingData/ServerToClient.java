package sendingData;

import java.io.Serializable;
import java.util.ArrayList;

//�������� Ŭ���̾�Ʈ�� �����ϴ� ������
public class ServerToClient implements Serializable {

	ArrayList<drawingInfo> ally = new ArrayList<drawingInfo>();
	
	ArrayList<drawingInfo> enemy = new ArrayList<drawingInfo>();
	
	class drawingInfo implements Serializable {
		public int X;
		public int Y;
		public int shape;
	}
}
