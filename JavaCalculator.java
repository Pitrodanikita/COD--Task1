package calci;

import java.util.Scanner;
public class JavaCalculator {
	public static void main(String[] args){
	       Scanner sc = new Scanner(System.in);
	       double operand1,operand2;
	       char operator;

	       do{
		       System.out.println("Enter operand1 : ");
		       operand1 = sc.nextDouble();
	
		       System.out.println("Enter an operator (+,-,*,/,^,or q for quit) :");
		       operator=sc.next().charAt(0);
	
		        if(operator == 'q'){
		            break;
	        }
	        System.out.println("Enter operand2 : ");
	        operand2 = sc.nextDouble();

	        double result=0;
	        switch(operator){
	        
	            case '+' : result = operand1 + operand2;
	                break;
	            case '-' : result = operand1 - operand2;
	                break;
	            case '*' : result = operand1 * operand2;
	                break;
	            case '/' : if(operand2 == 0){
	                            System.out.println("Error: Divison By zero");
	                       }else{
	                            result = operand1 / operand2;
	                       }
	                break;
	            case '^' : result = Math.pow(operand1, operand2);
	        }
	        System.out.println("Answer = " + result);

	        }while(operator != 'q');

	        System.out.println("quit");
	    }
}
