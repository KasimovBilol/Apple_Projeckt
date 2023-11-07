package Mahsulotlar;

import listlar.Obyektlar;

import java.util.Scanner;

public class Air_Pods {
    public static void Air_pods(){
        Scanner in = new Scanner(System.in);
        System.out.println("1.Air-Pods 2-Avlod\n2.Air Pods Max\n3.Air Pods 3-Avlod\n4.Air pods Pro");
        int i = in.nextInt();
        if (i < 5) {
            switch (i) {
                case 1: {
                    System.out.println("Air pods 2-Avlod");
                    System.out.println("Xususiyatlari\n" +
                            "Qutidagi zaryadlash turi\n" +
                            "Chaqmoq\n" +
                            "Qarshilik\n" +
                            "32 Ohm\n" +
                            "Bluetooth versiyasi\n" +
                            "5.0\n" +
                            "Batareyaning ishlash muddati\n" +
                            "24.0 soat\n" +
                            "Ish vaqti\n" +
                            "5,0 soat\n" +
                            "Simsiz ulanish turi\n" +
                            "Bluetooth\n" +
                            "Dizayn xususiyatlari\n" +
                            "mikrofon\n" +
                            "Akustik dizayn turi\n" +
                            "ochiq\n" +
                            "Funksiyalar\n" +
                            "ovozli yordamchini chaqirish\n" +
                            "Maksimal ijro chastotasi\n" +
                            "20000 Gts\n" +
                            "Minimal takrorlanadigan chastota\n" +
                            "20 Gts\n" +
                            "Texnologiya\n" +
                            "dinamik\n" +
                            "Dizayn\n" +
                            "quloqchinlar\n" +
                            "Qurilma turi\n" +
                            "simsiz TWS minigarnituralari\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Keyingi uchun - 1");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Eror!");
                        System.out.println("Dasturdan chiqildi!");

                    }
                }
                case 2:{
                    System.out.println("Air Pods Max");
                    System.out.println("Xususiyatlari\n" +
                            "Faol shovqinni bekor qilish tizimi\n" +
                            "Yemoq\n" +
                            "Bluetooth versiyasi\n" +
                            "5.0\n" +
                            "Membrananing diametri\n" +
                            "40,0 mm\n" +
                            "Ish vaqti\n" +
                            "20.0 soat\n" +
                            "Simsiz ulanish turi\n" +
                            "Bluetooth\n" +
                            "Dizayn xususiyatlari\n" +
                            "mikrofon, neodim magnitlari\n" +
                            "Funksiyalar\n" +
                            "Talk orqali (shaffoflik rejimi), sozlanishi ovoz balandligi\n" +
                            "Texnologiya\n" +
                            "dinamik\n" +
                            "Dizayn\n" +
                            "to'liq o'lcham\n" +
                            "Qurilma turi\n" +
                            "Simsiz Naushniklar\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Keyingi uchun - 1");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Eror!");
                        System.out.println("Dasturdan chiqildi!");
                    }
                    break;
                }
                case 3:
                    System.out.println("Air Pods 3-Avlod");
                    System.out.println("Xususiyatlari\n" +
                            "Himoya klassi\n" +
                            "IPX4\n" +
                            "Bluetooth versiyasi\n" +
                            "5.0\n" +
                            "Batareyaning ishlash muddati\n" +
                            "30,0 soat\n" +
                            "Ish vaqti\n" +
                            "6,0 soat\n" +
                            "Simsiz ulanish turi\n" +
                            "Bluetooth\n" +
                            "Dizayn xususiyatlari\n" +
                            "namlikdan himoya qilish, mikrofon\n" +
                            "Akustik dizayn turi\n" +
                            "ochiq\n" +
                            "Funksiyalar\n" +
                            "ovozli yordamchini chaqirish\n" +
                            "Dizayn\n" +
                            "quloqchinlar\n" +
                            "Qurilma turi\n" +
                            "simsiz TWS minigarnituralari\n" +
                            "Brend\n" +
                            "Apple");
                    System.out.println("Keyingi uchun - 1");
                    int i2 = in.nextInt();
                    if (i2 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Eror!");
                        System.out.println("Dasturdan chiqildi!");
                    }
                    break;
                case 4:
                    System.out.println("Air Pods Pro");
                    System.out.println("Xususiyatlari\n" +
                            "Himoya klassi\n" +
                            "IPX4\n" +
                            "Qutidagi zaryadlash turi\n" +
                            "Chaqmoq\n" +
                            "Faol shovqinni bekor qilish tizimi\n" +
                            "Yemoq\n" +
                            "Bluetooth versiyasi\n" +
                            "5.0\n" +
                            "Batareyaning ishlash muddati\n" +
                            "24.0 soat\n" +
                            "Ish vaqti\n" +
                            "4,5 soat\n" +
                            "Simsiz ulanish turi\n" +
                            "Bluetooth\n" +
                            "Dizayn xususiyatlari\n" +
                            "namlikdan himoya qilish, mikrofon\n" +
                            "Akustik dizayn turi\n" +
                            "yopiq\n" +
                            "Funksiyalar\n" +
                            "O'zaro gaplashing (shaffoflik rejimi), ovozli yordamchiga qo'ng'iroq qiling\n" +
                            "Texnologiya\n" +
                            "dinamik\n" +
                            "Dizayn\n" +
                            "intrakanal\n" +
                            "Qurilma turi\n" +
                            "simsiz TWS minigarnituralari\n" +
                            "Brend\n" +
                            "olma");
                    System.out.println("Keyingi uchun - 1");
                    int i3 = in.nextInt();
                    if (i3 == 1) {
                        Obyektlar.ishchi.menu();
                    } else {
                        System.out.println("Eror!");
                        System.out.println("Dasturdan chiqildi!");
                    }
                    break;
            }
        }
    }
}
