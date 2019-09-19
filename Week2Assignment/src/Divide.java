import java.util.Scanner;
public class Divide {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1=0, num2=0, answer=0, remainder;
        System.out.print("Enter the first number > ");
        num1 = s.nextInt();
        System.out.print("Enter the second number > ");
        num2 = s.nextInt();
        if(num1 >= num2){
             answer = num1 / num2;
            remainder = (num1 % num2);
            System.out.format("%d/%d = %d r%d\n",num1,num2,answer,remainder);
             
        }
        else{
            answer = num2 / num1;
            remainder = (num2 % num1);
            System.out.format("%d/%d = %d r%d\n",num2,num1,answer,remainder);
        }
    }
    
}
