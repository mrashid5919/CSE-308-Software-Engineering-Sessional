import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Component> CompanyList=new ArrayList<>();
        Component curcompany,curmanager;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Do you want to continue: y/n");
            String op=sc.nextLine();
            if(op.equals("y")){
                if(CompanyList.size()==0){
                    System.out.println("Enter Company Name:");
                    String x=sc.nextLine();
                    addCompany(CompanyList, sc, x);
                }
                else{
                    while(true){
                        System.out.println("What do you want to do: Enter 1/2/3/4");
                        System.out.println("1.Add new company");
                        System.out.println("2.Take an existing company");
                        System.out.println("3.Print all company hierarchy");
                        System.out.println("4.Exit");
                        String x=sc.nextLine();
                        if(x.equals("1")){
                            System.out.println("Enter Company Name:");
                            x=sc.nextLine();
                            addCompany(CompanyList, sc, x);
                        }
                        else if(x.equals("2")){
                            System.out.println("Enter company number: ");
                            for(int i=1;i<=CompanyList.size();i++){
                                System.out.println(i+CompanyList.get(i-1).getName());
                            }
                            x=sc.nextLine();
                            curcompany=CompanyList.get(Integer.parseInt(x)-1);
                            while(true){
                                System.out.println("What do you want to do? Enter 1/2/3/4");
                                System.out.println("1. Add a new project");
                                System.out.println("2. Delete existing project");
                                System.out.println("3. Delete developer");
                                System.out.println("4. Print a manager's details");
                                System.out.println("5. Print company hierarchy");
                                System.out.println("6. Exit");
                                x=sc.nextLine();
                                if(x.equals("1")){
                                    AddProject(curcompany, sc);
                                }
                                else if(x.equals("2")){
                                    System.out.println("Existing projects:");
                                    for(int i=1;i<=curcompany.getChildren().size();i++){
                                        System.out.println(i+curcompany.getChildren().get(i-1).getProjectName());
                                    }
                                    System.out.println("Enter the project number you want to delete:");
                                    x=sc.nextLine();
                                    curcompany.removeChild(curcompany.getChildren().get(Integer.parseInt(x)-1));
                                }
                                else if(x.equals("3")){
                                    //System.out.println("Existing developers in this company:");
                                    curcompany.show();
                                    int flag=0;
                                    System.out.println("Enter developer's name:");
                                    x=sc.nextLine();
                                    for(int i=0;i<curcompany.getChildren().size();i++){
                                        for(int j=0;j<curcompany.getChildren().get(i).getChildren().size();j++){
                                            if(curcompany.getChildren().get(i).getChildren().get(j).getName().equals(x)){
                                                curcompany.getChildren().get(i).removeChild(curcompany.getChildren().get(i).getChildren().get(j));
                                                flag=1;
                                                break;
                                            }
                                        }
                                        if(flag==1){
                                            break;
                                        }
                                    }
                                }
                                else if(x.equals("4")){
                                    System.out.println("Existing managers:");
                                    for(int i=1;i<=curcompany.getChildren().size();i++){
                                        System.out.println(i+curcompany.getChildren().get(i-1).getName());
                                    }
                                    System.out.println("Enter the manager number:");
                                    x=sc.nextLine();
                                    System.out.println(curcompany.getChildren().get(Integer.parseInt(x)-1));
                                }
                                else if(x.equals("5")){
                                    curcompany.show();
                                }
                                else if(x.equals("6")){
                                    break;
                                }
                            }

                        }
                        else if(x.equals("3")){
                            for (Component c:CompanyList){
                                c.show();
                            }
                        }
                        else if(x.equals("4")){
                            break;
                        }
                    }

                }
            }
            else if(op.equals("n")){
                break;
            }
        }
    }

    private static void AddProject(Component curcompany, Scanner sc) {
        String x;
        Component curmanager;
        System.out.println("Enter project name: ");
        String pr=sc.nextLine();
        System.out.println("Enter project manager's name: ");
        x=sc.nextLine();
        curmanager=new ProjectManager(x,pr);
        curcompany.addChild(curmanager);
        while(true){
            System.out.println("Do you want to add a developer? y/n");
            x=sc.nextLine();
            if(x.equalsIgnoreCase("y")){
                System.out.println("Enter developer's name: ");
                x=sc.nextLine();
                Component dev=new Developer(x);
                curmanager.addChild(dev);
            }
            else{
                break;
            }
        }
    }

    private static void addCompany(List<Component> companyList, Scanner sc, String x) {
        Component curcompany;
        Component curmanager;
        curcompany=new Company(x);
        companyList.add(curcompany);
        System.out.println("Do you want to create a project? y/n");
        x= sc.nextLine();
        if(x.equalsIgnoreCase("y")){
            AddProject(curcompany, sc);
        }
        System.out.println("Do you want to see company hierarchy? y/n");
        x= sc.nextLine();
        if(x.equalsIgnoreCase("y")){
            curcompany.show();
        }
    }
}
