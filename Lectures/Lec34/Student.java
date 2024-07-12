package Lec34;

public class Student {
//	constructor
	public Student(){
		System.out.println("hii");
	}
	String name;
	int age;
	public void Intro_yourSelf() {
		System.out.println("My name is "+this.name +" and age is "+this.age);
	}
	public void sayHey(String name) {
		
		System.out.println(this.name+" say hey " +name);		
	}
//	ṣtatic block
	static {
		System.out.println("This is my file: ");
	}

}
