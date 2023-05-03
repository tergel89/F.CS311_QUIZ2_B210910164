package Course;

public class main {
	public static void main(String[]args) {
		Course course = new Course ("Software Construction");
		course.setCourseName("Software Construction");
		

		System.out.println(course.getCourseName());
		
		course.setCourseName("Программ хангамжийн бүтээл");
		System.out.println(course.getCourseName());
	}
}
