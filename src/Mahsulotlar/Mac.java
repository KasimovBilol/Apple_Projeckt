package Mahsulotlar;

import listlar.Obyektlar;

import java.util.Scanner;

public class Mac extends Main {
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_WHITE = "\u001B[37m";

    public static void Mac(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_WHITE + "1 - Macbook Pro\n2 - Macbook Air");
        int i = in.nextInt();
        if (i < 2) {
            switch (i) {
                case 1 -> _Macbook_Pro(args);
                case 2 -> Macbook_Air(args);
                case 3 -> Mac(args);
                default -> System.out.println("Noto'g'ri tanlov");
            }
        }
    }

    private static void Macbook_Air(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Macbook Air - m1 - 13 inch\n2. Macbook Air - m2 - 13 inch");
        int i = in.nextInt();
        if (i <= 2) {
            switch (i) {
                case 1 -> {
                    System.out.println(TEXT_RED + "1. Macbook Air - m1 - 13 inch" + TEXT_RED);
                    System.out.println("Ekran: 13,3 dyuymli IPS 2560x1600 (16:10) / Retina displey /\n" +
                            "Protsessor: Apple M1 8 yadroli\n" +
                            "Video karta: Apple M1 8 yadrosi\n" +
                            "Operativ xotira: 8 GB DDR4\n" +
                            "Xotira: 256 GB  M.2 SSD" +
                            "Brend: Apple");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga 2");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        Macbook_Air(args);
                        System.out.println("Eror!");
                        System.out.println("Dasturdan chiqildi!");
                    }
                }
                case 2 -> {
                    System.out.println("2. Macbook Air - m2 - 13 inch");
                    System.out.println("Displey\n" +
                            "\n" +
                            "15,3 dyuym, LED IPS, 2880x1864 piksel, 224 ppi, maksimal yorqinlik 500 nits, 1500:1, TrueTone\n" +
                            "\n" +
                            "Chastotasi 60 Hz\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Markaziy protsessor\n" +
                            "\n" +
                            "Apple M2\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Xotira\n" +
                            "\n" +
                            "8 GB RAM\n" +
                            "\n" +
                            "256 GB ichki xotira\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Simsiz interfeyslar\n" +
                            "\n" +
                            "Wi-Fi 6 (802.11ax)\n" +
                            "\n" +
                            "Bluetooth 5.3\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Sensorlar va ulagichlar\n" +
                            "\n" +
                            "Thunderbolt 3 × 2 (chap tomonda) - USB 4 sifatida ham tanilgan\n" +
                            "\n" +
                            "USB-C × 2 (o'ng tomonda)\n" +
                            "\n" +
                            "3,5 mm eshitish vositasi uyasi\n" +
                            "\n" +
                            "MagSafe 3 tugmachasiga o'rnatilgan barmoq izi sensori - zaryadlash porti\n" +
                            "\n" +
                            "Old kamera\n" +
                            "\n" +
                            "1080p\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Batareya\n" +
                            "\n" +
                            "Li-Pol 66,5 Vt*soat\n" +
                            "\n" +
                            "35 Vt quvvatga ega, 70 Vt tez zaryadlashni qo'llab-quvvatlaydi\n" +
                            "\n" +
                            "Da'vo qilingan ish vaqti - videoni 18 soatgacha ijro etish\n" +
                            "\n" +
                            "Safari-da 15 soatgacha veb-sahifalar");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("2. Orqaga");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        Mac(args);
                    }
                }
            }
        }
    }


    private static void _Macbook_Pro(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Macbook Pro - m1 - 13 inch\n2. Macbook Pro - m2 - 13 inch");
        int i = in.nextInt();
        if (i <= 2) {
            switch (i) {
                case 1 -> {
                    System.out.println("1. Macbook Pro - m1 - 13 inch");
                    System.out.println("Xususiyatlari\n" +
                            "Brend: Apple\n" +
                            "Protsessor liniyasi: Apple M1\n" +
                            "SSD xotira hajmi: 1 TB\n" +
                            "Operativ xotira: 8 GB\n" +
                            "Ekran o'lchami: 13,3\"");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("2. Orqaga");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        Mac(args);
                    }
                }
                case 2->{
                    System.out.println("2. Macbook Pro - m2 - 13 inch");
                    System.out.println("Xususiyatlari\n" +
                            "Apple brendi\n" +
                            "Operativ xotira (GB) 24\n" +
                            "Displey 13,3 LED IPS, 500 nits yorqinligi\n" +
                            "Apple M2 protsessori\n" +
                            "Batareya 20 soatgacha ishlaydi Operativ xotira (GB)\n" +
                            "SSD xotirasi 1TB\n" +
                            "MagSafe portlari, 2 x Thunderbolt 3, USB 4, AUX\n" +
                            "Bluetooth 5.0 va 802.11ax Wi-Fi 6 ulanishi\n" +
                            "Kamera 1080p\n" +
                            "Operatsion tizim macOS Mammoth / macOS Monterey\n" +
                            "Rang Kosmos kulrang\n" +
                            "Model MacBook Pro 13 M2 - Oldindan buyurtma");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("2. Orqaga");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        Mac(args);
                    }
                }
            }
        }
    }
}