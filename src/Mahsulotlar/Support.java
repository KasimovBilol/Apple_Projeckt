package Mahsulotlar;

import Mahsulotlar.IPhone_;
import Mahsulotlar.Main;

import java.util.Scanner;

public class Support {
private static String [] args;
    public static void support() {
        Scanner in = new Scanner(System.in);
        System.out.println("Apple Support");
        System.out.println("https://apps.apple.com/us/app/apple-support/id1130498044?l=en");
        System.out.println("Siz bu ilova orqali muammoaringizni yecha olasiz.");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Aks holda siz 90-829-20-09 raqamiga qongiroq qilishingiz mimkin!");
        String next = in.next();
        Main.menyu(args);
    }
}
