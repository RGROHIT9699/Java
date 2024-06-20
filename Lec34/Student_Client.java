package Lec34;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-genserated method stub
		System.out.println("Hello");
		Student s = new Student();
		s.name = "Kaju";
		s.age=2;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Intro_yourSelf();
//		s.mentorName("naam");
//		Student.mentorName("naam");
		
		Student s1 = new Student();
		s1.name = "Kaju";
		s1.age=2;
		System.out.println(s1.name);
		System.out.println(s1.age);
		s1.Intro_yourSelf();
		s1.sayHey("raju");
//		Student.mentorName("kuchNaam");
//		System.out.println();
	}

}
