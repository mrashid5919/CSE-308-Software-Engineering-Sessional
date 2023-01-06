import java.util.ArrayList;
import java.util.List;

public class Student extends Participant{
    private ExamScript examScript;

    public Student(ExamControllerOffice examControllerOffice,int id){
        super(examControllerOffice,id);
    }

    public void reexaminationRequest(){
        if(examScript==null){
            return;
        }

        Documents docs=new Documents();
        List<ExamScript> examScripts=new ArrayList<>();
        examScripts.add(examScript);
        System.out.println("Reexamination request sent from student ID: "+getID());
        getExamControllerOffice().send(this,docs);
    }

    @Override
    public void receive(Documents docs) {
        System.out.println("Exam script received by student with id "+getID());

        examScript = docs.examScripts.get(0);
        System.out.println(examScript);
    }
}
