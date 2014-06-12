package server.abstractEntities;

import server.main.EntitiesContainer;

//��� ��ƼƼ���� ���δ� ���� Ŭ����
public abstract class Entity {
	//��ƼƼ�� ��ġ ��ǥ.
	public int X;
	//�ڽ��� ��ġ�� ��. ���������� 0�� ���� ���� �Ʒ� ������ 4
	protected int line;
	//��ƼƼ�� ü��
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
