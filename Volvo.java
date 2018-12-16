public class Volvo extends Car{
		private int weight = 1400;

		public Volvo (){
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
			return null;
		}

		public int getWeight(){
				return this.weight;
		}

		public void print(){
				
			System.out.println("-----------");
			System.out.println("Volvo weight="+this.weight);
			System.out.println("-----------");
		}
}
