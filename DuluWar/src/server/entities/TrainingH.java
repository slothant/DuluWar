package server.entities;
import server.abstractEntities.Training;

public class TrainingH extends Training {

	public TrainingH(int X, int line) {
    	super(X, line);
        HP=3;
	}

	public void perform(){
		//ȭ�� ����
		ally.add(new Hwalr(X, line), line);
    }
}
