package Giris;

//Use import to get data from the user.
import java.util.Scanner;

public class taskiMetre2 {

    //Create main method.
    public static void main(String[] args) {
        int km;
        double perKm , totalPrice , startPrice;
        perKm = 2.20;
        startPrice = 10;

    //Defined our Scanner class
        Scanner input = new Scanner(System.in);

    //Receive information from the user.
        System.out.print("Lütfen gideceğiniz mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

    // The pricing algorithm created for the taximeter
        totalPrice = startPrice + (km * perKm);
        totalPrice = (totalPrice <= 20) ? 20 : totalPrice;
        System.out.print("Toplam taksi ücretiniz: " + totalPrice);
    }
}
