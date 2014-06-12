package server.main;

import server.abstractEntities.Building;
import server.abstractEntities.Mean;
import server.abstractEntities.Soldier;

//������ �����ϱ⿡ �ռ��� ���� ���� �����ؾ� �ϴ� Ŭ����

public class Server {

	//�¿��� �÷��̾��� ������
	EntitiesContainer rightContainer = new EntitiesContainer();
	EntitiesContainer leftContainer = new EntitiesContainer();
	Wizard rightWizard = new Wizard();
	Wizard leftWizard = new Wizard();
	
	//������ ����Ǿ��� ���� �ۿ�
	public Server(){
		// Ŭ���̾�Ʈ 2���� ���ӹް�, writer�� reader�� ����
		// �����͸� �ʱ�ȭ ��Ų�� ���� ���࿡ �ʿ��� �غ� �Ϸ�.
		loop();
	}
	
	//1�ʿ� 60���� perform�� write�� ����
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
	
	//��� ��ü�� �ൿ�� ����
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
	
	//������ Ŭ���̾�Ʈ�� ����
	public void write(){
		
	}
	
	//���� �Լ�
	public static void main(String args){
		new Server();
	}
}
