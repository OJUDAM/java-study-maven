### [Upcasting , DownCasting](https://github.com/OJUDAM/java-study-maven/tree/master/chapter03/src/main/java/com/bit2020/paint)
___Ucasting___ --> 부모 ref = new 자식();
업캐스팅 할경우 자식만이 가지고 있는 메소드들은 호출 할 수 없다.
=> 부모가 가지고 있는 메소드를 오버라이드 했을시 그 오버라이드 된 메소드가 호출됨
=> 좀 더 멋있는 방식

```java	 
	Point point3 = new ColorPoint();
```

근데 자식 클래스에 있는 메소드를 사용하고 싶다
=> ___DownCasting___을 명시적으로 선언해준다.

```java
	((ColorPoint)point3).setColor("red");
```

