package server.entities;
import server.abstractEntities.Entity;
import server.abstractEntities.Soldier;

public class Hwalr extends Soldier {

    public Hwalr(int X, int line) {
		super(X, line);
		//ȭ���� ���ݻ�Ÿ�
		range = 2;
		HP=3;
	}
    
	public void attack(){
		//Ȱ ����
		ally.add(new Arrow(X, line), line);
    }

}
