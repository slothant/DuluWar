package server.magic;

public class Water extends Magic {

	public Water(){
		mana=25;
		cooltime=1500; //25초
		cool=1500;
	}
	
	public void operation1(){
		if(cool>=cooltime){
			mana=0;
			cool=0;
		}
	}
	
	protected void fill(){ //1초에 60번 작동.
		if(cool<cooltime){
			cool++;
	}
	}
}
