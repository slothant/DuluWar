package server.magic;
public abstract class Magic {
    //마법을 사용하는데 필요한 마나
	protected int mana;
    //마법에 따른 쿨타임.
    protected int cooltime;
    //현재 회복된 쿨타임.
    protected int cool;
    //마법을 사용할때 작동되는것들
    public abstract void operation1();
    //마법 사용후 쿨타임 채우는 작업.
    protected abstract void fill();
}
