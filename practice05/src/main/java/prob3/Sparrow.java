package prob3;

public class Sparrow extends Bird {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("참새("+getName()+")는 날아다입니다..");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("참새("+getName()+")가 소리내어 웁니다.");

	}

	@Override
	public String toString() {
		return "참새의 이름은 "+getName()+" 입니다.";
	}

}
