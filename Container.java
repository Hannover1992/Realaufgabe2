class Container{
	Load load;

	Container(Load load){
		this.load = load;
	}

	int getWeight(){
		return this.load.getWeight();
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
	Container container2 = new  Container(box1);
	Ship ship1 = new Ship();
	MaxWeight maxWeight1 = new MaxWeight();
	ship1.addIObserver(maxWeight1);
	ship1.setContainer(container2);

	}

}
