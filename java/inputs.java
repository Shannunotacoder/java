import java.util.Scanner;
public class inputs{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a int value: ");
        int intVal= scanner.nextInt();
        System.out.println("Entered value = " + intVal);

        
        
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter your name :");
        String name = scan.nextLine();
        System.out.println("Hello ," + name);

    }
}