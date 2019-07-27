import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MAPs {
public static void main(String[] args) {
	Map<Integer,Object> m1 =new HashMap<>();
    
	List<String> s =new ArrayList();
	s.add("ss");
	s.add("s2");
	s.add("33"); 
	m1.put(1,s);
	System.out.println(m1);
	
	Employee e1 =new Employee(10, "swt", 50000);
	Employee e2 =new Employee(11, "sw", 21000);
	Employee e3 =new Employee(12, "s", 10000);
	
	Map<Integer,Object> m2=new HashMap<>();
	m2.put(1001, e1);
	m2.put(1002, e2);
	m2.put(1003, e3);
	
	System.out.println(m2);
	
}

}

class Employee{
	
	@Override   //生成ToString 方法可以读出里面的具体值而不是位置
	public String toString() {
		return "[ID=" + ID + ", name=" + name + ", salary=" + salary + "]"+"\n";
	}
	int ID;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int iD, String name, int salary) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
	}
	String name;
	int salary;
}
