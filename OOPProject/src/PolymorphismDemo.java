public class PolymorphismDemo {
int x, y;
public PolymorphismDemo() { x=y=0 ; }
	
public PolymorphismDemo(int x, int y) {
	this.x=x;
	this.y=y; }

public void addition() {
		int z=x+y;
		System.out.println(z); }
	
	public void addition(int num1,int num2) {
		int z=num1+num2;
		System.out.println(z); }
	
	public void addition(float num1,int num2) {
		float z=num1+num2;
		System.out.println(z); }
	
	public void addition(int num1, float num2) {
		float z=num1+num2;
		System.out.println(z); }
	
	public float addition(float num1, float num2) {
		float z=num1+num2;
		return z; }}