
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double boy,kg,vucutKitleEndeksi;

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz:");
        boy = input.nextDouble();


        System.out.println("Lütfen kilonuzu giriniz:");
        kg = input.nextDouble();


        vucutKitleEndeksi = (kg)/(boy*boy);
        System.out.println("Vücut kitle endeksi :"+vucutKitleEndeksi);






    }
}