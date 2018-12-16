public abstract class Car extends Load {
	public abstract void add(Car car);
	public abstract void remove(Car car);
	public abstract Car getChild(int i);
	public abstract int getWeight();
	public abstract void print();
}
