class Machine {
	public void start() {
		System.out.println("Starting Machine");
	}
}


interface Plant {
	public void grow();
}

public class App {

	public static void main(String[] args) {
	 // Way of extending an existing class or implementing an interface as an on the fly type of deal.  
	 Machine machine1 = new Machine() { 
		 
		 // A child class of Machine created on the fly (Anonymous Classes) 
		 @Override public void start() {
			 System.out.println("Camera snapping... ");
		 }
		 
		 
	 };

	 machine1.start();
	 
	 // Same thing using interface 
	 Plant plant1 = new Plant() {

		@Override
		public void grow() {
			System.out.println("Plant growing");
			
		}
		 
	 };
	 
	 plant1.grow();
		

	}

}
