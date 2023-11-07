package Mahsulotlar;

import listlar.Obyektlar;

import java.util.Scanner;

public class iPad_ extends Main {
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_WHITE = "\u001B[37m";

    public static void iPad(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_WHITE + "1 - iPad Pro\n2 - iPad\n3 - iPad mini\n4. Orqaga");
        int i = in.nextInt();
        if (i < 4) {
            switch (i) {
                case 1 -> _iPad_Pro(args);
                case 2 -> _iPad(args);
                case 3 -> _iPad_Mini(args);
                case 4 -> iPad(args);
                default -> {
                    System.out.println("Noto'g'ri tanlov");
                    iPad(args);
                }
            }
        } else {
            System.out.println("Noto'g'ri tanlov");
        }

    }

    private static void _iPad_Mini(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.iPad - 1 Mini\n2.iPad -2 Mini\n3.iPad - 3 Mini\n4.iPad - 4 Mini\n5.iPad - 5 Mini\n6.iPad - 6 Mini\n7.iPad - 7 Mini\n");
        int i = in.nextInt();
        if (i < 8) {
            switch (i) {
                case 1 -> {
                    System.out.println(TEXT_RED + "1. iPad - 1 Mini sotuvda yo'q" + TEXT_RED);
                    iPad(args);
                }
                case 2 -> {
                    System.out.println(TEXT_RED + "2. iPad - 2 Mini sotuvda yo'q" + TEXT_RED);
                    iPad(args);
                }
                case 3 -> {
                    System.out.println(TEXT_RED + "3. iPad - 3 Mini sotuvda yo'q" + TEXT_RED);
                    iPad(args);
                }
                case 4 -> {
                    System.out.println(TEXT_RED + "4. iPad - 4 Mini sotuvda yo'q" + TEXT_RED);
                    iPad(args);
                }
                case 5 -> {
                    System.out.println("5. iPad - 5 Mini");
                    System.out.println("Operatsion versiya\n" +
                            "iPadOS 14\n" +
                            "Protsessor\n" +
                            "Apple A12 Bionic\n" +
                            "Ekran piksellari o'ziga tegishli\n" +
                            "2048x1536\n" +
                            "Wi-Fi standarti\n" +
                            "802.11ac\n" +
                            "Old kamera\n" +
                            "7 MP\n" +
                            "asosiy kamera\n" +
                            "8 MP\n" +
                            "Vazn\n" +
                            "300 g\n" +
                            "Ekran turi\n" +
                            "IPS\n" +
                            "Ekran o'lchami\n" +
                            "7,9\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "256 GB\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga 2");
                    int i1 = in.nextInt();
                    if (i1 == 1) {
                        switch (i1) {
                            case 1 -> {
                                iPad(args);
                            }
                        }
                    } else {
                        System.out.println("Dasturdan chiqildi");
                        iPad(args);
                    }
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        iPad(args);
                    }
                }
                case 6 -> {
                    System.out.println("6. iPad - 6 Mini");
                    System.out.println("Xususiyatlari\n" +
                            "Doimiy xotira hajmi\n" +
                            "64 ГБ\n" +
                            "Protsessor\n" +
                            "Apple A15 Bionic\n" +
                            "Ekran piksellari o'lchamlari\n" +
                            "2266x1488\n" +
                            "Wi-Fi standarti\n" +
                            "802.11ax\n" +
                            "Frontal kamera\n" +
                            "12 МП\n" +
                            "Asosiy kamera\n" +
                            "12 МП\n" +
                            "Vazn\n" +
                            "293 г\n" +
                            "Ekran turi\n" +
                            "IPS\n" +
                            "Ekran o'lchami\n" +
                            "8.3\"\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga 2");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        iPad(args);
                    }
                }
                case 7 -> {
                    System.out.println(TEXT_RED + "7. iPad - 7 Mini sotuvda yo'q" + TEXT_RED);
                    iPad(args);
                }

            }
        }
    }

    private static void _iPad(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.iPad - 1\n2.iPad -2\n3.iPad - 3\n4.iPad - 4\n5.iPad - 5\n6.iPad - 6\n7.iPad - 7\n8.iPad - 8\n9.iPad - 9\n10.iPad -10\n11.iPad - 11\n12.iPad - 12\n");
        int i = in.nextInt();
        if (i < 13) {
            switch (i) {
                case 1 -> {
                    System.out.println(TEXT_RED + "1. iPad - 1 sotuvda yo'q" + TEXT_RED);
                    iPad(args);
                }
                case 2 -> {
                    System.out.println(TEXT_RED + "2. iPad - 2 sotuvda yo'q" + TEXT_RED);
                    iPad(args);
                }
                case 3 -> {
                    System.out.println(TEXT_RED + "3. iPad - 3 sotuvda yo'q" + TEXT_RED);
                    iPad(args);
                }
                case 4 -> {
                    System.out.println(TEXT_RED + "4. iPad - 4 sotuvda yo'q" + TEXT_RED);
                    iPad(args);
                }
                case 5 -> {
                    System.out.println("5. iPad - 5 ");
                    System.out.println("Xususiyatlari\n" +
                            "Operatsion tizim versiyasi\n" +
                            "iPadOS 14\n" +
                            "Markaziy protsessor\n" +
                            "Apple A12 Bionic\n" +
                            "Pikseldagi ekran o'lchamlari\n" +
                            "2048x1536\n" +
                            "Wi-Fi standarti\n" +
                            "802.11ac\n" +
                            "Old kamera\n" +
                            "7 MP\n" +
                            "Asosiy kamera\n" +
                            "8 MP\n" +
                            "Og'irligi\n" +
                            "300 g\n" +
                            "Ekran turi\n" +
                            "IPS\n" +
                            "Ekran o'lchami\n" +
                            "7,9 dyuym\n" +
                            "Doimiy xotira hajmi\n" +
                            "256 GB\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga 2");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        iPad(args);
                    }
                }
                case 6 -> {
                    System.out.println(TEXT_RED + "6. iPad - 6 sotuvda yo'q" + TEXT_RED);
                    iPad(args);
                }
                case 7 -> {
                    System.out.println("7. iPad - 7");
                    System.out.println("Xususiyatlari\n" +
                            "Brend\n" +
                            "Apple\n" +
                            "Operativ xotira hajmi\n" +
                            "2 ГБ\n" +
                            "Doimiy xotira hajmi\n" +
                            "32 ГБ\n" +
                            "Ekran o'lchami\n" +
                            "10.2\"\n" +
                            "Ekran turi\n" +
                            "IPS\n" +
                            "Vazn\n" +
                            "483 г\n" +
                            "Asosiy kamera\n" +
                            "8 МП\n" +
                            "Wi-Fi standarti\n" +
                            "802.11ac\n" +
                            "Ekran piksellari o'lchamlari\n" +
                            "2160x1620\n" +
                            "Protsessor\n" +
                            "Apple A10");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga 2");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        iPad(args);
                    }
                }
                case 8 -> {
                    System.out.println("8. iPad - 8");
                    System.out.println("Xususiyatlari\n" +
                            "Protsessor\n" +
                            "Apple A12 Bionic\n" +
                            "Wi-Fi standarti\n" +
                            "802.11ac\n" +
                            "Old kamera\n" +
                            "1 MP\n" +
                            "asosiy kamera\n" +
                            "8 MP\n" +
                            "Vazn\n" +
                            "490 gr\n" +
                            "Ekran piksellari o'ziga tegishli\n" +
                            "2160x1620\n" +
                            "Ekran turi\n" +
                            "IPS\n" +
                            "Ekran o'lchami\n" +
                            "10,2\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "32 GB\n" +
                            "Operativ xotira hajmi\n" +
                            "3 GB\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga 2");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        iPad(args);
                    }
                }
                case 9 -> {
                    System.out.println("9. iPad - 9");
                    System.out.println("Xususiyatlari\n" +
                            "Protsessor\n" +
                            "Apple A13 Bionic\n" +
                            "Wi-Fi standarti\n" +
                            "802.11ac\n" +
                            "Old kamera\n" +
                            "12 MP\n" +
                            "asosiy kamera\n" +
                            "8 MP\n" +
                            "Vazn\n" +
                            "487 gr\n" +
                            "Ekran piksellari o'ziga tegishli\n" +
                            "2160x1620\n" +
                            "Ekran turi\n" +
                            "IPS\n" +
                            "Ekran o'lchami\n" +
                            "10,2\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "64 GB\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga 2");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        iPad(args);
                    }
                }
                case 10 -> {
                    System.out.println("10. iPad - 10");
                    System.out.println("Xususiyatlari\n" +
                            "Protsessor\n" +
                            "Apple A14 Bionic\n" +
                            "Wi-Fi standarti\n" +
                            "802.11ac\n" +
                            "Old kamera\n" +
                            "12 MP\n" +
                            "asosiy kamera\n" +
                            "12 MP\n" +
                            "Vazn\n" +
                            "481 gr\n" +
                            "Ekran piksellari o'ziga tegishli\n" +
                            "2360x1640\n" +
                            "Ekran turi\n" +
                            "IPS\n" +
                            "Ekran o'lchami\n" +
                            "10,9\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "64 GB\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga 2");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        iPad(args);
                    }
                }
                case 11 -> {
                    System.out.println("11. iPad - 11");
                    System.out.println("Xususiyatlari\n" +
                            "Protsessor\n" +
                            "Apple M1\n" +
                            "Wi-Fi standarti\n" +
                            "802.11ax\n" +
                            "Old kamera\n" +
                            "7 MP\n" +
                            "asosiy kamera\n" +
                            "12 MP, 10 MP\n" +
                            "Vazn\n" +
                            "466 gr\n" +
                            "Ekran piksellari o'ziga tegishli\n" +
                            "2388x1668\n" +
                            "Ekran turi\n" +
                            "IPS\n" +
                            "Ekran o'lchami\n" +
                            "11,0\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "128 GB\n" +
                            "Operativ xotira hajmi\n" +
                            "8 GB\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga 2");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        iPad(args);
                    }
                }
                case 12 -> {
                    System.out.println("12. iPad - 12");
                    System.out.println("Xususiyatlari\n" +
                            "Batareya quvvati\n" +
                            "10758 mA / soat\n" +
                            "Protsessor\n" +
                            "Apple M2\n" +
                            "Wi-Fi standarti\n" +
                            "802.11ax\n" +
                            "Old kamera\n" +
                            "12 MP\n" +
                            "asosiy kamera\n" +
                            "12 MP, 10 MP\n" +
                            "Vazn\n" +
                            "682 gr\n" +
                            "Ekran piksellari o'ziga tegishli\n" +
                            "2732x2048\n" +
                            "Ekran turi\n" +
                            "IPS\n" +
                            "Ekran o'lchami\n" +
                            "12,9\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "128 GB\n" +
                            "Operativ xotira hajmi\n" +
                            "8 GB\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga 2");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        iPad(args);
                    }
                }
                default -> {
                    iPad(args);
                }
            }
        }
    }

    private static void _iPad_Pro(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_WHITE + "1. iPad Pro 12.9 ");
        int i = in.nextInt();
        if (i <= 1) {
            switch (i) {
                case 1 -> {
                    System.out.println("iPad Pro 12.9");
                    System.out.println("Xususiyatlari\n" +
                            "Protsessor\n" +
                            "Apple M1\n" +
                            "Wi-Fi standarti\n" +
                            "802.11ax\n" +
                            "Old kamera\n" +
                            "12 MP\n" +
                            "asosiy kamera\n" +
                            "12 MP, 10 MP\n" +
                            "Vazn\n" +
                            "682 gr\n" +
                            "Ekran piksellari o'ziga tegishli\n" +
                            "2732x2048\n" +
                            "Ekran turi\n" +
                            "IPS\n" +
                            "Ekran o'lchami\n" +
                            "12,9\"\n" +
                            "Doimiy xotira hajmi\n" +
                            "128 GB\n" +
                            "Operativ xotira hajmi\n" +
                            "8 GB\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Keyingi uchun - 1");
                    System.out.println("Orqaga 2");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Dasturdan chiqildi!");
                        iPad(args);
                    }
                }
                default -> {
                    iPad(args);
                }
            }
        }
    }
}
