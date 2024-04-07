import java.util.Scanner;
      
public class PositiveDifferenceFunction {
	public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);

		System.out.println("Enter Number");
       		int number1 = input.nextInt();
	
		System.out.println("Enter Number");
       		int number2 = input.nextInt();

                 int difference = number1 - number2;

                 if (number1 < number2)
                   System.out.print(number2 - number1);           
          
                else {
        
                 System.out.printf("%d", difference);
                 }
              
                
                
                
}
}
                