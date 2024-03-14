public class MVCMain {

public static void main(String[] args){

Student model = retrieveStudentFromDatabase();

StudentView view = new StudentView();

StudentController controller = new StudentController(model, view);

// prints details
controller.updateView();

controller.setStudentName("Mary");
System.out.println("\n Student name after updating:");

//prints details again
controller.updateView();

}

private static Student retrieveStudentFromDatabase(){
Student Student = new Student();
Student.setName("Jessica");
Student.setId("2");
Student.setFaculty("Chemistry");
return Student;
}

}

