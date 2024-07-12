package Lec35;

public class Student {
	private String name = "Taj";
	private int age = 18;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	public Student() {
		System.out.println(name+" "+age);
		
	}
	public Student(String name,int age) {
		this.name = name;
		this.age = age;		
		System.out.println(name+" "+age);
	}
}
