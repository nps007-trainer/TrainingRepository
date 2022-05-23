import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OOPDemo {
	public static void main(String[] args) {
	Genericclass<Integer> obj=new Genericclass<Integer>();
	obj.x=12;
	obj.y=34;
	obj.display();
	
	Genericclass<String> obj2=new Genericclass<String>();
	obj2.x="Nandini";
	obj2.y="S";
	obj2.display();
	
	Genericclass<Double> obj3=new Genericclass<Double>();
	obj3.x=12.0;
	obj3.y=34.0;
	obj3.display();
	
	GenericMethod obj4=new GenericMethod();
	obj4.display(34);
	obj4.display("Nandini");
	obj4.<Double> display(12.6);
	obj4.<Character> display('S');
	
	
	ParameterizedGenericClass<Integer, String> obj5=new ParameterizedGenericClass<Integer, String>(34, "Mahesh");
	ParameterizedGenericClass<String, Float> obj6=new ParameterizedGenericClass<String, Float>("Arun",36.2f);
	obj5.display();
	obj6.display();
	}

}
