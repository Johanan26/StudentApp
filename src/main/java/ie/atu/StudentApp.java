package ie.atu;

public class StudentApp
{
    private String studentName;
    private String studentEmail;
    private String studentCourse;
    private String studentBName;
    private String studentBEmail;
    private String studentBCourse;

    //Default Constructor
    public Student() {
        this.studentName = "";
        this.studentEmail = "";
        this.studentCourse ="";
    }

    //Display Student A Data
    public void displayInfo(){System.out.println("STUDENT 1\n" + "Name: "+ getName() + " \n"+ "Email: " + getEmail() + " \n"+ "Course: " +getCourse()+ "\n\n");}

    //Display Student B Data
    public void displayInfoB(){System.out.println("STUDENT 2\n" + "Name: "+ studentBName + " \n"+ "Email: " + studentBEmail + " \n"+ "Course: " + studentBCourse + "\n\n");}

    //Getters
    public String getStudentBEmail(){
        return studentBEmail;
    }
    public String getCourseAName(){
        return studentBCourse;
    }

    public String getName(){return studentName;}

    public String getEmail(){return studentEmail;}

    public String getCourse(){return studentCourse;}

    //Setters

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