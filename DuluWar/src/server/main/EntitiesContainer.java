package server.main;

import java.util.ArrayList;




import server.abstractEntities.Building;
import server.abstractEntities.Entity;
import server.abstractEntities.Mean;
import server.abstractEntities.Soldier;

//각 플레이어의 객체를 모두 모아놓은 클래스.

public class EntitiesContainer {

	private ArrayList<Soldier> soldierList[] = new ArrayList[5];
	private ArrayList<Building> buildingList[] = new ArrayList[5];
	private ArrayList<Mean> meanList[] = new ArrayList[5];

	private ArrayList<Soldier> soldierAddList[] = new ArrayList[5];
	private ArrayList<Building> buildingAddList[] = new ArrayList[5];
	private ArrayList<Mean> meanAddList[] = new ArrayList[5];

	private ArrayList<Soldier> soldierRemoveList[] = new ArrayList[5];
	private ArrayList<Building> buildingRemoveList[] = new ArrayList[5];
	private ArrayList<Mean> meanRemoveList[] = new ArrayList[5];

	public EntitiesContainer() {
		for(int i = 0; i < 5; i++){
			soldierList[i] = new ArrayList<Soldier>();
			buildingList[i] = new ArrayList<Building>();
			meanList[i] = new ArrayList<Mean>();
			
			soldierAddList[i] = new ArrayList<Soldier>();
			buildingAddList[i] = new ArrayList<Building>();
			meanAddList[i] = new ArrayList<Mean>();
			
			soldierRemoveList[i] = new ArrayList<Soldier>();
			buildingRemoveList[i] = new ArrayList<Building>();
			meanRemoveList[i] = new ArrayList<Mean>();
		}
	}
	
	public ArrayList<Soldier> getSoldier(int line) {
		return soldierList[line];
	}
	
	public ArrayList<Building> getBuilding(int line) {
		return buildingList[line];
	}
	
	public ArrayList<Mean> getMean(int line) {
		return meanList[line];
	}
	
	//add(객체) 형태로 입력하면 그 객체를 리스트에 추가.
	public void add(Soldier soldier, int line) {
		soldierAddList[line].add(soldier);
	}
	
	public void add(Building building, int line) {
		buildingAddList[line].add(building);
	}
	
	public void add(Mean mean, int line) {
		meanAddList[line].add(mean);
	}
	
	//remove 객체 제거	
	public void remove(Entity entity,int line){
		if(entity instanceof Soldier){
			soldierRemoveList[line].add((Soldier)entity);	
		}
		if(entity instanceof Building){
			buildingRemoveList[line].add((Building)entity);	
		}
		if(entity instanceof Mean){
			meanRemoveList[line].add((Mean)entity);	
		}
	}
	
	public void clear() {
		for(int line = 0; line < 5; line++){
			soldierList[line].removeAll(soldierRemoveList[line]);
			soldierList[line].addAll(soldierAddList[line]);
			
			buildingList[line].removeAll(buildingRemoveList[line]);
			buildingList[line].addAll(buildingAddList[line]);
			
			meanList[line].removeAll(meanRemoveList[line]);
			meanList[line].addAll(meanAddList[line]);
		}
	}
}
