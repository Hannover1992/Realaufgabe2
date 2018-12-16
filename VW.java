public class VW extends Car{
	private int weight = 1100;
	
	public VW (){
	}

	public void add(Car car){
			//ist leaf so the method not applaybel for this class
	}

	public void remove(Car car){
			//ist leaf so the method not applaybel for this class
	}

	public Car getChild(int i){
			//ist leaf so the method not applaybel for this class
		return null;	
	}

	public int getWeight(){
			return this.weight;
	}

	public void print(){
			System.out.println("-----------");
			System.out.println("VW Weight="+this.weight);
			System.out.println("-----------");
	}
}
