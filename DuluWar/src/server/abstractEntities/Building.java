package server.abstractEntities;

//�ǹ����� ����ϴ� ����Ŭ����
public abstract class Building extends Entity {

	//�ǹ� ����
	protected int price;
	//�ǹ��� ��ġ. �迭�� ���ؼ� ���� ��
	protected int positionX;

	public Building(int X, int line) {
		super(X, line);
	}
}
