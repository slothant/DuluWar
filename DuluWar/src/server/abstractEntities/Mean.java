package server.abstractEntities;

import server.main.EntitiesContainer;

//���� ����. ��ġ�� ȭ�� ��. ���� �浹�Ͽ� ���ظ� ����
public abstract class Mean extends Entity {

	// �̹� �ٸ� ��󿡰� ���ظ� �������� ����. ���ظ� ���� ���� �ִٸ� ���̻� ���ظ� ���� �ʰ� �����.
	protected boolean used;
	
	// ������ ������ ��� ��ƼƼ �����̳�
	protected EntitiesContainer enemyContainer;

	public abstract void perform();

	public Mean(int X, int line) {
		super(X, line);
	}
	//�Ʊ��� ü�� ����
	public abstract void minusHP();

	
}
