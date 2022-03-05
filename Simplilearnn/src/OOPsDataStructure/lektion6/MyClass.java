package OOPsDataStructure.lektion6;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        //variable
        Scanner obj = new Scanner(System.in);
        int n;

        //REad value
        System.out.println("Enter any NUmber:");
        n = Integer.parseInt(obj.nextLine());


        //logic
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + "X" + i+ "=" + n*i);

        }
    }
}
