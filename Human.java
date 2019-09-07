/*
 класс Human будет содержать в себе: количество
 человеков, идеинтефикациооный номер каждого, имя, фамилия, его место работы, место проживания,
 возраст, полетические взгляды, заработная плата, задолжености + банковский счёт.

  ^
  |_ только параметры, работа с которыми будет производится в интерфесах или других классах.

*/
package jobinfprog;

public class Human {
    public static int age;
    public static String firstName;
    public static String homeIndex;
    public static String name;
    public static float salary, arrears;
    public static String jobIndex, bankAcc;


    //--------------------------------------------------------
    Human(int age, String name,
          String firstName, Float salary, String homeIndex, String bankAcc, float arrears){

        this.age = age;
        this.arrears = arrears;
        this.bankAcc = bankAcc;
        this.firstName = firstName;
        this.homeIndex = homeIndex;
        this.salary = salary;
        this.name = name;
    }
    Human(){
        age = 0;
        arrears = 0;   // это задолжености ^-^
        bankAcc = null;
        firstName = null;
        homeIndex = null;
        salary = 0;
        name = null;
        jobIndex = null;
    }
}
