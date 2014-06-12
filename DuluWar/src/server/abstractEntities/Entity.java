package server.abstractEntities;

import server.main.EntitiesContainer;

//모든 엔티티들을 감싸는 상위 클래스
public abstract class Entity {
	//엔티티의 위치 좌표.
	public int X;
	//자신이 위치한 줄. 위에서부터 0이 들어가며 가장 아래 라인이 4
	protected int line;
	//엔티티의 체력
	public int HP;
	protected EntitiesContainer ally;
	
	public Entity(int X, int line){
		this.X = X;
		this.line = line;
	}
	
	public abstract void perform();
	
	public void minusHP(){
		if(HP<=0){
			ally.remove(this,line);
		}
	}

	
}
