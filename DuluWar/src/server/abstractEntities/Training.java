package server.abstractEntities;

import server.main.EntitiesContainer;

//���縦 �����ϴ� �ǹ��� ����Ŭ����
public abstract class Training extends Building {

	protected int delayCount;
	//�Ʊ��� ������ ��� ��ƼƼ �����̳�
	protected EntitiesContainer ally;

	public Training(int X, int line) {
		super(X, line);
	}
	
	//�ֱ⺰�� ���縦 ����
	public void perform() {
	}

	
}
