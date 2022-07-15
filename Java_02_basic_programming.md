# Java 02 - 자바 기본 프로그래밍

Created: 2022년 6월 27일 오후 6:29
Last Edited Time: 2022년 7월 8일 오후 11:32
Type: Java

## 자바 프로그램의 기본 구조

- 클래스 만들기
    
    ```java
    public class Hello {
    ...
    }
    ```
    
    - **class** 키워드로 클래스 이름을 선언하고 ‘{ }’ 안에 변수와 메소드(함수) 코드를 작성한다.
    - **public** 은 다른 클래스에서 Hello 클래스를 자유롭게 참조할 수 있다.

- main() 메소드
    
    ```java
    public static void main(String[] args) {
    ...
    }
    ```
    
    - main()은 반드시 **public static void** 로 선언되어야 하며, 한 클래스는 두 개 이상의 main()을 가질 수 없다.
    
- 메소드
    - C/C++ **함수**를 자바에서는 **메소드**(method)라고 부르며, 반드시 클래스 내에 작성되어야 한다.
    

- 화면 출력
    
    ```java
    System.out.println("Hello"); // "Hello" 문자출력
    ```
    
    - 정수, 문자, 문자열 등 데이터를 화면에 출력하기 위해 **System.out.println()**을 이용한다.

---

## 자바의 데이터 타입

### var 키워드로 타입을 생략하고 변수 선언

- **Java 10**부터는 var 키워드를 사용하여 변수의 타입을 생략하고 간단히 변수를 선언할 수 있다.
- 컴파일러는 var 키워드로 선언된 문장을 추론하여 변수의 타입을 자동으로 결정한다.

```java
var price = 200; // price는 int 타입으로 결정
var name = "junyong"; // name은 String 타입으로 결정
var pi = 3.14; // pi는 double 타입으로 결정
var point = new Point(); // point는 Point 타입으로 결정
var v = new Vertor<Integer>(); // v는 Vector<integer> 타입으로 결정
```

- var 키워드는 지역 변수에만 한정되며, 초기값이 주어지지 않으면 오류가 발생한다.
    
    ```java
    public class Var {
    	public static void main(String[] args) {
    			var price = 200; // int 타입
    			var name = "junyong"; // String 타입
    			var pi = 3.14; // double 타입
    
    			System.out.println("price = " + (price + 1000));
    			System.out.println("name = " + name);
    			System.out.println("pi = " + pi * 10);
    	}	
    }
    ```
    
    - 결과: price = 1200 // name = junyong // pi = 31.4

---

## 자바의 키 입력

- 키보드에서 입력된 키를 문자나, 정수, 실수, 문자열등 사용자가 원하는 타입으로 변환해주는 고수준(high-level) 스트림 클래스 Scanner를 사용할 것을 권한다.
- **Scanner**는 키 입력을 위한 목적으로 자바 패키지에서 제공하는 클래스이다.

### Scanner을 이용한 키 입력

- Scanner 객체는 다음과 같이 생성한다.
    
    ```java
    Scanner scanner = new Scanner(System.in);
    ```
    
    - Scanner 클래스는 사용자가 입력하는 키 값을 **공백**으로 구분되는 **토큰 단위**로 읽는다.

- Scanner를 사용하기 위해서는 프로그램의 맨 앞줄에 다음 **import 문**이 필요하다.
    
    ```java
    import java.util.Scanner;
    ```
    
    - import문은 Scanner 클래스의 결로명이 java.util.Scanner임을 알려준다.
    
- Scanner 스트림 닫기 : Scanner의 사용을 종료하려면 다음과 같이 닫아 준다.
    
    ```java
    scanner.close();
    ```
    
- Scanner를 이용한 키 입력 연습
    
    ```java
    import java.util.Scanner;
    
    public class ScannerEx {
    	public static void main(String args[]) {
    		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
    		
    		Scanner scanner = new Scanner(System.in);
    		String name = scanner.next(); // 문자열 토큰 읽기
    		System.out.println("당신의 이름은 " + name + "입니다.");
    		
    		String city = scanner.next(); // 문자열 토큰 읽기
    		System.out.println("당신이 사는 도시는 " + city + "입니다.");
    		
    		int age = scanner.nextInt(); // 정수 토큰 읽기
    		System.out.println("당신의 나이는 " + age + "살입니다. ");
    		
    		double weight = scanner.nextDouble(); // 실수 토큰 읽기
    		System.out.println("당신의 체중은 " + weight + "kg입니다. ");
    		
    		boolean single = scanner.nextBoolean(); // 논리 토큰 읽기
    		System.out.println("당신의 독신 여부는 " + single + "입니다. ");
    		
    		scanner.close(); // scanner 스트림 닫기
    	}
    }
    ```
    
    - 실행 결과
        
        ![스크린샷 2022-06-28 오후 3.58.09.png](Java%2002%20-%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%20%E1%84%80%E1%85%B5%E1%84%87%E1%85%A9%E1%86%AB%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b8fbaf9490eb448cad281df1ac894d95/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-06-28_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_3.58.09.png)
        

---