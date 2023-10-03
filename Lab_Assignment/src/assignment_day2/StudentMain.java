package assignment_day2;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudentId(12);
		s1.setStudentType('l');
		System.out.println(s1.getStudentId()+" "+ s1.getStudentType());
		Student s2= new Student();
		System.out.println(s2.getStudentId()+ " "+ s2.getStudentType());
	}
}
