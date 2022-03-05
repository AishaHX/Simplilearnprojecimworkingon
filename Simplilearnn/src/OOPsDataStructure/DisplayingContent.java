package OOPsDataStructure;

import java.util.Scanner;

public class DisplayingContent {
    public static void main(String[] args) {
        //Factorial Program ex , meaning keep multiplying the number until reached the number it self
        // 3! = 1*2*3 = 6
        //5! = 1*2*3*4*5 = 120
        int n ; //user input
        int fact_var = 1;
        Scanner scannobj = new Scanner(System.in);
        System.out.println("Enter a Number : "); //reading input from the user
        n = scannobj.nextInt();
        /*int fact_var = 1;
        for (int i = 1; i <= n; i++) { // just loops through of the number the user inputed , it starts from 1 to the number of the user , ex if user input is 3 , the loop will loop from 1 , 2, 3
            fact_var = fact_var*i; // här är sparas det the value i holds och briefiesly valuen , för att 1*2 = 2 * 3 = 6 , så den kan multiplicera */
        //calculating factorial for loop
       for (int i = 1; i <= n; i++) {
            fact_var = fact_var*i;
        }
        System.out.println("Factorial of the number " + n + "is: " + fact_var);
        //calculating factorial while loop
        /*
        * while loop ha always
        * 1 . i nitial value
        * 2.terminating addition
        * 3. step value , increasing or deccreasing
        * */
        int x =1; //i nitial value
        int c ;
        System.out.println("Enter a Number 2 : "); //reading input from the user

        c = scannobj.nextInt();
        while (x <= c){ //terminating addition
            fact_var*=x;
            x++; //step value , increasing or deccreasing

        }
        System.out.println("Factorial of the number " + c + "is: " + fact_var);

    }

}
