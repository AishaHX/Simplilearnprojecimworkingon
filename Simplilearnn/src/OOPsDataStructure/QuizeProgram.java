package OOPsDataStructure;

import java.util.Scanner;

public class QuizeProgram {
    public static void main(String[] args) {
        /*Skapa ett quiz program som  frågar vem är founder på roigin blue,
        1.programmet ska hämta svaret från user och sparar nummret
        2.den måste provide 4 frågor där den 4de är exit , så den kan exit från loopet
        3.den looper och frågor om personen vill gissa igen eller går ur från loopen
         */
        Scanner scnobj = new Scanner(System.in);
        while (true){
            System.out.println("Who is the founder for Origin Blue , Choose 1 number? ");
            System.out.println("1.Bill gate \n2. jeff b \n3.elon \n4.Exit the program");
            int rightNum = scnobj.nextInt();
            if (rightNum == 1){
                System.out.println("congs You choose the correct answe , choose 4 to exit th program or guess again ");
                System.out.println( "\n");
            }else if (rightNum==4){
                break;
            }else{
                System.out.println("soryy you didnot guess right ! pleas try again");
            }
                //end if

        }//end while

    }
}
