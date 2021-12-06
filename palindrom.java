import java.util.Scanner;

/**
 * @author fatih-git
 * */

public class palindrom {

    static int dec(int exp){

        int result=1;

        for(int i=1; i<exp; i++){
            result*=10;
        }

        return result;
    }

    static void tersyuz(int num){

        int temp, sayi2=0, digit, count=0;

        temp=num;
        while(temp!=0){

            temp/=10;
            count++;

        }

        digit=dec(count);

        temp=num;
        while(digit!=0){

            sayi2+=digit*(temp%10);
            temp/=10;
            digit/=10;

        }

        if (sayi2==num){
            System.out.println(num+" bir palindromdur.");
        }
        else{
            System.out.println(num+" bir palindrom değildir.");
        }

    }

    public static void main(String[] args) {

        int sayi;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi=input.nextInt();

        tersyuz(sayi);

    }

}
