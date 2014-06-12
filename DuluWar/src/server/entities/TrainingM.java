package server.entities;
import server.abstractEntities.Training;

public class TrainingM extends Training {

    public TrainingM(int X, int line) {
		super(X, line);
		HP=3;
	}

	public void perform(){
		//¸ÁÄ¡ÀÌ »ı¼º
		ally.add(new Mangchi(X, line), line);
    }

}
