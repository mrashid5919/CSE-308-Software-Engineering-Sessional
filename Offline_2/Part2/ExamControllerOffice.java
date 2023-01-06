import java.util.ArrayList;
import java.util.List;

public class ExamControllerOffice implements Mediator{

    private Examiner examiner;
    private List<Student> studentList;

    public void setExaminer(Examiner examiner) {
        this.examiner = examiner;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public void send(Participant participant, Documents docs) {
        if(participant instanceof Student){
            System.out.println("Re-examination request received from student id "+participant.getID());
            System.out.println("Re-examination request forwarded to examiner");
            examiner.receive(docs);
        }

        if(participant instanceof Examiner && docs.marks!=null){
            System.out.println("Exam scripts and marks received from the examiner");

            for(ExamScript e:docs.examScripts){
                System.out.println("Student ID - "+e.getStudentID()+": "+e.getMarks());
            }

            System.out.println();
            System.out.println("Case of mistakes: ");
            for(int i=0;i<docs.examScripts.size();i++){
                if(docs.marks.get(i)!=docs.examScripts.get(i).getMarks()){
                    System.out.println("Student ID - "+docs.examScripts.get(i).getStudentID()+": "+docs.marks.get(i)+"(previous marks), "+ docs.examScripts.get(i).getMarks()+"(corrected marks)");
                }
            }

            Documents tmp;
            for(ExamScript e:docs.examScripts){
                tmp=new Documents();
                tmp.examScripts=new ArrayList<>();
                tmp.examScripts.add(e);

                System.out.println("Result forwarded to student ID: "+e.getStudentID());
                studentList.get(e.getStudentID()-1).receive(tmp);
            }
        }

        if(participant instanceof Examiner && docs.marks==null){
            System.out.println("Re examination response received from examiner");
            ExamScript e=docs.examScripts.get(0);
            if(e.getStatus()==1){
                System.out.println("Marks unchanged");
            }
            else if(e.getStatus()==2){
                System.out.println("Marks increased");
            }
            else if(e.getStatus()==3){
                System.out.println("Marks decreased");
            }

            System.out.println("Reexamination response forwarded to student id: "+e.getStudentID());
            studentList.get(e.getStudentID()-1).receive(docs);
        }
    }
}
