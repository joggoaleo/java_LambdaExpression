package java_LambdaExpression;

public class InstaceLambda {

	public static void main(String[] args) {
		C c = a -> {
			System.out.println(a);
		};
		c.methodC(10);

		C c2 = System.out::println;
		c2.methodC(100);
//=============================================
		A a = () -> Bobject.bcd();
		A a2 = Bobject::bcd;

		A a3 = new A() {
			public void method() {
				Bobject.bcd();
			};
		};
//==============================================
		System.out.println("====================");
		
		Atest atest = (b,k) -> b.bcd(k);
		Atest atest2 = Bobject2 :: bcd;
		
		atest.abc(new Bobject2(), 10000);
		atest2.abc(new Bobject2(), 20000);
	}

}
