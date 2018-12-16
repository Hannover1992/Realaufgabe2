public class Volvo implements Car{
		private int weight = 1400;

		public Volvo (){
		}

		public void add (Car car){
			//ist leaf so the method not applaybel for this class
		}

		public void remove(Car car){
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
			System.out.println("Volvo weight="+this.weight);
			System.out.println("-----------");
		}
}
