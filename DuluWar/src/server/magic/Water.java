package server.magic;

public class Water extends Magic {

	public Water(){
		mana=25;
		cooltime=1500; //25��
		cool=1500;
	}
	
	public void operation1(){
		if(cool>=cooltime){
			mana=0;
			cool=0;
		}
	}
	
	protected void fill(){ //1�ʿ� 60�� �۵�.
		if(cool<cooltime){
			cool++;
	}
	}
}
