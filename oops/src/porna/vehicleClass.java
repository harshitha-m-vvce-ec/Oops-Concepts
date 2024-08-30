package porna;

// parent class
class vehicle{
	void engine() {
		System.out.println("It has a combustion Engine!");
	}
	
}

//child class
class bikes extends vehicle{
	void wheels() {
		System.out.println("It has two wheels");
	}
	
//    POLYMORPHISM method overloading
	void type(String type) {
		System.out.println(type);
	}
	void type(String type, String cylinder) {
		System.out.println("Bike is "+type+"and has "+cylinder);
	}


}
//superchild class
class cars extends bikes{
	void wheels() {
		System.out.println("It has two wheels");
	}
}

//ENCAPSULATION getter and setter method
class bikeName{
	String name="honda";
//	Getter method
	String getName() {
		return name;
	}
//	Setter method	
  	String setName(String name) {
		this.name=name;
		return name;
	}
}

//ABSTRACTION
abstract class vehicles{
	abstract void whatIsVehicle();
}
class vehicleMeaning extends vehicles{
	void whatIsVehicle() {
		System.out.println("A vehicle is a machine designed for transportation!");
		System.out.println("It has a Engine!");
		System.out.println("It has GearBox!");
	}
}

// INTERFACE
interface heavyVehicle{
	void vehicleWeight();
}
interface hugeVehicle extends heavyVehicle{
	void vehicleSize();
}
class commertialVehicle implements hugeVehicle{
	public void vehicleWeight() {
		System.out.println("Heavy Duty Truck weighs 15 tons!");
	}
	public void vehicleSize() {
		System.out.println("Heavy Duty Truck is 10ft by 60ft !");
	}
}

public class vehicleClass {
	

	public static void main(String[] args) {
		System.out.println("Vehicle got statred");
//		INHERITANCE accessing from the car class
		cars car1 = new cars();
		car1.engine();
		car1.wheels();
		System.out.println();
		
//		INHERITANCE accessing form the bike class
		bikes bike1 =new bikes();
		bike1.engine();
		bike1.wheels();
		System.out.println();
		
//	    POLYMORPHISM method overloading 
		bike1.type("Two Stroke");
		bike1.type("Four Stroke","Four Cylinder");
		System.out.println();

//		POLYMORPHISM method overriding
		bike1.wheels();
		car1.wheels();
		System.out.println();
		
//		ENCAPSULATION getter and setter method
		bikeName bkName = new bikeName();
		String name1 = bkName.getName();
		System.out.println(name1);
		String name2 = bkName.setName("kawasaki");
		System.out.println(name2);
		System.out.println();
		
//		ABSTRACTION
		vehicles vehicle1 = new vehicleMeaning();
		vehicle1.whatIsVehicle();
		System.out.println();
		
//		INTERFACE
		commertialVehicle cmrVehicle1 = new commertialVehicle();
		cmrVehicle1.vehicleWeight();
		cmrVehicle1.vehicleSize();
		System.out.println();
		
		
		
	}

}