import java.util.*;
import java.lang.*;
public class CurrencyConverter {
    public static void main(String[] args) {
        
        String str;
        int choice;
        double amount;
        System.out.println("Please Enter your name first to begin!!!");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println("Wlecome " + str + " to the currency calculator");
        System.out.println("You will be provided with the currency oprions, Please selece the oprions!!");
        System.out.println("Choose your currency: ");
        System.out.println("1: Ruppee");
        System.out.println("2: Dollar");
        System.out.println("3: Euro");
        choice = sc.nextInt();
        System.out.println("Enter the amount");
        amount = sc.nextLong();
        switch(choice){
            case 1:
                Rupee_to_other(amount);
                break;
            case 2: 
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
        }
    }
    
    public static void Rupee_to_other(double amt){
        
        System.out.println("1 Rupee = "+ 0.012 + "$");
        
        System.out.println(amt + " Rupee =" + (amt*0.012) + "$" );
        System.out.println();
        
        System.out.println("1 Rupee = "+ 0.011 + "Euros");
        System.out.println(amt + " Rupee =" + (amt*0.011) + "Euro" );
    }
    
    public static void Dollar_to_other(double amt){
        
        System.out.println("1$ = "+ 82.72 + "Rupee");
        
        System.out.println(amt + "$ =" + (amt*82.72) + " Rupee" );
        
        
        System.out.println("1$ = "+ 0.93 + "Euros");
        System.out.println(amt + "$ =" + (amt*0.011) + " Euro" );
    }
    
    
    public static void Euro_to_other(double amt){
        
        System.out.println("1 Euro = "+ 89.32 + " Rupee");
        
        System.out.println(amt + " Euro =" + (amt*89.32) + " Rupee" );
        
        
        System.out.println("1 Euro = "+ 1.08 + " $");
        System.out.println(amt + " Euro =" + (amt*1.08) + " $" );
    }
}



