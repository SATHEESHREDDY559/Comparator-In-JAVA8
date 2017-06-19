package org.bejjanki.comparator.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bejjanki.comparator.model.Person;



public class Test2 {

	public static void main(String[] args) {
		Person p1= new Person("Raju","Thada",21);
		Person p2= new Person("Vikram","Thada",17);
		Comparator<Map.Entry<Integer, Person>> cmp=(e1, e2 )->{
			
		if(e1.getValue().getAge()>e2.getValue().getAge() )	
			return 2;
		else if(e1.getValue().getAge()>e2.getValue().getAge())
			return -1;
		else
			return 0;
		
			
		};
		
		Map<Integer, Person> map = new HashMap<>();
		map.put(1,p1);
		map.put(2, p2);
		List<Map.Entry<Integer, Person>> list = new ArrayList<>(map.entrySet());
		
		System.out.println("......Before sorting.....");
		for (Map.Entry<Integer, Person> person : map.entrySet()) {
			System.out.println("First Name: "+person.getValue().getFirstName()+", Last Name:  "+person.getValue().getLastName()+"& Age: "+person.getValue().getAge());
		}
	
		Collections.sort(list,cmp);
		Map<Integer, Person> mapsorted = new LinkedHashMap<>();
		for (Map.Entry<Integer, Person> entry : list) {
			mapsorted.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println("......After sorting.....");
		for (Map.Entry<Integer, Person> person : map.entrySet()) {
			System.out.println("First Name: "+person.getValue().getFirstName()+", Last Name:  "+person.getValue().getLastName()+"& Age: "+person.getValue().getAge());
		}
		
		
		
		

	}

}
