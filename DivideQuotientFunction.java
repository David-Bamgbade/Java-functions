import java.util.Scanner;
      
public class DivideQuotientFunction {
	public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);

                System.out.println("Enter Number");
       		int number1 = input.nextInt();
	
		System.out.println("Enter Number");
       		int number2 = input.nextInt();

                 int quotient = number1 / number2;

                 if  (number2 > number1) {
                  System.out.print(number1 / number2);  
                  }

                  else if (quotient == 0)
                 System.out.println(quotient);

                 else {              
                 System.out.printf("%d", quotient);
                 }

}
}