import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Examiner extends Participant{
    private ExamScript examScript;

    public Examiner(ExamControllerOffice examControllerOffice, int id) {
        super(examControllerOffice,id);
    }

    public void sendDocs(List<ExamScript> examScripts){
        Random random=new Random();
        List<Integer> marks=new ArrayList<>();

        int idx= random.nextInt(examScripts.size());

        for(int i=0;i<examScripts.size();i++){
            if(i==idx){
                marks.add(examScripts.get(i).getMarks()-5);
            }
            else{
                int rand=random.nextInt();
                if(rand%2==0){
                    marks.add(examScripts.get(i).getMarks()-5);
                }
                else{
                    marks.add(examScripts.get(i).getMarks());
                }
            }
        }

        Documents docs=new Documents();
        docs.examScripts=examScripts;
        docs.marks=marks;

        System.out.println("Exam scrips and marksheets sent from examiner");
        getExamControllerOffice().send(this,docs);
    }

    @Override
    public void receive(Documents docs) {
        System.out.println("Exam script received by examiner");
        examScript=docs.examScripts.get(0);

        //reexamine();
    }
}
