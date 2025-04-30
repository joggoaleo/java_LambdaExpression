package java_LambdaExpression;

import java.util.Scanner;
//2.구현클래스 설계
public class TestChild implements Test {
// 3. 인터페이스 오버라이딩
	@Override
	public int methodTest(String a) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("%s 점수요청 :",a);
		int value = Integer.parseInt(scan.nextLine());
		
		
		return value;
	}
}
