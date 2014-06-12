package server.abstractEntities;

//건물들을 상속하는 상위클래스
public abstract class Building extends Entity {

	//건물 가격
	protected int price;
	//건물의 위치. 배열을 통해서 잡을 값
	protected int positionX;

	public Building(int X, int line) {
		super(X, line);
	}
}
