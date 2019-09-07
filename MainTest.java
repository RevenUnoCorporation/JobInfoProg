/*
 Эта программа сделана, для контроля
 и управления человеками. Настоящая версия: 0.3

 Данное ПО как и КОД можно свободно передовать, копировать и изменять,
 но передовать продукт нужно с этим сообщением. Слава Линуксу!
 */

package jobinfprog;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class MainTest{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String comm;
        int tre;
        JobLine.CommandsJobLine humObj = new JobLine.CommandsJobLine();
        Human hum0 = null;
        System.out.println("чтобы узнать больше - введите _help \n ");

        //-----------------------------------------------------------------------------------------

        // щас мы спросим что хочет админ,
        //из списка команд найдём желаемую и исполним её :D

        System.out.print("enter your command $> ");
        comm = in.nextLine();

        // вдруг что?
        if(comm.isEmpty()){
            System.out.println("Command - not enter, idiot -_-  ");
            return;
        }

        //------------------------------------------------------------------------------------------

           // Вместо if() конструкции, я решил использовать switch case, он 
           // удобней, быстрей и красивей. 

        switch(comm.toUpperCase()) {

            case "_CREATED HUMAN":
                // этот момент мне тоже не очень нравится, его лучше когда-нибудь переписать -_-
                // Ну не могу я вызвать hum0 из другого класса((
                //ещё тут надо много проверок, и я фиг знает через что их писать ;(

                System.out.print("Enter parameters of new human: \n");

                System.out.println("age $> ");
                int aAge = in.nextInt();

                System.out.println("name $> ");
                String aName = in.nextLine();

                System.out.println("first name $> ");
                String aFirstName = in.nextLine();

                System.out.println("salary $> ");                  // склеиваются строки. очень плохо. Фиг знает что это 0_о
                float aSalary = in.nextFloat();

                System.out.println("Home index $> ");
                String aHomeIndex = in.nextLine();

                System.out.println("Arrears $> ");
                float aArrears = in.nextFloat();

                System.out.println("Bank Acc $>");
                String aBankAcc = in.nextLine();

                hum0 = new Human(aAge, aName, aFirstName, aSalary, aHomeIndex, aBankAcc, aArrears);
                                                          // это так надо, потом перепишу, Как только смогу перезапускать программу, когда мне нужно :)
            case "LIST HUMAN TABLES":
                JobLine.CommandsJobLine.ListHumCom(hum0);
                break;

            case "LIST BANK TABLES":
                JobLine.CommandsJobLine.ListBankCom(hum0);
                break;
            
            case "_HELP":
                JobLine.CommandsHelpLine.ListHelpCom();
                break;

            case "_HELP COMMANDS":
                JobLine.CommandsHelpLine.ListArrOfComm();
                break;

            case "_CLOSE":
                System.out.println("Goodbay!");
                System.exit(0);
                break;
            default:
                System.out.println("Command - not found :( ");
        }
    }
}
