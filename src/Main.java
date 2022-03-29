import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String wyraz = scan.nextLine();
        String wyrazout = wyraz.toUpperCase();
        System.out.println(wyrazout);
        String wyrazout2 = wyraz.toLowerCase();
        System.out.println(wyrazout2);

    }
}