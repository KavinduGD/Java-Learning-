package record_key_word;

public class myMain {
	public static void main(String[] args) {
		
		Vehicle vehicle= new Vehicle("BMW", "MY343");
		
		  System.out.println(vehicle.brand());         // Accessing the brand using the generated getter method
	      System.out.println(vehicle.licensePlate());  // Accessing the licensePlate using the generated getter method

	      	//constructor generate automatically
	      	//getter generate automatically
	       //no setters are generate 
	      	// because this records are immutable
	      	
	        System.out.println(vehicle.toString());
		
	        System.out.println(vehicle);
		
	
	
		
}
	
	public record Vehicle(String brand,String licensePlate) {}
}
