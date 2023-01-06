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

    public void reexamine(){
        if(examScript==null){
            return;
        }

        Documents docs=new Documents();
        List<ExamScript> examScripts=new ArrayList<>();

        Random random=new Random();
        int rand= random.nextInt(3)+1;

        if(rand==1){
            //unchanged
        }
        else if(rand==2){
            if(examScript.getMarks()==100){
                rand=1;
            }
            else {
                examScript.setMarks(examScript.getMarks()+5);

                if(examScript.getMarks()>100){
                    examScript.setMarks(100);
                }
            }
        }
        else if(rand==3){
            if(examScript.getMarks()==0){
                rand=1;
            }
            else {
                examScript.setMarks(examScript.getMarks()-5);

                if(examScript.getMarks()<0){
                    examScript.setMarks(0);
                }
            }
        }

        examScript.setStatus(rand);
        examScripts.add(examScript);
        docs.examScripts=examScripts;

        System.out.println("Reexamination response sent from examiner");
        getExamControllerOffice().send(this,docs);
    }

    @Override
    public void receive(Documents docs) {
        System.out.println("Exam script received by examiner");
        examScript=new ExamScript(docs.examScripts.get(0).getStudentID(),docs.examScripts.get(0).getMarks());
        //examScript=docs.examScripts.get(0);

        reexamine();
    }
}
