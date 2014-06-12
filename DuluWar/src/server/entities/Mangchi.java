package server.entities;
import server.abstractEntities.Soldier;

public class Mangchi extends Soldier {

    public Mangchi(int X, int line) {
		super(X, line);
		//망치이의 공격사거리
		range = 0;
		HP=3;
	}

	public void attack(){
		//망치 생성
		ally.add(new Hammer(X, line), line);
    }


}
