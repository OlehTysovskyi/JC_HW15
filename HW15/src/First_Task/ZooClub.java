package First_Task;

import java.util.*;
import java.util.Map.Entry;

public class ZooClub {

	LinkedHashMap<Person, List<Animal>> map = new LinkedHashMap<>();
	Scanner scn = new Scanner(System.in);

	public void addPerson() {
		System.out.print("-Enter persons's name: ");
		String name = scn.next();
		System.out.print("-Enter persons's age: ");
		int age = scn.nextInt();
		
		map.put(new Person(name, age), new ArrayList<>());
		
		System.out.println("-Person was added successfully:");
		Set<Entry <Person, List<Animal>>> entrySet = map.entrySet();
		for(Entry<Person, List<Animal>> m : entrySet) {
			System.out.println(m.getKey());
		}

	}

	public void addPet() {
		System.out.print("-Enter persons's name: ");
		String name = scn.next();
		System.out.print("-Enter pet's type: ");
		String petType = scn.next();
		System.out.print("-Enter pet's name: ");
		String petName = scn.next();
		
		Iterator<Entry <Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry <Person, List<Animal>> next = iterator.next();
			if(next.getKey().getName().equals(name)) {
				List<Animal> value = next.getValue();
				value.add(new Animal(petType, petName));
				next.setValue(value);
			}
		}
		System.out.println("-Pet was added successfully:");
		Set<Entry <Person, List<Animal>>> entrySet = map.entrySet();
		for(Entry<Person, List<Animal>> m : entrySet) {
			System.out.println(m.getKey() + "-" + m.getValue());
		}
	}

	public void removePet() {
		System.out.print("-Enter persons's name from who you want to remove pet: ");
		String name = scn.next();
		System.out.print("-Enter pet's name to remove: ");
		String petName = scn.next();		
			 
		Iterator<Entry <Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry <Person, List<Animal>> next = iterator.next();
			if(next.getKey().getName().equals(name)) {
				
				Iterator <Animal> iterator2 = next.getValue().iterator();
				while(iterator2.hasNext()) {
					Animal animal = iterator2.next();
					if(animal.getName().equals(petName)) {
						iterator2.remove();
					}			
				}
			}
		}
		
		System.out.println("-Pet was removed from person successfully:");
		Set<Entry <Person, List<Animal>>> entrySet = map.entrySet();
		for(Entry<Person, List<Animal>> m : entrySet) {
			System.out.println(m.getKey() + "-" + m.getValue());
		}
	}

	public void removePerson() {
		System.out.print("-Enter persons's name to remove: ");
		String name = scn.next();

		Iterator<Entry <Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry <Person, List<Animal>> next = iterator.next();
			if(next.getKey().getName().equals(name)) {
				iterator.remove();
			}
		}	
		if(map.isEmpty()) {
			System.out.println(map);
		} 
		else {
			System.out.println("-Person was removed successfully:");
			Set<Entry <Person, List<Animal>>> entrySet = map.entrySet();
			for(Entry<Person, List<Animal>> m : entrySet) {
				System.out.println(m.getKey() + "-" + m.getValue());
			}
		}		
	}

	public void removeAllPets() {
		System.out.print("-Enter pet's name to remove: ");
		String petName = scn.next();		
			 
		Iterator<Entry <Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry <Person, List<Animal>> next = iterator.next();
			Iterator <Animal> iterator2 = next.getValue().iterator();
			while(iterator2.hasNext()) {
				Animal animal = iterator2.next();
				if(animal.getName().equals(petName)) {
					iterator2.remove();
				}			
			}
		}
		if(map.isEmpty()) {
			System.out.println(map);
		} 
		else {
			System.out.println("-Person was removed successfully:");
			Set<Entry <Person, List<Animal>>> entrySet = map.entrySet();
			for(Entry<Person, List<Animal>> m : entrySet) {
				System.out.println(m.getKey() + "-" + m.getValue());
			}
		}
	}

	public void seeZooClub() {
		System.out.println("-ZooClub:" + "\n" + map);
	}

	public void exit() {
		System.exit(0);
	}
}
