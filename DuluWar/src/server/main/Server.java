package server.main;

import server.abstractEntities.Building;
import server.abstractEntities.Mean;
import server.abstractEntities.Soldier;

//게임을 실행하기에 앞서서 가장 먼저 실행해야 하는 클래스

public class Server {

	//좌우측 플레이어의 데이터
	EntitiesContainer rightContainer = new EntitiesContainer();
	EntitiesContainer leftContainer = new EntitiesContainer();
	Wizard rightWizard = new Wizard();
	Wizard leftWizard = new Wizard();
	
	//서버가 실행되었을 때의 작용
	public Server(){
		// 클라이언트 2개를 접속받고, writer와 reader를 생성
		// 데이터를 초기화 시킨후 게임 실행에 필요한 준비 완료.
		loop();
	}
	
	//1초에 60번씩 perform과 write를 실행
	public void loop(){
		while(true){
			sleep();
			perform();
			write();
		}
	}
	
	private void sleep(){
		try {
			Thread.sleep(1000 / 60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//모든 객체가 행동을 수행
	public void perform(){
		for(int line = 0; line < 5; line++){
			for(Building building : rightContainer.getBuilding(line))
				building.perform();
			for(Building building : leftContainer.getBuilding(line))
				building.perform();
			for(Soldier soldier : rightContainer.getSoldier(line))
				soldier.perform();
			for(Soldier soldier : leftContainer.getSoldier(line))
				soldier.perform();
			for(Mean mean : rightContainer.getMean(line))
				mean.perform();
			for(Mean mean : leftContainer.getMean(line))
				mean.perform();
		}
		rightContainer.clear();
		leftContainer.clear();
	}
	
	//정보를 클라이언트로 전송
	public void write(){
		
	}
	
	//메인 함수
	public static void main(String args){
		new Server();
	}
}
