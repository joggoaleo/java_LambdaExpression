package java_API_function;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerMain {
	public static void main(String[] args)  {
		//인터페이스 -> 구현클래스 -> 구현 객체 -> 부자관계 -> 부.추상 메소드
		//Consumer -> x-> 구현객체(부자관계) -> 부.추상메소드
		
		Consumer<String> con =  t->
			System.out.printf("%s 님 환영합니다.\r",t);
		
		
		
		Consumer<String> con1= new Consumer<String>(){
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.printf("%s 님 환영합니다.\r\r",t);
			}
			
		};
		
		con.accept("홍길동");
		con.accept("구길동");
		con.accept("저길동");
		
		//<> 안에는 제네릭 타입 .  Integer
		Consumer<Integer> multiple1 = new Consumer<Integer>(){
			public void accept(Integer y) {
				for(int i =1; i<10; i++) {
					System.out.printf("%d * %d =%d  \r",y,i,y*i);
				}
			};
		};
		
		
		IntConsumer multiple = x -> {
			for(int i =1; i<10; i++) {
				System.out.printf("%d * %d =%d  \r",x,i,x*i);
			}
		};
		
		multiple.accept(5);
		multiple.accept(6);
		//======================================================
		BiConsumer<String, Integer> bicon = new BiConsumer<String, Integer>(){
			public void accept(String t, Integer u) {
				System.out.printf("%s의 나이는 %d입니다. \n",t,u);
			};
		};
		BiConsumer<String, Integer> bicon1 = (name, age)-> 
				System.out.printf("%s의 나이는 %d입니다. \n",name,age);
				
				bicon1.accept("동진", 60);
		
		};
		
			
		}
		
		
	

