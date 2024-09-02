package comparable.interfsce.com;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private int age;
	public Student(int id, String name, int age) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) 
	{
		return this.name.compareTo(o.name);// ascending
		//return o.name.compareTo(name); decending
	}
	@Override
	public String toString() 
	{
		return "\n[id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
public class ComparableInterfaceDemo 
{
	public static void main(String[] args) 
	{
		Student s = new Student(1,"Raj",20);
		Student s1 = new Student(2,"Sangram",21);
		Student s2 = new Student(3,"Omkar",22);
		Student s3 = new Student(4,"Aditya",23);
		Student s4 = new Student(5,"Harshad",24);
		Student s5 = new Student(6,"Ram",20);
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(s);
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		System.out.println("Before sort: "+a1);
		Collections.sort(a1);
		System.out.println("After sort: "+a1);
	}
}
