public class CarDriver {
	public static void main(String [] args ) {
		Car myCar = new Car();
		System.out.println(myCar.toString());
	
		Car anotherCar = new Car("Chevrolet", 1991);
		System.out.println(anotherCar.toString());
		}
}
