package server.entities;
import server.abstractEntities.Entity;
import server.abstractEntities.Soldier;

public class Hwalr extends Soldier {

    public Hwalr(int X, int line) {
		super(X, line);
		//화르의 공격사거리
		range = 2;
		HP=3;
	}
    
	public void attack(){
		//활 생성
		ally.add(new Arrow(X, line), line);
    }

}
