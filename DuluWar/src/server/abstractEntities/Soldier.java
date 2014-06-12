package server.abstractEntities;

import server.main.EntitiesContainer;

//병사들을 감싸는 상위 클래스.
public abstract class Soldier extends Entity {

	//적군에 대한 인식 사거리
	protected int range;
	//이동 속도
	protected int speed;
	//슬로우에 당했을 때, 그 지속 시간
	public int slowCount;
	//공격 후 경직 시간
	protected int delayCount;

	//적군의 정보가 담긴 엔티티 컨테이너
	protected EntitiesContainer enemyContainer;


	public Soldier(int X, int line) {
		super(X, line);
	}
	
	//적의 위치를 파악하여 공격할 지 이동할 지 결정.
	public void perform() {
		
		if(delayCount == 0){
			for(Entity enemy : enemyContainer.getSoldier(line)){
				if(range > enemy.X - X){
					attack();
					
					return;
				}
			}
			
			for(Entity enemy : enemyContainer.getBuilding(line)){
				if(range > enemy.X - X){
					attack();
					
					return;
				}
			}
			
			
			move();
		} else
			delayCount--;
		}


	//이동
	protected void move() {
		//스피드의 값만큼 움직인다.
		X += speed;
	}


	//적이 사거리 안에 들어와 있다면 공격
	protected abstract void attack();
	

}
