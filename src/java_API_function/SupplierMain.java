package java_API_function;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {
		// 함수형 인터페이스 (추상메서드 1개) -> 구현클래스(오버라이딩or 오버라이딩) -> 부모 = 자식 구현 객체 -> 부모, 추상메소드
		// Supplier<T> -> 구현클래스 (x) -> 임시객체 -> 부모, 추상메서드 (람다식 표현)
		Scanner scan = new Scanner(System.in);
		
		Supplier <String> sup = () -> {
			System.out.println("이름:");
			String value = scan.nextLine();
			return String.format("%s님 질문을 하신 당신은 멋쟁이", value);
		};
		
		Supplier <String> sup1 = new Supplier<String>() {
			@Override
			public String get() {
				System.out.println("이름:");
				String value = scan.nextLine();
				return String.format("%s님 질문을 하신 당신은 멋쟁이", value);
			}
		}; 
		
		System.out.println(sup.get());
		System.out.println(sup1.get());
	}

}
