/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog;
import static java.lang.Math.pow;
import java.util.Scanner;
/**
 *
 * @author Shriya Paudyal
 */
public class caculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        while(true){
        System.out.print("Enter the first Number: ");
        int x =input.nextInt();
        System.out.print("Enter the Second Number: ");
        int y = input.nextInt();
        
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Minimum");
        System.out.println("6. Maximum");
        System.out.println("7. Power");
        
        System.out.println("8. Exit");
        System.out.print("Enter your choice[1-8]: ");
        int choice =input.nextInt();
        int total =0;
        switch(choice)
        {
            case 1:
                total = x+y;
                break;
            case 2:
                total= x-y;
                break;
             case 3:
                 total=x/y;
                break;
             case 4:
                 total=x*y;
                break;
             case 5:
                 total=(x<y)?x:y;
                break;
             case 6:
                 total=(x>y)?x:y;
                break;
            case 7:
                 total= (int) pow(x,y);
                break;
             
             case 8:
                 System.exit(0);
                break;
        }//switch close    
        
        System.out.println("Output is: "+ total);
        System.out.println("Do You Want To Continue[y/n] : ");
        String ch = input.next();
        if(ch.equalsIgnoreCase("n"))
        {
          System.exit(0);
        }
            

    }//end of while 
        
   }// end of method 
}//end of class 

