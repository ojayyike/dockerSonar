import java.util.*;
public class HelloSonar {
    public static void main(String[] args) {
        System.out.println("Hello Sonar");
        System.out.println("Enter a number: ");
        
        Scanner object = new Scanner(System.in);
        int num = object.nextInt();
        System.out.println("You entered " + num);
    
    }


}
