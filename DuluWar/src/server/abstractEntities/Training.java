package server.abstractEntities;

import server.main.EntitiesContainer;

//병사를 생산하는 건물의 상위클래스
public abstract class Training extends Building {

	protected int delayCount;
	//아군의 정보가 담긴 엔티티 컨테이너
	protected EntitiesContainer ally;

	public Training(int X, int line) {
		super(X, line);
	}
	
	//주기별로 병사를 생산
	public void perform() {
	}

	
}
