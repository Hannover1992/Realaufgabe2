class Main{
	public static void main(String[] args){
	Load car1 = new VW();
	Load car2 = new Volvo();
	Load sui1 = new Suitcase(100);	
	Load box1 = new Box(666);
	box1.add(car1);
	box1.add(car2);
	box1.add(sui1);
	box1.getWeight();
	box1.print();
	}

}
