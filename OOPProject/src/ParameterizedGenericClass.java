
public class ParameterizedGenericClass<T,U>{

	T num1;
	U num2;
	public ParameterizedGenericClass(T num1, U num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	public void display() {
		System.out.println(num1 + " "+ num2);
	}
}
