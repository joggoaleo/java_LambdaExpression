package java_API_function;

import java.util.Scanner;
import java.util.function.Predicate;

public class PrediateMain {

	public static void main(String[] args) {
		// Predicate <T>
		Scanner scan =  new Scanner(System.in);
		
		Predicate <String> pre  = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				boolean flag = false;
				try {
					Integer.parseInt(t);
					flag = true;
				}
				catch(NumberFormatException e) {flag = false;}
				catch(Exception e) {flag = false;}
				
				return flag;
			}
		};
		Predicate <String> pre1  =  t-> {
				boolean flag = false;
				try {
					Integer.parseInt(t);
					flag = true;
				}
				catch(NumberFormatException e) {flag = false;}
				catch(Exception e) {flag = false;}
				
				return flag;
			};
			boolean flag =   pre1.test("1234");
			System.out.printf("%s", (flag == true) ? "숫자로 변환" : "변환불가" );
			
			System.out.println("the end");
		
	}

}
