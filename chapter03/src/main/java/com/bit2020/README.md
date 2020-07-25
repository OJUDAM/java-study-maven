## [Upcasting , DownCasting](https://github.com/OJUDAM/java-study-maven/tree/master/chapter03/src/main/java/com/bit2020/paint)

___Upcasting___ --> 부모 ref = new 자식();
업캐스팅 할경우 자식만이 가지고 있는 메소드들은 호출 할 수 없다.
=> 부모가 가지고 있는 메소드를 오버라이드 했을시 그 오버라이드 된 메소드가 호출됨
=> 좀 더 멋있는 방식

```java	 
	Point point3 = new ColorPoint();
```

근데 자식 클래스에 있는 메소드를 사용하고 싶다
**_Downcasting_** 을 명시적으로 선언해준다.

```java
	((ColorPoint)point3).setColor("red");
```

### Try~catch 예외처리

method에 Throws를 붙이고 예외 발생할것 같은 부분에 throw로 예외발생시 exception을 던진다.
throw를 던져야 try~catch 구문이 성립!

```java
	//예외 던지기
	public void danger() throws IOException, MyException{
		if(10 - 10 ==0) {
			throw new MyException();
		}
		if(10 - 10 ==0) {
			throw new IOException();
		}
	}
```
예외처리 가이드
`	1. 사과(사용자에게 알림)
 	2. 로그 남기기(파일이나 DB에)
 	3. 정상 종료
`
로직에러는 로직을 수정해야하지 try~catch를 이용하여 예외에 던지는게아님

```text
	Unchecked Exception : 논리적 오류, 로직오류(Arithmetic, NullPotin, OutofBound(try x)
	Checked Exception : 네트워크, 파일I/O, DB
	
```
finally는 프로그램이 종료되도 실행 --> 자원정리에 이용

```java
		try {	
			int result = (1 + 2 + 3) / b;
		} catch(ArithmeticException ex) {
			// 1. 사과
			System.out.println("죄송합니다."
					+ " 다시 실행해주세요");
			// 2. 로그 남기기
			System.out.println(ex);
			//3. 정상 종료
			return;
		} finally{
			System.out.println("some codes3");
		}
```
Exception은 자기가 커스텀 할 수 있음

```java
	public class MyException extends Exception {

		private static final long serialVersionUID = 1L;

		public MyException() {
			super("MyException Occured");
		}
		
		public MyException(String massage) {
			super(massage);
		}
```

___Super()___ 메소드는 생성자에서 자신의 부모 생성자 호출--> 무조건 맨 윗줄에
메소드도 가능 **_Super.메소드()_** 이거는 위치 상관 없음
