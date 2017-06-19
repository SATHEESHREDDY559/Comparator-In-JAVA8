package org.bejjanki.comparator.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.bejjanki.comparator.model.Person;



public class Test {

	public static void main(String[] args) {
		Person p1= new Person("b","c",21);
		Person p2= new Person("b","c",11);
		Comparator<Person> cmp= Comparator.comparing(Person::getAge)
											.thenComparing(Person::getFirstName)
											.thenComparing(Person::getLastName);
											
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		System.out.println("......Before sorting.....");
		for (Person person : list) {
			System.out.println("First Name: "+person.getFirstName()+", Last Name:  "+person.getLastName()+"& Age: "+person.getAge());
		}
		Collections.sort(list,cmp);
		
		System.out.println("......After sorting.....");
		for (Person person : list) {
			System.out.println("First Name: "+person.getFirstName()+", Last Name:  "+person.getLastName()+"& Age: "+person.getAge());
		}
		
		
		
		

	}

}
