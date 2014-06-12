package server.entities;
import server.abstractEntities.Entity;
import server.abstractEntities.Mean;
import server.main.EntitiesContainer;


public class Arrow extends Mean {

	
    public Arrow(int X, int line) {
		super(X, line);
		HP=1;
	}

	public void perform(){
    }
	
	public void minusHP(){
		for(Entity enemy : enemyContainer.getSoldier(line)){
			if(X == enemy.X){
			    enemy.HP--;
			    HP--;
			    return;
			}
		}
	}

}
