package server.magic;
public abstract class Magic {
    //������ ����ϴµ� �ʿ��� ����
	protected int mana;
    //������ ���� ��Ÿ��.
    protected int cooltime;
    //���� ȸ���� ��Ÿ��.
    protected int cool;
    //������ ����Ҷ� �۵��Ǵ°͵�
    public abstract void operation1();
    //���� ����� ��Ÿ�� ä��� �۾�.
    protected abstract void fill();
}
