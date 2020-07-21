package kr.ac.gachon.park;

public class TestParkSystem03 {

	public static void main(String[] args) {
		Car c1 = new Bus();
		ParkSystem03.park(c1);
		
		Car c2 = new SportsCar();
		ParkSystem03.park(c2);
		
		Car c3 = new poclain();
		ParkSystem03.park(c3);
		
		Parkable p = new AirPlane();
		ParkSystem03.park(p);
	}
}
