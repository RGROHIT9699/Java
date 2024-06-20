package Lec35;

public class Personal {
	private String name="Kaju";
	private int age = 22;
	public Personal(String name,int age) {
		this.name=name;
		this.age = age;
	}
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
//	public void setAge(int age) throws Exception{
//		if (age<0) {
//			throw new Exception("Galat jawab :(");
//		}
//		this.age = age;
//	}
	public void setAge(int age) {
		try {
			if (age<0) {
				throw new Exception(":(");
			}
			this.age=age; 
		} 
		catch(Exception e){
			e.printStackTrace();
		} finally {
			System.out.println("Finish");
		}
	}

}
