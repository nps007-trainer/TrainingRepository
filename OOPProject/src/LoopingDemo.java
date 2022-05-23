
public class LoopingDemo {

	public void table(int num) {
		int t;
		for(int i=1;i<=10;i++) {
			t=num*i;
			System.out.println(num + "*" + i + "="+t);
		}
	}
	
	public void addition(int... a) {
		System.out.print("Number of parameters passed = " +a.length +"\t");
		int sum=0;
		for(int num : a) {
			sum=sum+num;
		}
		System.out.println("Total = "+ sum);
		
		
	}
	
}
