package java_LambdaExpression;

public interface A {
	//입력 x 리턴값 x
	public abstract void method();
}


 interface D {
	 //입력 o, 리턴 o
	public abstract double methodD(int a, double b);
}
 
 
 interface B{
	 //입력 x, 리턴 o
	 int methodB(String a);
	 
 }
 
 interface C {
	//입력 o, 리턴 x
	 void methodC(int a);
 }