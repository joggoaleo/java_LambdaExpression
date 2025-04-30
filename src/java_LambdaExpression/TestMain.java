package java_LambdaExpression;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4. 구현객체 생성
		TestChild tc =  new TestChild();
		//5. 부모 참조변수에 구현객체 할당
		Test test = tc;
		//6. 부모참조변수에서 오버라이딩된 구현객체 메소드 실행
		int kor = test.methodTest("국어");
		System.out.printf("국어점수 = %d\r" ,kor);
		
		
		
		Test2 test2 = (a)->{
			Scanner scan = new Scanner(System.in);
			System.out.printf("%s 점수요청 :",a);
			int value = Integer.parseInt(scan.nextLine());
			return value;
		};
		String subject = "영어";
		int eng = test2.methodTest(subject);
		System.out.printf("%s점수 = %d\r",subject ,eng);
		
		
		
	}

}
