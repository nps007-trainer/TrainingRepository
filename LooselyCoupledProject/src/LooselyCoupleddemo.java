class Consumer{
	public void CallCalculator(Calculator calc) {
		calc.addition(3, 4);
	}
	
}


// Driver class
public class LooselyCoupleddemo {

	public static void main(String[] args) {
	Consumer c=new Consumer();
	c.CallCalculator(new StandardCalculator());
	}
	
}