import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExamControllerOffice examControllerOffice=new ExamControllerOffice();

        List<Student> studentList=new ArrayList<>();
        Examiner examiner=new Examiner(examControllerOffice,1);
        System.out.println("Enter number of students(>0): ");
        Scanner sc=new Scanner(System.in);
        int studentCount;
        while(true)
        {
            String x=sc.nextLine();
            try{
                studentCount=Integer.parseInt(x);
            }catch (Exception e){
                System.out.println("Invalid input. Enter valid integer");
                continue;
            }
            if(studentCount==0){
                System.out.println("Invalid input. Enter valid integer");
                continue;
            }
            break;
        }
        for(int i=0;i<studentCount;i++){
            studentList.add(new Student(examControllerOffice,i+1));
        }

        examControllerOffice.setExaminer(examiner);
        examControllerOffice.setStudentList(studentList);

        List<ExamScript> examScripts=new ArrayList<>();

        Random random=new Random();

        for(int i=0;i<studentCount;i++){
            examScripts.add(new ExamScript(i+1,random.nextInt(101)));
        }
        examiner.sendDocs(examScripts);


            while(true) {
                System.out.println("Do you want to send reexamination request? y/n");
                String x = sc.nextLine();
                if (x.equalsIgnoreCase("y")) {
                    System.out.println("Enter your student ID: ");
                    int id;
                    while (true) {
                        x= sc.nextLine();
                        try {
                            id = Integer.parseInt(x);
                        } catch (Exception e) {
                            System.out.println("Enter valid ID");
                            continue;
                        }
                        if (id < 1 || id > studentCount) {
                            System.out.println("Invalid ID. Please try again: ");
                            continue;
                        }
                        studentList.get(id - 1).reexaminationRequest();
                        break;
                    }
                } else if (x.equalsIgnoreCase("n")) {
                    System.out.println("System closing");
                    break;
                } else {
                    System.out.println("Invalid input. Enter y or n");
                }
            }
    }
}
