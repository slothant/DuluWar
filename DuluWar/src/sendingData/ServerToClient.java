package sendingData;

import java.io.Serializable;
import java.util.ArrayList;

//서버에서 클라이언트로 전송하는 데이터
public class ServerToClient implements Serializable {

	ArrayList<drawingInfo> ally = new ArrayList<drawingInfo>();
	
	ArrayList<drawingInfo> enemy = new ArrayList<drawingInfo>();
	
	class drawingInfo implements Serializable {
		public int X;
		public int Y;
		public int shape;
	}
}
