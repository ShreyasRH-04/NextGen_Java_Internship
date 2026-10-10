import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        
       System.out.println("Enter student name: ");
       String name = sc.next();
       System.out.println("enter marks for subject 1: ");
       int sub1 = sc.nextInt();
       System.out.println("enter marks for subject 2: ");
       int sub2 = sc.nextInt();
       System.out.println("enter marks for subject 3: ");
       int sub3 = sc.nextInt();

       int[] marks = {sub1,sub2,sub3};

       for(int i=0;i<marks.length;i++){
         if(marks[i]<0 || marks[i]>100){
            System.out.println("Invalid marks for subject " + (i + 1));
            return;
         }
       }

       int total = sub1+sub2+sub3;
       float percentage = (float) ((total/300.0) * 100);
       String Grade;
       if(percentage >= 75){
          Grade="A";
       }
       else if(percentage >= 60 ){
          Grade="B";
       }
       else if(percentage >= 40){
        Grade="C";
       }
       else{
        Grade = "Fail";
       }

       System.out.println("\n----Student Result----");
       System.out.println("Name: "+name);
       System.out.println("Total :"+total+"/300");
       System.out.printf("Percentage : %.2f%%\n",percentage);
       System.out.println("Grade: "+Grade);
    }
}