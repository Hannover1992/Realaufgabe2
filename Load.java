public abstract class Load{
	public abstract void add(Load load);
	public abstract void remove(Load load);
	public abstract Load getChild(int i);
	public abstract int getWeight();
	public abstract void print();
}
