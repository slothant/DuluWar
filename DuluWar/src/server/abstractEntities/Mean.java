package server.abstractEntities;

import server.main.EntitiesContainer;

//공격 수단. 망치나 화살 등. 적과 충돌하여 피해를 입힘
public abstract class Mean extends Entity {

	// 이미 다른 대상에게 피해를 입혔는지 여부. 피해를 입힌 적이 있다면 더이상 피해를 주지 않고 사라짐.
	protected boolean used;
	
	// 적군의 정보가 담긴 엔티티 컨테이너
	protected EntitiesContainer enemyContainer;

	public abstract void perform();

	public Mean(int X, int line) {
		super(X, line);
	}
	//아군의 체력 감소
	public abstract void minusHP();

	
}
