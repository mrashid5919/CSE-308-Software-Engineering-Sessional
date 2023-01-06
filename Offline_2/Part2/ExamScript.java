public class ExamScript {
    private int studentID;
    private int marks;
    private int status;

    public ExamScript(int studentID,int marks){
        this.studentID=studentID;
        this.marks=marks;
        this.status=0; //not evaluated yet
    }

    public int getStudentID(){
        return studentID;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "Student with ID "+studentID+" received "+marks;
    }
}
