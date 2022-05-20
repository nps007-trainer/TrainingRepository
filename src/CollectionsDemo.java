import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionsDemo {

	public static void main(String[] args) {
	TreeSet<Employee> tsemp=new TreeSet<Employee>();
tsemp.add(new Employee(101, "Shakib", "Intern", 22));
	tsemp.add(new Employee(102, "Mahesh", "Intern", 23));
	tsemp.add(new Employee(103, "Priya", "Intern", 22));
	tsemp.add(new Employee(104, "Shrikanth", "Intern", 21));
	tsemp.add(new Employee(105, "Bharath", "Intern", 20));
	
	tsemp.stream().forEach(t ->System.out.println(t) );
	
	System.out.println("=============Name in descending order==========================");

	TreeSet<Employee> tsempByName = new TreeSet<Employee>(
(Employee o1, Employee o2)->o2.getEmployeename().
compareTo(o1.getEmployeename())
			);
			
	tsempByName.add(new Employee(101, "Shakib", "Intern", 22));
	tsempByName.add(new Employee(102, "Mahesh", "Intern", 23));
	tsempByName.add(new Employee(103, "Priya", "Intern", 22));
	tsempByName.add(new Employee(104, "Shrikanth", "Intern", 21));
	tsempByName.add(new Employee(105, "Bharath", "Intern", 20));

	tsempByName.stream().forEach(t ->System.out.println(t) );

	System.out.println("==============Stream API methods================");
List<String> names = Arrays.asList("Shakib","Shrikant","Percy","Bharath","Mahesh","Nandini","Sreehari", "Megha");
	System.out.println("=========== Names starting with letter M =============");
	
	names.stream().filter(t ->t.startsWith("M") )
	.forEach(t-> System.out.println(t));
	
	System.out.println("================= Square of Unique  Numbers===========");
	
	List<Integer> num = Arrays.asList(2,3,4,5,6,4,9,5);
	
//	num.stream().map(x->x*x)
//	.forEach(t->System.out.println(t));

	num.stream()
	.distinct().map(x->x*x).forEach(x-> System.out.println(x));
	
	
	num.stream()
	.map(x->x*x).distinct().forEach(x->System.out.println(x));
	
	System.out.println("========= Unique Even elements=========");
	num.stream().distinct()
	.filter(t -> t%2==0).forEach(x->System.out.println(x));
	
	System.out.println("List of employees age 22");
	
tsempByName.stream()
	.filter(e->e.getEmployeeage()==22)
	.map(Employee::getEmployeename)
	.forEach(System.out::println);


Optional<Employee> minage = tsempByName.stream()
.min(Comparator.comparingInt(Employee::getEmployeeage));

Employee emp=	minage.get();
System.out.println(emp);
	
String s1 = "Java";
String s2 = "Java";
StringBuilder sb1 = new StringBuilder();
sb1.append("Ja").append("va");
//System.out.println(sb1);
System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
System.out.println(sb1.toString() == s1);
System.out.println(sb1.toString().equals(s1));

	
	}
	
}
