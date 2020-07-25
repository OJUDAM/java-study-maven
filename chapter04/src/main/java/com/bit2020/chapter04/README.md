## Object
Object 클래스는 모든 클래스의 상위클래스
그래서 클래스를 생성했을 때 기본으로 상속받는 메소드들이 있다.

**_toString_**
오버라이드 하여 객체의 내용을 출력

```java
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
```

**_equals, hasCode_**
`equals()` ==> 동질성 (내용이 같은지)
`==` ==> 동일성 (주소기반)

오버라이드 안하고 그냥하면 `==`와 똑같음 .즉, 레퍼런스 값만 비교하게됨 당연히 다름
equals를 오버라이드 할려면 hasCode도 같이 오버라이드해야 안전함
hasCode() => 내용기반으로 해시코드 생성, 비교
hasCode검사후 equals메소드 실행 

```java
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
```

**_String_**
String 객체를 생성할 때 2가지 방법이 있음

코드로 객체를 생성해버리기
이렇게 할 경우 다른 레퍼런스값을 가진 객체(새로운객체)가 계속 생성됨

```java
	String str = new String("hello");
```
리터럴 값으로 상수마냥 넣기
컴파일할 때 상수 풀(reference값과 hasCode가 있는 테이블)을 찾아봄
이미 있다면 reference값을 반환 없으면 새로 생성함

```java
	String str = "hello";
```

**_getInstance()_**
private로 생성자 접근을 막고
getInstance()메소드로 객체를 생성 => 객체는 static으로 생성
예를들어 Calendar클래스 
시간을 건들이면 안되므로 정보은닉..?하는것 같음

```java
	private static MyClass instance = null;
	
	private MyClass() {
		
	}
	
	public static MyClass getInstance() {
		if(instance == null) {
			instance = new MyClass();
		}
		return instance;
	}
```

**_SingleTone, Factory Method_**
`SingleTone` : 전역 변수를 사용하지 않고 **객체를 하나만 생성** 하도록 하며, 생성된 **객체를 어디서든지 참조**할 수 있도록 하는 패턴

==> 객체의 생성과 조합을 캡슐화해 특정 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 크게 받지 않도록 유연성을 제공한다.

`Factory Method` : 객체를 만들어내는 공장을 만드는것~
`객체를 만들어내는 부분을 서브 클래스에 위임하는 패턴`
메인 프로그램은 어떤 객체가 생성 되었는지 신경 쓰기 않고 단지 반환된 객체를 사용만 하면됨
새로운 객체가 추가되고 새로운 팩토리가 추가된다 해도 메인 프로그램에서 변경할 코드는 최소화됨
**효율적인 코드제어, 의존성제거**
