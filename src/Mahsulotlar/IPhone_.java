package Mahsulotlar;

import listlar.Obyektlar;
import qoshimchaClasslar.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPhone_ extends Main {
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_WHITE = "\u001B[37m";
    private static List<String> Karta_ = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);


    public static void iPhone(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_WHITE + "1-iPhone 8\n2-iPhone X\n3-iPhone Xr\n4-iPhone 11\n5-iPhone 12\n6-iPhone 13\n7-iPhone 14 \n" + TEXT_RED + "8-iPhone 15" + TEXT_RED);
        int i = in.nextInt();
        if (i < 9) {
            switch (i) {
                case 1 -> _8(args);
                case 2 -> _X(args);
                case 3 -> _Xr(args);
                case 4 -> _11(args);
                case 5 -> _12(args);
                case 6 -> _13(args);
                case 7 -> _14(args);
                case 8 -> _15(args);
                default -> System.out.println("Noto'g'ri tanlov");
            }

        } else {
            System.out.println("Noto'g'ri tanlov");
            iPhone(args);
        }
    }

    private static void _15(String [] args) {
        System.out.println(Color.RED + "1.Yangicha dizayn Faqatgina typ-c ozgardi va chap tarafdagi ovossiz tugmachasi ozgardi.");
        System.out.println("1.Taqdimotni korish: ");
        int i = in.nextInt();
        if (i == 1){
            System.out.println("https://www.apple.com/iphone-15-pro/");
            System.out.println("silka utiga bosing va tomosha qiling");
            in.next();
            Main.neew(args);
        }
    }

    private static void _14(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.iPhone - 14\n2.iPhone - 14 Pro\n3.iPhone - 14 Pro Max\n4.iPhone - 14 Plus");
        int i = in.nextInt();
        if (i < 5) {
            switch (i) {
                case 1:
                    System.out.println("iPhone - 14");
                    System.out.println("Chipda tizim\tA16 Bionic\n" +
                            "Xotirasi\t6 GB LPDDR5 RAM\n" +
                            "Saqlash joyi\t128 / 256 / 512 GB / 1 TB\n" +
                            "Displey\t\n" +
                            "14 Pro: 6.1 in (150 mm)\n" +
                            "Andoza:Resx resolution, 19.5:9 ratio (~460 ppi density)\n" +
                            "Super Retina XDR OLED, HDR10, 1000 nits (typ), 2000 nits (peak)");
                    System.out.println("Narxi - 10 947 000 сум" + TEXT_RED);
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga - 2");
                    int i1 = in.nextInt();
                    if (i1 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        iPhone(args);
                    }

                    break;
                case 2:
                    System.out.println("iPhone - 14 Pro");
                    System.out.println("Xususiyatlari\n" +
                            "Ekran yangilanish chastotasi\n" +
                            "120 Гц\n" +
                            "Himoya darajasi\n" +
                            "IP68\n" +
                            "Bluetooth standarti\n" +
                            "5.3\n" +
                            "Protsessor\n" +
                            "Apple A16 Bionic\n" +
                            "Operatsion tizim versiyasi\n" +
                            "iOS 16\n" +
                            "Aloqa standarti\n" +
                            "3G, 4G LTE, VoLTE, 5G, GSM 900/1800/1900\n" +
                            "Old Kamera\n" +
                            "12 МП\n" +
                            "Orqa kamera\n" +
                            "48 МП, 12 МП, 12 МП\n" +
                            "Korpus materiali\n" +
                            "металл и стекло\n" +
                            "Vazn\n" +
                            "240 г\n" +
                            "Ekran tomonlari nisbati\n" +
                            "19.5:9\n" +
                            "Ekran piksellari o'lchamlari\n" +
                            "2796x1290\n" +
                            "Ekran texnologiyasi\n" +
                            "OLED\n" +
                            "Ekran o'lchami\n" +
                            "6.1\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "256 ГБ\n" +
                            "Operativ xotira hajmi\n" +
                            "6 ГБ\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("16 359 000 сум");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga - 2");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        iPhone(args);
                    }
                    break;
                case 3:
                    System.out.println("iPhone - 14 Pro Max");
                    System.out.println(TEXT_RED + "Xozirda sotuvda yoq");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga - 2");
                    int i3 = in.nextInt();
                    if (i3 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        iPhone(args);
                    }
                    break;
                case 4:
                    System.out.println("iPhone - 14 Plus");
                    System.out.println("Xususiyatlari\n" +
                            "Himoya darajasi\n" +
                            "IP68\n" +
                            "Protsessor\n" +
                            "Apple A15 Bionic\n" +
                            "Aloqa standarti\n" +
                            "3G, 4G LTE, VoLTE, 5G, GSM 900/1800/1900\n" +
                            "Eski kamera\n" +
                            "12 MP\n" +
                            "Orqa kamera\n" +
                            "12 MP, 12 MP\n" +
                            "Korpus materiallari\n" +
                            "alyuminiy va shisha\n" +
                            "Vazn\n" +
                            "203 g\n" +
                            "Ekran tomonlari nisbati\n" +
                            "19,5:9\n" +
                            "Ekran piksellari o'ziga tegishli\n" +
                            "2778x1284\n" +
                            "Ekran texnologiyasi\n" +
                            "OLED\n" +
                            "Ekran o'lchami\n" +
                            "6,7\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "128 GB\n" +
                            "Operativ xotira hajmi\n" +
                            "6 GB\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Narxi - 11 686 500 сум");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga - 2");
                    int i4 = in.nextInt();
                    if (i4 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        iPhone(args);
                    }
                    break;

            }
        }
        Obyektlar.ishchi.menu();
    }

    private static void _13(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.iPhone - 13\n2.iPhone - 13 Pro\n3.iPhone - 13 mini\n4.iPhone - 13 Pro Max");
        int i = in.nextInt();
        if (i < 5) {
            switch (i) {
                case 1:
                    System.out.println("iPhone - 13");
                    System.out.println("Himoya darajasi IP68\n" +
                            "Bluetooth 5.0 standarti\n" +
                            "Apple A15 Bionic protsessor\n" +
                            "iOS versiyasi 15\n" +
                            "Aloqa standarti 3G, 4G LTE, VoLTE, 5G, GSM 900/1800/1900\n" +
                            "Old kamera 12 MP\n" +
                            "Asosiy kamera 12 MP, 12 MP, 12 MP\n" +
                            "Korpus materiali metall va shisha\n" +
                            "Og'irligi 203 g\n" +
                            "Ekranning tomonlar nisbati 19,5:9\n" +
                            "Ekran o'lchamlari 2532x1170\n" +
                            "OLED ekran turi\n" +
                            "Ekran o'lchami 6,1\"\n" +
                            "O'rnatilgan xotira 128 GB\n" +
                            "RAM 6 GB\n" +
                            "Apple brendi");
                    System.out.println("Narxi - 10 095 000 so'm");
                    System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
                    System.out.println("Orqaga - 2");
                    int i1 = in.nextInt();
                    if (i1 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        iPhone(args);
                    }
                    break;
                case 2:
                    System.out.println("iPhone - 13 Pro");
                    System.out.println("Himoya darajasi\n" +
                            "IP68\n" +
                            "Bluetooth standarti\n" +
                            "5.0\n" +
                            "Protsessor\n" +
                            "Apple A15 Bionic\n" +
                            "Operatsion tizim versiyasi\n" +
                            "iOS 15\n" +
                            "Aloqa standarti\n" +
                            "3G, 4G LTE, VoLTE, 5G, GSM 900/1800/1900\n" +
                            "Old Kamera\n" +
                            "12 МП\n" +
                            "Orqa kamera\n" +
                            "12 МП, 12 МП, 12 МП\n" +
                            "Korpus materiali\n" +
                            "металл и стекло\n" +
                            "Vazn\n" +
                            "203 г\n" +
                            "Ekran tomonlari nisbati\n" +
                            "19.5:9\n" +
                            "Ekran piksellari o'lchamlari\n" +
                            "2532x1170\n" +
                            "Ekran texnologiyasi\n" +
                            "OLED\n" +
                            "Ekran o'lchami\n" +
                            "6.1\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "256 ГБ\n" +
                            "Operativ xotira hajmi\n" +
                            "6 ГБ\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println(TEXT_RED + "Keyingi uchun - 1");
                    System.out.println("Orqaga - 2");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();

                    } else {
                        iPhone(args);
                    }
                    break;
                case 3:
                    System.out.println("iPhone - 13 Mini");
                    System.out.println("Himoya darajasi\n" +
                            "IP68\n" +
                            "Bluetooth standarti\n" +
                            "5.0\n" +
                            "Protsessor\n" +
                            "Apple A15 Bionic\n" +
                            "Operatsion tizim versiyasi\n" +
                            "iOS 15\n" +
                            "Aloqa standarti\n" +
                            "3G, 4G LTE, VoLTE, 5G, GSM 900/1800/1900\n" +
                            "Old Kamera\n" +
                            "12 МП\n" +
                            "Orqa kamera\n" +
                            "12 МП, 12 МП\n" +
                            "Korpus materiali\n" +
                            "алюминий и стекло\n" +
                            "Vazn\n" +
                            "140 г\n" +
                            "Ekran tomonlari nisbati\n" +
                            "19.5:9\n" +
                            "Ekran piksellari o'lchamlari\n" +
                            "2340x1080\n" +
                            "Ekran texnologiyasi\n" +
                            "OLED\n" +
                            "Ekran o'lchami\n" +
                            "5.4\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "128 ГБ\n" +
                            "Operativ xotira hajmi\n" +
                            "4 ГБ\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
                    System.out.println("Orqaga - 2");
                    int i3 = in.nextInt();
                    if (i3 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        iPhone(args);
                    }
                    break;
                case 4:
                    System.out.println("iPhone - 13 Pro Max");
                    System.out.println("Xususiyatlari\n" +
                            "Himoya darajasi\n" +
                            "IP68\n" +
                            "Protsessor\n" +
                            "Apple A15 Bionic\n" +
                            "Operatsion tizim versiyasi\n" +
                            "iOS 15\n" +
                            "Aloqa standarti\n" +
                            "3G, 4G LTE, VoLTE, 5G, GSM 900/1800/1900\n" +
                            "Old Kamera\n" +
                            "12 МП\n" +
                            "Orqa kamera\n" +
                            "12 МП, 12 МП, 12 МП\n" +
                            "Korpus materiali\n" +
                            "металл и стекло\n" +
                            "Vazn\n" +
                            "238 г\n" +
                            "Ekran tomonlari nisbati\n" +
                            "19.5:9\n" +
                            "Ekran piksellari o'lchamlari\n" +
                            "2778x1284\n" +
                            "Ekran texnologiyasi\n" +
                            "OLED\n" +
                            "Ekran o'lchami\n" +
                            "6.7\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "256 ГБ\n" +
                            "Operativ xotira hajmi\n" +
                            "6 ГБ\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
                    System.out.println("Orqaga - 2");
                    int i4 = in.nextInt();
                    if (i4 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        iPhone(args);
                    }
                    break;
            }
        }
    }

    private static void _12(String[] args) {
        System.out.println(TEXT_RED + "1.iPhone - 12 sotuvda yoq" + TEXT_RED);
        iPhone(args);

    }

    private static void _11(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.iPhone - 11\n2.iPhone - 11 Pro\n3.iphone - 11 Pro Max");
        int i = in.nextInt();
        if (i < 4) {
            switch (i) {
                case 1 -> {
                    System.out.println("iPhone - 11");
                    System.out.println("Xususiyatlari\n" +
                            "\n" +
                            "Ekranni yangilash tezligi\n" +
                            "     60 Gts\n" +
                            "Aloqa standarti\n" +
                            "     3G, 4G LTE, LTE-A, VoLTE, GSM 900/1800/1900\n" +
                            "Uy-joy materiali\n" +
                            "     metall va shisha\n" +
                            "Bluetooth standarti\n" +
                            "     5.0\n" +
                            "Ekran o'lchamlari\n" +
                            "     1792x828\n" +
                            "Ekran nisbati\n" +
                            "     19,5:9\n" +
                            "Ekran turi\n" +
                            "     IPS\n" +
                            "SIM kartalar soni\n" +
                            "     2\n" +
                            "SIM karta turi\n" +
                            "     nano SIM + eSIM\n" +
                            "Himoya darajasi\n" +
                            "     IP68\n" +
                            "Markaziy protsessor\n" +
                            "     Apple A13 Bionic\n" +
                            "OS versiyasi\n" +
                            "     iOS 13\n" +
                            "NFC\n" +
                            "     Yemoq\n" +
                            "Old kamera\n" +
                            "     12 MP\n" +
                            "Asosiy kamera\n" +
                            "     12 MP, 12 MP\n" +
                            "Og'irligi\n" +
                            "     194 gr\n" +
                            "Batareya quvvati\n" +
                            "     3110 mA / soat\n" +
                            "Ekran diagonali\n" +
                            "     6,1\"\n" +
                            "O'rnatilgan xotira hajmi\n" +
                            "     128 GB\n" +
                            "RAM hajmi\n" +
                            "     4GB\n" +
                            "Brend\n" +
                            "     Apple");
                    System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
                    System.out.println("Orqaga - 2");
                    int i4 = in.nextInt();
                    if (i4 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        iPhone(args);
                    }
                }
                case 2 -> {
                    System.out.println("iPhone - 11 Pro");
                    System.out.println("Xususiyatlari\n" +
                            "Ekran yangilanish chastotasi\n" +
                            "60 Gts\n" +
                            "Ekran piksellari o'ziga tegishli\n" +
                            "2436x1125\n" +
                            "SIM karta formati\n" +
                            "nano SIM + eSIM\n" +
                            "SIM-kartalar soni\n" +
                            "2\n" +
                            "Himoya darajasi\n" +
                            "IP68\n" +
                            "Protsessor\n" +
                            "Apple A13 Bionic\n" +
                            "Operatsion versiya\n" +
                            "iOS 13\n" +
                            "Ekran texnologiyasi\n" +
                            "OLED\n" +
                            "Ekran tomonlari nisbati\n" +
                            "19,5:9\n" +
                            "Aloqa standarti\n" +
                            "3G, 4G LTE, LTE-A, VoLTE, GSM 900/1800/1900\n" +
                            "Korpus materiallari\n" +
                            "metall va shisha\n" +
                            "Bluetooth standarti\n" +
                            "5.0\n" +
                            "NFC\n" +
                            "Yemoq\n" +
                            "Eski kamera\n" +
                            "12 MP\n" +
                            "Orqa kamera\n" +
                            "12 MP, 12 MP, 12 MP\n" +
                            "Vazn\n" +
                            "188 gr\n" +
                            "Batareya quvvati\n" +
                            "3190 mA / soat\n" +
                            "Ekran o'lchami\n" +
                            "5,8\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "256 GB\n" +
                            "Operativ xotira hajmi\n" +
                            "4GB\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
                    System.out.println("Orqaga - 2");
                    int i4 = in.nextInt();
                    if (i4 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        iPhone(args);
                    }
                }
                case 3 -> {
                    System.out.println("Iphone - 11 Pro Max");
                    System.out.println("Xususiyatlari\n" +
                            "Ekran yangilanish chastotasi\n" +
                            "60 Gts\n" +
                            "Ekran piksellari o'ziga tegishli\n" +
                            "2688x1242\n" +
                            "SIM karta formati\n" +
                            "nano SIM + eSIM\n" +
                            "SIM-kartalar soni\n" +
                            "2\n" +
                            "Himoya darajasi\n" +
                            "IP68\n" +
                            "Protsessor\n" +
                            "Apple A13 Bionic\n" +
                            "Operatsion versiya\n" +
                            "iOS 13\n" +
                            "NFC\n" +
                            "Yemoq\n" +
                            "Ekran texnologiyasi\n" +
                            "OLED\n" +
                            "Aloqa standarti\n" +
                            "4G LTE, VoLTE, GSM 900/1800/1900\n" +
                            "Ekran tomonlari nisbati\n" +
                            "19,5:9\n" +
                            "Korpus materiallari\n" +
                            "metall va shisha\n" +
                            "Bluetooth standarti\n" +
                            "5.0\n" +
                            "Eski kamera\n" +
                            "12 MP\n" +
                            "Orqa kamera\n" +
                            "12 MP, 12 MP, 12 MP\n" +
                            "Vazn\n" +
                            "226 gr\n" +
                            "Batareya quvvati\n" +
                            "3969 mA / soat\n" +
                            "Ekran o'lchami\n" +
                            "6,5\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "64 GB\n" +
                            "Operativ xotira hajmi\n" +
                            "4GB\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
                    System.out.println("Orqaga - 2");
                    int i4 = in.nextInt();
                    if (i4 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        iPhone(args);
                    }
                }
            }
        }
    }

    private static void _Xr(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("iPhone Xr");
        System.out.println("Xususiyatlari\n" +
                "\n" +
                "Ekranning yangilanish tezligi\n" +
                "     60 Gts\n" +
                "SIM karta turi\n" +
                "     nano SIM + eSIM\n" +
                "SIM kartalar soni\n" +
                "     2\n" +
                "Himoya darajasi\n" +
                "     IP67\n" +
                "Markaziy protsessor\n" +
                "     Apple A12 Bionic\n" +
                "OS versiyasi\n" +
                "     iOS 12\n" +
                "NFC\n" +
                "     Yemoq\n" +
                "Ekran turi\n" +
                "     IPS\n" +
                "Ekran o'lchamlari\n" +
                "     1792x828\n" +
                "Ekran nisbati\n" +
                "     19,5:9\n" +
                "Aloqa standarti\n" +
                "     3G, 4G LTE, LTE-A, VoLTE, GSM 900/1800/1900\n" +
                "Uy-joy materiali\n" +
                "     alyuminiy va shisha\n" +
                "Bluetooth standarti\n" +
                "     5.0\n" +
                "Old kamera\n" +
                "     7 MP\n" +
                "Asosiy kamera\n" +
                "     12 MP\n" +
                "Og'irligi\n" +
                "     194 gr\n" +
                "Batareya quvvati\n" +
                "     2942 mA / soat\n" +
                "Ekran diagonali\n" +
                "     6,1\"\n" +
                "O'rnatilgan xotira hajmi\n" +
                "     64 GB\n" +
                "RAM hajmi\n" +
                "     3 GB\n" +
                "Brend\n" +
                "     Apple");
        System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
        System.out.println("Orqaga - 2");
        int i4 = in.nextInt();
        if (i4 == 1) {
            Obyektlar.ishchi.menu();
        } else {
            iPhone(args);
        }
    }

    private static void _X(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.iPhone - X\n2.iPhone - Xs\n3.iPhone - Xs Max");
        int i = in.nextInt();
        switch (i) {
            case 1:
                System.out.println("iPhone X");
                System.out.println("Xususiyatlari\n" +
                        "Ekranning yangilanish tezligi\n" +
                        "60 Gts\n" +
                        "SIM karta turi\n" +
                        "nano SIM\n" +
                        "SIM kartalar soni\n" +
                        "1\n" +
                        "Himoya darajasi\n" +
                        "IP67\n" +
                        "OS versiyasi\n" +
                        "iOS 11\n" +
                        "NFC\n" +
                        "Yemoq\n" +
                        "Ekran turi\n" +
                        "OLED\n" +
                        "Ekran o'lchamlari\n" +
                        "2436x1125\n" +
                        "Ekran nisbati\n" +
                        "19,5:9\n" +
                        "Aloqa standarti\n" +
                        "3G, 4G LTE, LTE-A, VoLTE, GSM 900/1800/1900\n" +
                        "Uy-joy materiali\n" +
                        "alyuminiy va shisha\n" +
                        "Bluetooth standarti\n" +
                        "5.0\n" +
                        "Markaziy protsessor\n" +
                        "Apple A11 Bionic\n" +
                        "Old kamera\n" +
                        "7 MP\n" +
                        "Asosiy kamera\n" +
                        "12 MP, 12 MP\n" +
                        "Og'irligi\n" +
                        "174 gr\n" +
                        "Batareya quvvati\n" +
                        "2716 mA / soat\n" +
                        "Ekran diagonali\n" +
                        "5,8\"\n" +
                        "O'rnatilgan xotira hajmi\n" +
                        "64 GB\n" +
                        "RAM hajmi\n" +
                        "3 GB\n" +
                        "Brend\n" +
                        "Apple");
                System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
                System.out.println("Orqaga - 2");
                int i4 = in.nextInt();
                if (i4 == 1) {
                    Obyektlar.ishchi.menu();
                } else {
                    iPhone(args);
                }
                break;
            case 2:
                System.out.println("iPhone Xs");
                System.out.println("Xususiyatlari\n" +
                        "Ekran yangilanish chastotasi\n" +
                        "60 Gts\n" +
                        "SIM karta formati\n" +
                        "nano SIM + eSIM\n" +
                        "SIM-kartalar soni\n" +
                        "2\n" +
                        "Himoya darajasi\n" +
                        "IP68\n" +
                        "Protsessor\n" +
                        "Apple A12 Bionic\n" +
                        "Operatsion versiya\n" +
                        "iOS 12\n" +
                        "NFC\n" +
                        "Yemoq\n" +
                        "Ekran texnologiyasi\n" +
                        "OLED\n" +
                        "Ekran piksellari o'ziga tegishli\n" +
                        "2688x1242\n" +
                        "Ekran tomonlari nisbati\n" +
                        "19,5:9\n" +
                        "Aloqa standarti\n" +
                        "3G, 4G LTE, LTE-A, VoLTE, GSM 900/1800/1900\n" +
                        "Korpus materiallari\n" +
                        "metall va shisha\n" +
                        "Bluetooth standarti\n" +
                        "5.0\n" +
                        "Batareya quvvati\n" +
                        "3174 mA / soat\n" +
                        "Eski kamera\n" +
                        "7 MP\n" +
                        "Orqa kamera\n" +
                        "12 MP, 12 MP\n" +
                        "Vazn\n" +
                        "208 g\n" +
                        "Ekran o'lchami\n" +
                        "6,5\"\n" +
                        "Doimiy xotira hajmi\n" +
                        "256 GB\n" +
                        "Operativ xotira hajmi\n" +
                        "4GB\n" +
                        "Brend\n" +
                        "Apple");
                System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
                System.out.println("Orqaga - 2");
                int i3 = in.nextInt();
                if (i3 == 1) {
                    Obyektlar.ishchi.menu();
                } else {
                    iPhone(args);
                }
                break;
            case 3:
                System.out.println("iPhone Xs Max");
                System.out.println("Xususiyatlari\n" +
                        "Ekran yangilanish chastotasi\n" +
                        "60 Gts\n" +
                        "SIM karta formati\n" +
                        "nano SIM + eSIM\n" +
                        "SIM-kartalar soni\n" +
                        "2\n" +
                        "Himoya darajasi\n" +
                        "IP68\n" +
                        "Protsessor\n" +
                        "Apple A12 Bionic\n" +
                        "Operatsion versiya\n" +
                        "iOS 12\n" +
                        "NFC\n" +
                        "Yemoq\n" +
                        "Ekran texnologiyasi\n" +
                        "OLED\n" +
                        "Ekran piksellari o'ziga tegishli\n" +
                        "2688x1242\n" +
                        "Ekran tomonlari nisbati\n" +
                        "19,5:9\n" +
                        "Aloqa standarti\n" +
                        "3G, 4G LTE, LTE-A, VoLTE, GSM 900/1800/1900\n" +
                        "Korpus materiallari\n" +
                        "metall va shisha\n" +
                        "Bluetooth standarti\n" +
                        "5.0\n" +
                        "Batareya quvvati\n" +
                        "3174 mA / soat\n" +
                        "Eski kamera\n" +
                        "7 MP\n" +
                        "Orqa kamera\n" +
                        "12 MP, 12 MP\n" +
                        "Vazn\n" +
                        "208 g\n" +
                        "Ekran o'lchami\n" +
                        "6,5\"\n" +
                        "Doimiy xotira hajmi\n" +
                        "256 GB\n" +
                        "Operativ xotira hajmi\n" +
                        "4GB\n" +
                        "Brend\n" +
                        "Apple");
                System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
                System.out.println("Orqaga - 2");
                int i2 = in.nextInt();
                if (i2 == 1) {
                    Obyektlar.ishchi.menu();
                } else {
                    iPhone(args);
                }
                break;
        }

        System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
        System.out.println("Orqaga - 2");
        int i4 = in.nextInt();
        if (i4 == 1) {
            Obyektlar.ishchi.menu();
        } else {
            iPhone(args);
        }
    }

    private static void _8(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("iPhone - 8");
        System.out.println("Xususiyatlari\n" +
                "\n" +
                "Ekranni yangilash tezligi\n" +
                "     60 Gts\n" +
                "SIM karta turi\n" +
                "     nano SIM\n" +
                "SIM kartalar soni\n" +
                "     1\n" +
                "Himoya darajasi\n" +
                "     IP67\n" +
                "NFC\n" +
                "     Yemoq\n" +
                "Ekran nisbati\n" +
                "     16:9\n" +
                "Ekran turi\n" +
                "     IPS\n" +
                "Aloqa standarti\n" +
                "     3G, 4G LTE, LTE-A, VoLTE, GSM 900/1800/1900\n" +
                "Uy-joy materiali\n" +
                "     alyuminiy va shisha\n" +
                "Bluetooth standarti\n" +
                "     5.0\n" +
                "Ekran o'lchamlari\n" +
                "     1334x750\n" +
                "Markaziy protsessor\n" +
                "     Apple A11 Bionic\n" +
                "Old kamera\n" +
                "     7 MP\n" +
                "Asosiy kamera\n" +
                "     12 MP\n" +
                "Og'irligi\n" +
                "     148 g\n" +
                "Batareya quvvati\n" +
                "     1820 mA / soat\n" +
                "Ekran diagonali\n" +
                "     4,7\"\n" +
                "O'rnatilgan xotira hajmi\n" +
                "     64 GB\n" +
                "RAM hajmi\n" +
                "     2 GB\n" +
                "Brend\n" +
                "     Apple");
        System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
        System.out.println("Orqaga - 2");
        int i4 = in.nextInt();
        if (i4 == 1) {
            Obyektlar.ishchi.menu();
        } else {
            iPhone(args);
        }

    }

}
