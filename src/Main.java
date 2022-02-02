import java.util.Scanner;
public class Main
{
    /*
     * I - 1
     * V - 5
     * X - 10
     * L - 50
     * C - 100
     */
    public static void main(String[] args) {
        // 1-100 -> ROMAN

        int number =0;
        /*Scanner s = new Scanner(System.in);
        System.out.println("enter a number between 1-100");
        number = s.nextInt();*/


        boolean result = checkInput(number);
        while (result == true){
            System.out.println("the number "+number+" in the roman representation is:");
            //todo - the program purpose
        }
    }
    // print the whole number in roman
    public static void numberToRoman(int original_num){
        int digit_ones = original_num %10;
        int digit_tens = (original_num/10) %10;

        tensToRoman(digit_tens);
        onesToRoman(digit_ones);
    }


    //print the tens digit   in roman
    public static void tensToRoman(int tens){
        //3 -> XXX,  8 ->  LXXX , **4-> XL , **9-> XC
        if(tens>0 && tens<4){
            for (int i=0;i<tens;i++)
                System.out.print("X");
        }
        if (tens>5 && tens<=9) {

        }
        if (tens == 4)
            System.out.println("L");
        if (tens == 100)
            System.out.println("C");

    }





    public static void onesToRoman(int ones){
        //todo - print the ones digit   in roman
        //3 -> III,  7 ->  VII , **4-> IV , **9-> IX
        if(ones>0 && ones<4){
            for (int i =0; i< ones; i++)
                System.out.print("I");
        }
        if(ones == 4)
            System.out.print("IV");

        if(ones>4 && ones<9){//8 -> VIII
            System.out.print("V");

            for (int i =0; i< ones-5; i++)
                System.out.print("I");
        }
        if(ones == 9)
            System.out.println("IX");

        //there is a partial mistake...not now but in the ens u will see it
    }
















    private static boolean checkInput(int number) {
        if(number>=1 && number<=100)
            return true;
        else
            return false;
    }
}
