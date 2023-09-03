import java.util.*;
public class ConditionalStatement {
    public static void main(String[] args){
        int number,age,m1,m2,m3;
        float average;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();
        if(number%2 == 0){
            System.out.println("Number is even!!");
        }else{
            System.out.println("Number is odd!!");
        }
        
        
        System.out.println("Now Enter the age of the person");
        age = sc.nextInt();
        if(age>=14 && age<=44){
            System.out.println("Person is Young");
        }else{
            System.out.println("Person is not Young");

        }
        
        System.out.println("Enter the marks of the student");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        
        average = (m1+m2+m3)/3;
        if(average > 80){
            System.out.println("Grade: A");
        }else if(average >=70 || average <=80){
            System.out.println("Grade: B");
        }else if(average >=60 || average <70){
            System.out.println("Grade: B");
        }
        else{
            System.out.println("Grade: F");
        }
        
    }
}
