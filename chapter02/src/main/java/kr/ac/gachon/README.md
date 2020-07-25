## ParkSystem
주차 시스템을 만들려고 하는데....

### Step 1
주차장에 주차되는 차 클래스를 만들었다.

```java
public abstract class Car{
	public abstract void park();
}
```

차를 상속 받는 버스, 스포츠카 클래스 생성

```java
public class Bus extends Car{
	@Override
	public void park() {
		System.out.println("버스를 주차");
	}
} 

public class SportsCar extends Car{
	@Override
	public void park() {
		System.out.println("스포츠카를 주차");
	}
} 
```
여기서 포크레인을 추가한다고하면 차 클래스를 상속받고 위와 같이 하면된다. 

### Step 2
비행기도 주차가능 하지만 차는 아니다. 이 때는...
인터페이스를 만들어 차 클래스에 implements 해준다.
그러면 주차가능한 것들은 수정 없이 클래스를 만들어 주기만 하면된다.

```java
public interface Parkable {
	public void park();
}
```

```java
public abstract class Car implements Parkable{
	
}
```

인터페이스는 기능(method)를 추상화할 떄 사용