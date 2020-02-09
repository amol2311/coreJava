import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String... strings ) {
		
		//no duplicates
		/*Set<String> test =  new HashSet<>();
		test.add("a");
		test.add("b");
		test.add("a");*/
		
		//System.out.println(test);
		//Duplicates with custom object
		/*Set<Student> students =  new HashSet<>();
		students.add(new Student(1,"ABC"));
		students.add(new Student(1,"ABC"));
		
		System.out.println(students);*/
		
		
		//LinkedHashSet is ordered
		/*HashSet<String> h =  new HashSet<>();
		h.add("ABC");
		h.add("DEF");
		h.add("XYZ");
		System.out.println(""+h);
		
		LinkedHashSet<String> h1 =  new LinkedHashSet<>();
		h1.add("ABC");
		h1.add("DEF");
		h1.add("XYZ");
		System.out.println(""+h1);*/
		
		//TreeSet
		/*Set<String> mylist =  new TreeSet<>();
		//TreeSet with string
		mylist.add("xyz");
		mylist.add("abc");
		mylist.add("123");
		
		System.out.println(mylist);*/
		
		// TreeSet with students
		Student s =  new Student(1,"XYZ");
		Student s1 =  new Student(2,"DEF");
		Student s2 =  new Student(3,"ABC");
		Set<Student> students =  new TreeSet<>(new IdComparator());
		students.add(s);
		students.add(s1);
		students.add(s2);
		System.out.println(students);
	}
	
	


}


class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Student)o1).getName().compareTo(((Student)o2).getName());
	}
	
}

class IdComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Integer)((Student)o1).getId()).compareTo(((Integer)((Student)o2).getId()))
;
	}
	
}
class Student implements Comparable
{
	int id;
	String name;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//This method uncomment if student class implements Comparable
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		return getName().compareTo(((Student)o).getName());
	}
	
	/*public int hashcode() {
		return id;
	}*/
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	
}
