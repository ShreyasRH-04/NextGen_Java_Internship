
public class ControlStatements {
    public static void main(String[] args) {

        int marks = 75;

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("While loop:");
        int n = 3;

        while (n > 0) {
            System.out.println(n);
            n--;
        }

        System.out.println("do-while loop:");
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
        
    }
}
