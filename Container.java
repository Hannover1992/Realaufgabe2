public class Container{
	private Load load;

	Container(Load load){
		this.load = load;
	}

	Load getLoad()
	{
		return this.load;
	}

	void setLoad(Load load)
	{
		this.load = load;
	}
	int getWeight(){
		return this.load.getWeight();
	}

	void print(){
	System.out.println("Container Weight:"+this.getWeight());
	}

	public static void main(String[] args){
	Load car1 = new VW();
	Load car2 = new Volvo();
	Load sui1 = new Suitcase(100);	
	Load box1 = new Box(666);
	box1.add(car1);
	box1.add(car2);
	box1.add(sui1);
	Container container1 = new  Container(box1);
	container1.print();
	Ship ship1 = new Ship(container1);


	}

}
