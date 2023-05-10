import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        greeting();
        repeatName();
        guessAge();
        countNumber();
        testQuestion();
    }
    public static void greeting (){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi New Friend!");
        System.out.println("What is your name?");
        String name = scan.nextLine();
    }
    public static void repeatName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("I'm sorry. Can you please repeat your name again?");
        String repeatName= scan.nextLine();
        System.out.println("Nice to meet you " + repeatName + "!");
    }
    public static void guessAge(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Can I guess how old you are?");
        System.out.println("Enter any number from 1 -10");

        int num = Integer.parseInt(scan.nextLine());
        int number = ((num * 2) + 5)* 50;
        System.out.println(number);

        System.out.println("Did you recently celebrated your birthday?");
        String birthdayPass=scan.nextLine();

        if( birthdayPass.equals("yes")){
            int age = number + 1772;
            System.out.println(age);
            System.out.println("What year were you born?");
            int birthYear= Integer.parseInt(scan.nextLine());
            int correctAge= Integer.valueOf((age-birthYear)% 100);
            System.out.println("You are " + correctAge);
        }else{
            int age = number + 1772;
            System.out.println(age);
            System.out.println("What year were you born?");
            int birthYear= Integer.parseInt(scan.nextLine());
            int correctAge= Integer.valueOf((age-birthYear)% 100);
            System.out.println("You are " + correctAge + ".");
        }
        System.out.println("Am I right?");
        String guessingAge = scan.nextLine();

        if(guessingAge.equals("yes")|| guessingAge.equals("yeah")||guessingAge.equals("y")||guessingAge.equals("yelp")){
            System.out.println("AWESOME!");
        }else{
            System.out.println("Oh darn!");
        }
    }
    public static void countNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Now, enter a number and let's count");
        int countNum = Integer.valueOf(scan.nextLine());

        for (int i = 1; i< countNum+1; i++ )
            System.out.println(i);
    }
    public static void testQuestion(){
        Scanner scan = new Scanner(System.in);

        System.out.println("What data type is used to store true or false values in Java?");
        System.out.println("A: int");
        System.out.println("B: boolean");
        System.out.println("C: float");
        System.out.println("D: char");

        while (true)
        {
            String answer = scan.nextLine();
            if ( answer.equals("B")|| answer.equals("b")){
                break;
            }
            else System.out.println("Please, try again.");
        }
        System.out.println("YAY!, That is correct.");
    }

}


