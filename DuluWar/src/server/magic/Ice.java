package server.magic;

public class Ice extends Magic {

	public Ice(){
		mana=30;         
		cooltime=1800;    // 30ÃÊ (30*60=1800)
		cool=1800;
	}
	
	public void operation1(){
		if(cool>=cooltime){
			mana=0;
			cool=0;
		}
	}
	
	protected void fill(){
		if(cool<cooltime){
			cool++;
	}
	}
}
