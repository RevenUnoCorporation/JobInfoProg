/*
 Данное ПО как и КОД можно свободно передовать, копировать и изменять,
 но передовать продукт нужно с этим сообщением. Слава Линуксу! (@^@)
 */

package jobinfprog;

import javax.management.MBeanAttributeInfo;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

import static javafx.application.Platform.exit;

public class MainTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String comm;
        int tre;
        Human hum1 = null;

        System.out.println("чтобы узнать больше - введите _help \n ");
//--------------------------------------------------------------------------



        // щас мы спросим что хочет админ? из списка команд найдём желаемую команду и исполним её :D
        System.out.print("enter your command $> ");
        comm = in.nextLine();

        // вдруг что?
        if(comm.isEmpty()){
            //System.out.println("Ты чё? Ты чё, друг? Если тебе не нравится - закрой прогу и иди нахер отсюда, ты её сломать надеелся? Иди отсюда, нам таких не надо -_- "); - плохой вариант
            System.out.println("Command - not enter -_-  ");
            return;
        }
            // я тут немного подумал и решил, что если делать плохо, то делать плохо хотя-бы чуть-более быстро и красиво.
           // Вместо if() конструкции, я решил использовать switch case, он вроде тоже был в С++

        switch(comm.toUpperCase()) {// вот тут мы говорим, что всё, что мы введём будет переведено в верхний регистр.
            case "_HELP":
                JobLine.CommandsHelpLine.ListHelpCom();
                break;
            case "_HELP COMMANDS":
                JobLine.CommandsHelpLine.ListArrOfComm();
                break;
            case "_CREATED HUMAN":
                
                System.out.println("Enter parameters of new human: \n");

                System.out.println("name $> ");
                String aName = in.nextLine();

                System.out.println("homeIndex $>");
                String aHomeIndex = in.nextLine();

                hum1 = new Human(0, aName, null, (float) 0.0, aHomeIndex, 0);
                
            case "LIST BANK TABLES":

                JobLine.CommandsJobLine.ListBankCom(hum1);
                break;
            case "_CLOSE":
                System.out.println("Goodbay!");
                System.exit(0);
                break;
            default:
                System.out.println("Command - not found :( ");
        }


//      где-то тут я хотел реалезовать выполнение команды с помощью массива с собственно именами этих самых команд.
//       Я долго пытался, но что-то не прокатило - не фартануло(( Если придумаешь что-нибудь, будь добр сообщи))
//
//        Arrays.sort(JobLine.comArr);
//       tre = Arrays.binarySearch(JobLine.comArr, comm); // пока-что --> до лучших времён '"'
//
//       //мало-ли, что...
//       if(tre == -1){
//           //System.out.println("Ты чё? Ты чё, друг? Либо ты открываешь глаза и вводишь комманду нормально, либо идёшь нахер отсюда. Будешь мне тут программу портить -__-");
//           System.out.println("Command not found");
//       }

    }
}
