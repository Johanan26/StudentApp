package ie.atu;

public class StudentApp
{
    private String studentName;
    private String studentEmail;
    private String studentCourse;

    //Default Constructor
    public Student() {
        this.studentName = "";
        this.studentEmail = "";
        this.studentCourse ="";
    }

    //Display Student A Data
    public void displayInfo(){System.out.println("STUDENT 1\n" + "Name: "+ getName() + " \n"+ "Email: " + getEmail() + " \n"+ "Course: " +getCourse()+ "\n\n");}

    //getters
    public String getName(){return studentName;}

    public String getEmail(){return studentEmail;}

    public String getCourse(){return studentCourse;}

    //setters
    public Student(String studentAName){
        this.studentBName = studentAName;
    }
    public void setStudentBEmail(String studentBEmail){
        this.studentBEmail = studentBEmail;
    }
    public void setCourseBName(String studentBCourse){
        this.studentBCourse = studentBCourse;
    }
    public void setName(String studentName){this.studentName= studentName;}
    public void setEmail(String studentEmail){this.studentEmail=studentEmail;}
    public void setCourse(String studentCourse){this.studentCourse=studentCourse;}


}
