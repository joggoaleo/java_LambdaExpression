package java_LambdaExpression;

import java.util.Scanner;

public class LambdaMain {

	public static void main(String[] args) {
		// 임시객체 부 = new 자식();
		//입력 x 리턴값 x
		/*A a = new A() {
			
			@Override
			public void method() {
				System.out.println("입력 x 리턴값 x");
			}
		}*/;//자식임시객체 자식이 부모 오버라이딩
		
		
		A a = () ->
			System.out.println("입력 x 리턴값 x");
		// 부모 추상메소드를 불러주면, 자식의 오버라이딩 함수가 출력된다.
		a.method();
		
		/*
		 * D d = new D() {
		 * 
		 * @Override public double methodD(int a, double b) { return a+b; } };
		 */ 
			
		D d = (c,b) -> c*b;
		double value = d.methodD(10, 100);
		System.out.println(value);;
		System.out.printf("d.methodD(10,20.5) =  %.2f\r",value);;
		
		
		
		B b =(name) -> {
			Scanner scan = new Scanner(System.in);
			System.out.printf("%s의 나이 입력?", name);
			int age = Integer.parseInt(scan.nextLine());
			return age;
		};
		int result =  b.methodB("지훈");
		System.out.printf( "나이는 %d",result);
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
	}


