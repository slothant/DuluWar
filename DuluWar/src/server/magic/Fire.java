package server.magic;

public class Fire extends Magic {

	public Fire(){
		mana=40;         
		cooltime=2400;    // 40초 (40*60=2400)
		cool=2400;
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
