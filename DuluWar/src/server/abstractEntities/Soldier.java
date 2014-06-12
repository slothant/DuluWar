package server.abstractEntities;

import server.main.EntitiesContainer;

//������� ���δ� ���� Ŭ����.
public abstract class Soldier extends Entity {

	//������ ���� �ν� ��Ÿ�
	protected int range;
	//�̵� �ӵ�
	protected int speed;
	//���ο쿡 ������ ��, �� ���� �ð�
	public int slowCount;
	//���� �� ���� �ð�
	protected int delayCount;

	//������ ������ ��� ��ƼƼ �����̳�
	protected EntitiesContainer enemyContainer;


	public Soldier(int X, int line) {
		super(X, line);
	}
	
	//���� ��ġ�� �ľ��Ͽ� ������ �� �̵��� �� ����.
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


	//�̵�
	protected void move() {
		//���ǵ��� ����ŭ �����δ�.
		X += speed;
	}


	//���� ��Ÿ� �ȿ� ���� �ִٸ� ����
	protected abstract void attack();
	

}
