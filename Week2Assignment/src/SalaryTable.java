import java.text.NumberFormat;

public class SalaryTable {
    
    public static void main(String[] args) {
        NumberFormat nf =  NumberFormat.getCurrencyInstance();
        final double RAISE = 1.03;
        double oldsalary = 40000, newsalary = 0, payraise;
              
        System.out.println("YEAR \t OLD SALARY\t RAISE\t\t NEW SALARY");
        System.out.println("---- \t ----------\t -----\t\t ----------");
        System.out.format("%d\t %s\t --- \t\t $40,000.00\n", 1, nf.format(oldsalary), nf.format(newsalary));
        for (int i = 1; i < 10; i++) {
            newsalary = oldsalary * RAISE;
            payraise = newsalary - oldsalary;            
            System.out.format("%d\t %s\t %s\t %s\n", (i+1), nf.format(oldsalary), nf.format(payraise), nf.format(newsalary));
            oldsalary = newsalary;
        }
        
    }
    
}
