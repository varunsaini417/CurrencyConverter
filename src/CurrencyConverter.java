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
        switch(choice){
            case 1:
                Rupee_to_other(amount);
                break;
            case 2: 
                Dollar_to_other(amount);
                break;
        }
        
    }
    
}
