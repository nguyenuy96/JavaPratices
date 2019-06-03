import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.Scanner;

/*
 * Comparator in java
 */
public class Comparator {

	// private static Scanner sc;

	public static void main(String[] args) {
		/*
		 * Test example compare
		 * 
		 */
		// Integer a = new Integer(null); // -> Throws NullPointerException
		// compare(1,a);
		// reversed();
//		thenComparing();
	}

	/*
	 * Method: int compare(T o1, T o2) Parameters: - o1 - the first object to be
	 * compared. - o2 - the second object to be compared. Return: a negative
	 * integer, zero, or a positive integer as the first argument is less than,
	 * equal to, or greater than the second. Throws: - NullPointerException - if an
	 * argument is null and this comparator does not permit null arguments -
	 * ClassCastException - if the arguments' types prevent them from being compared
	 * by this comparator.
	 */
	// static void compare(int numb1, int numb2) {
	// int returnVal = Integer.compare(numb1, numb2);
	// switch (returnVal) {
	// case -1:
	// printResult(numb1 + "<" + numb2);
	// break;
	// case 0:
	// printResult(numb1 + "=" + numb2);
	// break;
	// case 1:
	// printResult(numb1 + ">" + numb2);
	// break;
	// }
	// }

	/*
	 * Comparator<T> reversed
	 * 
	 */
	// static void reversed() {
	// String[] strings = { "banana", "orange", "apple" };
	// System.out.printf("before sort: %s%n", Arrays.toString(strings));
	// java.util.Comparator<String> c = (String::compareTo);
	// Integer[] ints = {1,2,3,4,5,6};
	// java.util.Comparator<Integer> c = (Integer::compareTo);
	// Arrays.sort(ints, Collections.reverseOrder(c));
	// System.out.printf("after sort: %s%n", Arrays.toString(ints));
	// }

	/*
	 * Method: default Comparator<T> thenComparing(Comparator<? super T> other)
	 */
//	static void thenComparing() {
//		List<Person> personList= new ArrayList<>();
//		for(int i = 20; i >= 0; i--) {
//			Person person = new Person(20,"FirstName", "MiddleName" + i, "LastName" + i);
//			personList.add(person);
//		}
//		java.util.Comparator<Person> byAge = (person1, person2) -> {
//			return Integer.compare(person1.getAge(), person2.getAge());
//		};
//		java.util.Comparator<Person> byFirstName = (person1, person2) -> {
//			return person1.getFirstName().compareTo(person2.getFirstName());
//		};
//		java.util.Comparator<Person> byMiddleName = (person1, person2) -> {
//			return person1.getMiddleName().compareTo(person2.getMiddleName());
//		};
//		java.util.Comparator<Person> byLastName = (person1, person2) -> {
//			return person1.getLastName().compareTo(person2.getLastName());
//		};
//		java.util.Comparator<Person> sortPerson = byAge
//				.thenComparing(byFirstName.thenComparing(byMiddleName.thenComparing(byLastName)));
//		personList.sort(sortPerson);
//		for (Person person : personList) {
//			System.out.println(person.getAge() + person.getFirstName() + person.getMiddleName() + person.getLastName());
//		}
//
//	}

	static void printResult(String str) {
		System.out.print(str);
	}

}

class Person {
	private int age;
	private String firstName;
	private String middleName;
	private String lastName;

	public Person() {
	}

	public Person(int age, String firstName, String middleName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
