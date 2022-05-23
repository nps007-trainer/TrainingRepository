class Series
{
	// write your code here
	public void evennumbers(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
	}
}

public class NumberSeries {

	public static void main(String[] args) {
		
		Series obj=new Series();
		obj.evennumbers(30);
	}

}
