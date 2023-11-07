package Mahsulotlar;

import listlar.Obyektlar;

import java.util.Scanner;

public class Watch {
    public static final String TEXT_RED = "\u001b[31m";

    public static void Watch(){
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_RED + "Apple Watch" + TEXT_RED);
        String i = in.next();
        System.out.println("1.Series 5\n2.Series 6\n3.Series 7\n4.Series 8\n Series 9");
        int i1 = in.nextInt();
        if (i1 < 5) {
        switch (i1){
            case 1: {
                System.out.println("Watch 5");
                System.out.println("Xususiyatlari\n" +
                        "Wi-fi\n" +
                        "Yemoq\n" +
                        "Og'irligi\n" +
                        "36 g\n" +
                        "Kuzatuv\n" +
                        "uyqu, kaloriya, jismoniy faollik, qondagi kislorod darajasi\n" +
                        "Sensorlar\n" +
                        "akselerometr, giroskop, yurak urish tezligi monitori, kompas, altimetr, yorug'lik sensori\n" +
                        "OS muvofiqligi\n" +
                        "iOS\n" +
                        "Operatsion tizim\n" +
                        "OSni tomosha qiling\n" +
                        "Bluetooth standarti\n" +
                        "5.0\n" +
                        "Tasma materiali\n" +
                        "silikon\n" +
                        "Ekran o'lchamlari\n" +
                        "368x448\n" +
                        "Ekran turi\n" +
                        "OLED\n" +
                        "NFC\n" +
                        "Yemoq\n" +
                        "GPS\n" +
                        "Yemoq\n" +
                        "Brend\n" +
                        "Apple");
                System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
                System.out.println("Orqaga - 2");
                int i4 = in.nextInt();
                if (i4 == 1) {
                    Obyektlar.ishchi.menu();
                } else {
                    Watch();
                }
                break;
            }
            case 2:
                System.out.println("Watch 6");
                System.out.println("Xususiyatlari\n" +
                        "Ekran diagonali\n" +
                        "1,69\"\n" +
                        "Himoya darajasi\n" +
                        "IP6X\n" +
                        "Uy-joy materiali\n" +
                        "alyuminiy\n" +
                        "Wi-fi\n" +
                        "Yemoq\n" +
                        "Og'irligi\n" +
                        "32 g\n" +
                        "Kuzatuv\n" +
                        "uyqu, kaloriya, jismoniy faollik, qondagi kislorod darajasi\n" +
                        "Sensorlar\n" +
                        "akselerometr, giroskop, yurak urish tezligi monitori, kompas, altimetr, yorug'lik sensori\n" +
                        "OS muvofiqligi\n" +
                        "iOS\n" +
                        "Operatsion tizim\n" +
                        "OSni tomosha qiling\n" +
                        "Bluetooth standarti\n" +
                        "5.0\n" +
                        "Ekran o'lchamlari\n" +
                        "352x430\n" +
                        "Ekran turi\n" +
                        "OLED\n" +
                        "NFC\n" +
                        "Yemoq\n" +
                        "GPS\n" +
                        "Yemoq\n" +
                        "Brend\n" +
                        "Apple");
                System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
                System.out.println("Orqaga - 2");
                int i4 = in.nextInt();
                if (i4 == 1) {
                    Obyektlar.ishchi.menu();
                } else {
                    Watch();
                }
                break;
            case 3:
                System.out.println("Watch 7");
                System.out.println("Uy-joy materiali\n" +
                        "alyuminiy\n" +
                        "Wi-fi\n" +
                        "Yemoq\n" +
                        "Og'irligi\n" +
                        "32 g\n" +
                        "Kuzatuv\n" +
                        "uyqu, kaloriya, jismoniy faollik, qondagi kislorod darajasi\n" +
                        "Sensorlar\n" +
                        "akselerometr, giroskop, yurak urish tezligi monitori, kompas, altimetr, yorug'lik sensori\n" +
                        "OS muvofiqligi\n" +
                        "iOS\n" +
                        "Operatsion tizim\n" +
                        "OSni tomosha qiling\n" +
                        "Bluetooth standarti\n" +
                        "5.0\n" +
                        "Ekran o'lchamlari\n" +
                        "352x430\n" +
                        "Ekran turi\n" +
                        "OLED\n" +
                        "NFC\n" +
                        "Yemoq\n" +
                        "GPS\n" +
                        "Yemoq\n" +
                        "Brend\n" +
                        "Apple");
                System.out.println(Main.TEXT_GREEN + "Keyingi uchun - 1");
                System.out.println("Orqaga - 2");
                int i3 = in.nextInt();
                if (i3 == 1) {
                    Obyektlar.ishchi.menu();
                } else {
                    Watch();
                }
                break;
            case 4:
                System.out.println("Series 8 sotuvda yoq");
                in.next();
                break;
            case 5:
                System.out.println("Seies 9 ");
                break;
        }
        }

    }
}
