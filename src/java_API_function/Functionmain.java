package java_API_function;

import java.util.function.Function;

public class Functionmain {

	public static void main(String[] args) {
		
		String name = "홍길동";
		
		Function<String, Integer> func = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		Function<String, Integer> func1 = t-> 
				 t.length();
		
				 int length = func.apply(name);
				 
				 System.out.println(length);
				 
			
		
		
	}

}
