package kr.ac.gachon.park;

public class TestParkSystem01 {

	public static void main(String[] args) {
		Bus c= new Bus();
		ParkSystem01.park(c);
		
		SportsCar c2 = new SportsCar();
		ParkSystem01.park(c2);
	}

}
