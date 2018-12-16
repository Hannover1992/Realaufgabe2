public class Fiat implements Car{
		private int weight = 800;

		public Fiat (){
		}

		public void add (Car car){
			//ist leaf so the method not applaybel for this class
		}

		public void remove(Car car){
			//ist leaf so the method not applaybel for this class
		}

		public void add(Load load){
				//ist leaf so the method not applaybel for this class
		}

		public void remove(Load load){
				//ist leaf so the method not applaybel for this class
		}

		public Car getChild(int i){
			//ist leaf so the method not applaybel for this class
		}

		public int getWeight(){
				return this.weight;
		}

		public void print(){
				
			System.out.println("-----------");
			System.out.println("Fiat weight="+this.weight);
			System.out.println("-----------");
		}
}
