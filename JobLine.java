/*
    В этом классе будут реализованы команды управления человеками через "рабочую строку".
    Если придумаешь название класса по лучше напиши сдесь:
*/
package jobinfprog;

import java.util.Scanner;

public class JobLine {
    static Human objA = new Human();
    static Scanner in = new Scanner(System.in);

    public static String[] comArr = new String[] {"LIST BANK TABLES", "LIST HUM TABLES", "_HELP", "_HELP COMMANDS", "_CLOSE", "_CREATED HUMAN"};

    public static class CommandsJobLine {

//
//        public static void CreatedHuman(){
//
//            // этот момент мне тоже не очень нравится, его лучше когда-нибудь переписать -_-
//            System.out.println("Enter parameters of new human: \n");
//
//            System.out.println("age $> ");
//            int aAge = in.nextInt();
//
//            System.out.println("name $> ");
//            String aName = in.nextLine();
//
//            System.out.println("first name $> ");
//            String aFirstName = in.nextLine();
//
//            System.out.println("salary $> ");
//            float aSalary = in.nextFloat();
//
//            System.out.println("Home index $> ");
//            String aHomeIndex = in.nextLine();
//
//            System.out.println("Bank Acc $>");
//            String aBankAcc = in.nextLine();
//
//            System.out.println("Arrears $> ");
//            float aArrears = in.nextFloat();
//
//            Human hum0 = new Human(aAge, aName, aFirstName, aSalary, aHomeIndex, aBankAcc, aArrears);
//        }

        public static void ListBankCom(Human humObj){
            System.out.println("------------------------");
            System.out.println("| Bank Account |" + humObj.bankAcc + "|" ); 
            System.out.println("| Bank Arrears |" + humObj.arrears + "|" ); 
            System.out.println("------------------------");

    }

public static void ListHumCom(Human humObj) {
            System.out.println("---------------------------");
            System.out.println("| Human age        | " + humObj.age        + "|" );
            System.out.println("| Human name       | " + humObj.name       + "|" );
            System.out.println("| Human first name | " + humObj.firstName  + "|" );
            System.out.println("| Human home index | " + humObj.homeIndex  + "|");
            System.out.println("---------------------------");
        }
    }

    public static class CommandsHelpLine{

        public static void ListHelpCom() {
            System.out.println("Эта программа была создана, для управления и наблюдения за человеками \n" +
                    "Все комманды с параметром list будут выводить параметры человеков, пользуйтесь :)\n" +
                    "Чтобы увидеть список всех команд для управления человеками - введите _help commands,.\n " +
                    "где _help - это комманда, а commands - это параметр. Также можно узнать про определённые команды \n" +
                    "Все команды могут работать в любом регистре, но некоторые комманды (вроде _help ) \n" +
                    " лучше вводить в верхнем регистре :D Помогите мне сделать так, чтобы программа не закрывалась после  \n" +
                    "использования одного метода! return - работает ни так :'( ");
        }

        public  static  void ListArrOfComm() {
            for(String i: comArr){
                System.out.println(i);
            }
         }
    }
}
