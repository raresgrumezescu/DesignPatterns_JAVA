package laborator13;

public class UserFactory {
	
	public static User createUser (String userType, String s, String nume) {
		if (userType.equals("Student") == true) {
			return new Student(s, nume);
		}
		
		if (userType.equals("Assistant") == true) {
			return new Assistant(s, nume);
		}
		
		if (userType.equals("Parent") == true) {
			return new Parent(s, nume);
		}
		
		if (userType.equals("Teacher") == true) {
			return new Teacher(s, nume);
		}
		return null;
	}
}
