
import java.util.*;


public class basic {
    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);


        System.out.println(" enter operator : ");

        int operator = sc.nextInt();
        
        System.out.println("enter a : ");
        int a = sc.nextInt();

        System.out.println("enter b:");

        int b= sc.nextInt();

        

      switch(operator){
        
        
        case  0: 
        int sum =a+b;
        System.out.println( sum);
                      break;
                    
        case 1 :System.out.println(a - b);
                   break;

        case 2: System.out.println( a* b);
                   break;
 
        case 3  : System.out.println(a / b);
                   break;
        
        default: System.out.println(a%b) ;   
          
        }
        
    }
}



// boiler code plate