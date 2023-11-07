package Mahsulotlar;

import Mahsulotlar.Main;

import java.util.Scanner;

public class Haqida_ extends Main {
    public static void Haqida(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Apple bu uzbekistanda ishlab chiqarilgan sayt\n" +
                "bu saytda orginal iPhonelarni uzbekistonda turib korib chiqishingiz mumkin \n" +
                "Biz bilgan narsalarni sizga ulashishda dovom etamz\n" +
                "E'tibor ila Kasimov Bilol & Ibroxm Hasanov.");
        System.out.println("Keyingi uchun-1");
        int i = in.nextInt();
        if (i == 1) {
            Main.menyu(args);
        } else {
            System.out.println("Eror!");
            System.out.println("Dasturdan chiqildi!");
        }

    }
}
