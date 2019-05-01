import java.util.*;
 
public class pos {
    
    public static void main(String[] args) { 
    		int i = 1;
    		System.out.print("Welcome to Palindrome Tester\n");
    		Scanner sc = new Scanner(System.in);
    		while(i==1) {
    			System.out.print("Enter a number:");
    			
            	int num=sc.nextInt();
            	if(num == -1) {
            		System.out.println("Bye!");
            		i = 0;
            		//Scanner.close();
            	}
            		
            	else if (num == flip(num))
            		System.out.println("Yes, it is a palindrome.\n");
            	else
            		System.out.println("Not a palindrome.\n");
            	
            
    		}
    		//
    }
	
    public static int flip(int num){
        int result=0;
        while(num!=0){
            result= result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
}