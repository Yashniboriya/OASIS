import java.util.Scanner;
public class onlineexam{
    public static void main(String args[])
    {
        int no = 4;
        int choice;
        String student_name;
        int roll_no=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE ONLINE EXAMINATION SYSTEM\n");
        System.out.println("Enter Student Name:\n");
        student_name=sc.nextLine();
        System.out.println("Enter your Roll Number:\n");
        roll_no=sc.nextInt();
        int count = 0;
        do{
            System.out.println("1: Start Exam\n");
            System.out.println("2: View Result of Exam:\n");
            System.out.println("3: Exit\n");
            no = sc.nextInt();
            if(no == 3){
                System.out.println("Thanks for appearing in the Exam...\n");
                break;
            }
            switch(no)
            {
                case 1:
                       {
                        System.out.println("Select Programming Language for Exam\n");
                        System.out.println("1: Java \n 2: Python\n");
                        System.out.println("Enter your choice\n");
                        int subject=sc.nextInt();
                        System.out.println("There are 3 Question in each subject exam\n");
                        if(subject == 1)
                         {
                            count = 0;
                            System.out.println("Ques.1-->  JDK stands for ____.\n");
                            System.out.println("1) Java development kit 2) Java deployment kit 3) JavaScript deployment kit 4) None of these\n");
                            System.out.println("Enter Answer\n");
                            choice = sc.nextInt();
                            if(choice == 1)
                            {
                                ++count;
                            }
                            System.out.println("\n-----------------------------------------------------------------------------------------------------------\n");
                           System.out.println("Ques.2-->  JRE stands for ____.\n");
                           System.out.println("1) Java development kit 2) Java deployment kit 3) Java Runtime Environment 4) None of these\n"); 
                           System.out.println("Enter Answer\n");
                           choice = sc.nextInt();
                            if(choice == 3)
                            {
                                ++count;
                            }
                            System.out.println("\n-----------------------------------------------------------------------------------------------------------\n");
                            System.out.println("Ques.3-->   What makes the Java platform independent?\n");
                           System.out.println("1) Advanced programming language 2) It uses bytecode for execution 3) Class compilation 4) All of these\n"); 
                           System.out.println("Enter Answer\n");
                           choice = sc.nextInt();
                            if(choice == 2)
                            {
                                ++count;
                            }
                            System.out.println("\n-----------------------------------------------------------------------------------------------------------\n");
                         }
                         else{
                            count=0;
                            System.out.println("Ques.1-->   Who developed the Python language?\n");
                            System.out.println("1) Zim Den 2) Guido van Rossum 3) Niene Stom 4) Wick van Rossum\n");
                            System.out.println("Enter Answer\n");
                            choice = sc.nextInt();
                            if(choice == 2)
                            {
                                ++count;
                            }
                            System.out.println("\n-----------------------------------------------------------------------------------------------------------\n");
                            System.out.println("Ques.2-->   In which language is Python written?\n");
                           System.out.println("1) English 2) PHP 3) C 4) All of these\n"); 
                           System.out.println("Enter Answer\n");
                           choice = sc.nextInt();
                            if(choice == 3)
                            {
                                ++count;
                            }
                            System.out.println("\n-----------------------------------------------------------------------------------------------------------\n");
                            System.out.println("Ques.3-->  Which one of the following is the correct extension of the Python file?\n");
                           System.out.println("1) .py 2) .python 3) .p 4) None of these\n"); 
                           System.out.println("Enter Answer\n");
                           choice = sc.nextInt();
                            if(choice == 1)
                            {
                                ++count;
                            }
                            System.out.println("\n-----------------------------------------------------------------------------------------------------------\n");
                            break;
                         }
                       }
                case 2:
                    {
                        System.out.println("You Scored "+count+"out of 3");
                    }       
            }
        }
        while(true);
    }
    public onlineexam(){
        
    }
}