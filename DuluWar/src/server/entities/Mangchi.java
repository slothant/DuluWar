package server.entities;
import server.abstractEntities.Soldier;

public class Mangchi extends Soldier {

    public Mangchi(int X, int line) {
		super(X, line);
		//��ġ���� ���ݻ�Ÿ�
		range = 0;
		HP=3;
	}

	public void attack(){
		//��ġ ����
		ally.add(new Hammer(X, line), line);
    }


}
