public class Student {

private String StudentName;
private String StudentFaculty;
private String StudentId;

public String getId(){
return StudentId;
}

public void setId(String id){
this.StudentId = id;
}

public String getFaculty(){
return StudentFaculty;
}

public void setFaculty(String faculty){
this.StudentFaculty = faculty;
}

public String getName(){
return StudentName;
}

public void setName(String name){
this.StudentName = name;
}

}
