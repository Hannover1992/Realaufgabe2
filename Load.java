public interface Load{
	public void add(Load load);
	public void remove(Load load);
	public Load getChild(int i);
	public int getWeight();
	public void print();
}
