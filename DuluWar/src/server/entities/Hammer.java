package server.entities;
import server.abstractEntities.Entity;
import server.abstractEntities.Mean;

public class Hammer extends Mean {

    public Hammer(int X, int line) {
		super(X, line);
		HP=1;
	}

	public void perform(){
    }


	public void minusHP() {
		for(Entity enemy : enemyContainer.getSoldier(line)){
			if(X == enemy.X){
				//망치없어진다 
			    enemy.HP--;
			    HP--;
				return;
			}
		}
	
		
	}

}
