import java.util.Scanner;

    public class Debug {
        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            Scanner.out.print("Input your name: ");
            int name =input.nextInt();
            System.out.print("Enter your age: ");
            String Age=input.nextLine();
            System.out.print("Enter your DOB year: ");
            String dob=input.nextLine();
            System.out.println("Summary: "+"Your name is: "+name+"\n"+"Your age is: "+age+"\n"+"Your birth year is: "+dob);
}
}