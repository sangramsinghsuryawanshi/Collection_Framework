/*
 * 1. Basic Comparable Usage:
Implement the Comparable interface for a class representing a Person 
with attributes like name, age, and height. Sort an array of Person 
objects based on their age.
 */
package comparable.interfsce.com;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>
{
	private String name;
	private int age;
	private int height;
	public Person(String name, int age, int height) 
	{
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	@Override
	public int compareTo(Person o) 
	{
		if(this.age == o.age)
		{
			return 0;
		}
		else if(this.age>o.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public String getName() 
	{
		return name;
	}
	public int getAge() 
	{
		return age;
	}
	public int getHeight() 
	{
		return height;
	}
	@Override
	public String toString() 
	{
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
}
public class PersonAttributes 
{

	public static void main(String[] args) 
	{
		Person p = new Person("Omkar",24,123);
		Person p1 = new Person("Harshad",12,120);
		Person p2 = new Person("Aditya",34,121);
		Person p3 = new Person("Sangram",31,122);
		Person p4 = new Person("Raj",44,115);
		ArrayList<Person> a1 = new ArrayList<Person>();
		a1.add(p);
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		a1.add(p4);
		System.out.println("Before sort: \n-----------------------------");
		System.out.println("Name\tHeight\tAge");
		for(Person e:a1)
		{
			System.out.println(e.getName()+"\t"+e.getHeight()+"  \t"+e.getAge());
		}
		Collections.sort(a1);
		System.out.println("----------------------------");
		System.out.println("After Age wise sort: \n-----------------------------");
		System.out.println("Name\tHeight\tAge");
		for(Person e:a1)
		{
			System.out.println(e.getName()+"\t"+e.getHeight()+"  \t"+e.getAge());
		}
	}

}
