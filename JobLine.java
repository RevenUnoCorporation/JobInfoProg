/*
    В этом классе будут реализованы команды управления человеками через "рабочую строку".
    Если придумаешь название класса по лучше напиши сдесь:
*/
package jobinfprog;

import java.util.Scanner;

public class JobLine extends Human {
    static Human objA = new Human();
    static Scanner in = new Scanner(System.in);
    public static String[] comArr = new String[] {"ListBankCom", "ListHumCom", "_HELP", "_HELP COMMANDS", "_CLOSE"};

    public static class CommandsJobLine {

        public static void ListBankCom(Human humObj){
            System.out.println("------------------------");
            System.out.println("| Bank Account |" + humObj.bankAcc + "|" ); // и сюда тоже
            System.out.println("| Bank Arrears |" + humObj.arrears + "|" ); // ну и сюда и.т.д.
            System.out.println("------------------------");

    }

        public void ListHumCom() {
            System.out.println("---------------------------");
            System.out.println("| Human age|" + objA.age + "|");
            System.out.println("| Human name |" + objA.name + "|");
            System.out.println("| Human first name|" + objA.firstName + "|");
            System.out.println("| Human home index|" + objA.homeIndex + "|");
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
                    " лучше вводить в верхнем регистре :D ");
        }

        public  static  void ListArrOfComm() {
            for(String i: comArr){
                System.out.println(i);
            }
         }
    }
}
