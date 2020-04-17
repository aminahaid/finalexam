import java.util.Scanner;

public class Debug {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("input your name: ");String name = input.nextLine();
            System.out.print("Enter your age: ");
           String age = input.nextLine();
            System.out.print("Enter your DOB year: ");
            String dob=input.nextLine();
            System.out.println("Summary: "+"\n"+ "your name is: "+name +"\n"+"your age is: "+ age+ "\n" +"your birth year is: "+ dob);
}
}