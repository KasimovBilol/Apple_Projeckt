package Mahsulotlar;

import enums.Rolla;
import listlar.Obyektlar;
import listlar.Royxat;
import User_uchun.User;
import qoshimchaClasslar.Ballar;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static listlar.Royxat.user;

public class Main {
    private static String[] args;

    public static final String TEXT_BLACK = "\u001b[30m";
    public static final String TEXT_RED = "\u001b[31m";
    public static final String TEXT_GREEN = "\u001b[32m";
    public static final String TEXT_WHITE = "\u001b[37m";
        public static final String TEXT_RESET = "\u001B[0m";
    private static Scanner in = new Scanner(System.in);

    public static int bal = 0;

    public static void main(String[] args) {

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Nimadur hato ketti.");
        }
        System.out.println(" ⠀⠀⠀           ⠀⣀⣀⠀⠀⠀⠀⠀⠀\n4" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⡿⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢀⣠⣤⣤⣤⣀⣀⠈⠋⠉⣁⣠⣤⣤⣤⣀⡀⠀⠀\n" +
                "⠀⢠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀\n" +
                "⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀\n" +
                "⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣀\n" +
                "⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁\n" +
                "⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀\n" +
                "⠀⠀⠀⠈⠙⢿⣿⣿⣿⠿⠟⠛⠻⠿⣿⣿⣿⡿⠋⠀⠀⠀");

        System.out.println(TEXT_WHITE + "\u001b[32m" + TEXT_WHITE + "Welcome to " + TEXT_WHITE + TEXT_GREEN + "apple" + TEXT_GREEN + "\u001b[37m" + TEXT_RESET);
        getText(TEXT_RED, "");
        menyu(args);
    }

    public static void registratsiya(String[] args) {
        System.out.println("Registratsiya\u001b[37m");
        System.out.println("Ismingiz nima:");
        String ismi = in.next();
        System.out.println("Familya kiriting : ");
        String familya = in.next();
        System.out.println("Parol: ");
        String parol = in.next();
        User user1 = new User(ismi, familya, parol);
        Royxat.user.add(user1);
        System.out.println("User yaratildi" + TEXT_RESET);
        System.out.println();
        String i1 = in.next();
        menyu(args);


    }

    public static void menyu(String[] args) {
        System.out.println("\u001b[32m\t\t\t\t\t\t\tApple\u001b[32m");
        Mahsulotlar(args);

        int i = in.nextInt();
        if (i < 5) {
            switch (i) {
                case 1:
                    Apple_haqida(args);
                    break;
                case 2:
                    Mahsulotlar(args);
                    break;
                case 3:
                    Fiiliyal(args);
                    break;
                default:
                    System.out.println("Noto'g'ri tanlov");
                    menyu(args);
            }
        } else {
            System.out.println("Notogri raqam");
            menyu(args);
        }
    }

    protected static void neew(String[] args) {
        System.out.println("1.iPhone - 15 2.Series - 9 3.Random");
        int i = in.nextInt();
        if (i < 4) {
            if (i == 1) {
                iPhone(args);
            }
            switch (i) {

                case 2 -> {
                    Watch.Watch();
                }
                case 3 -> {
                    System.out.println( TEXT_RESET+"!Siz Randomdan iPhone 15 yutib olishingiz mumkin!");
                    System.out.println("1 - oringa iPhone 15");
                    System.out.println("2 - oring Series 7");
                    System.out.println("3 - ornga Air pods");
                    System.out.println("Shatlar oddiy randomda bilimingizni sinaysiz.");
                    System.out.println("Tayyormisiz \n1.Haaa \n2.Hozir emas" + TEXT_RESET);
                    int i1 = in.nextInt();
                    if (i1 == 1) {
                        switch (i1) {
                            case 1 -> {
                                Random();
                            }
                            default -> System.out.println("Chichvordin uka");
                        }
                    } else {
                        System.out.println("!Xato ketti!");
                        menyu(args);
                    }

                }
            }
        }
        System.out.println("iPhone 15 tqdimotini korishni hohlaysizmi unda 1.ni bosing!!!");
        int next = in.nextInt();
        if (next == 1) {
            iPhone(Main.args);
        } else {
            System.out.println("Notogri Tanlov ");
        }


        System.out.println("iPhone - 9");
        System.out.println("Biz Iphone 9 ni chiqarmaganimiz sabab biz ushanda iPhone companiyasini 10 yiligi munosabati bilan  iPhone 9 ishlab chiqarish orniga iPhone X versiyasini yaratdik!");
    }

    private static void Random() {
        System.out.println(TEXT_GREEN + "Randomda daturlash boyicha savol javoblarda ball yig'ing va sovrinlarga ega boling" + TEXT_RESET);
        System.out.println(TEXT_RED + "Boshladikmi" + TEXT_RED + "\n1.Ha\n2.Keyinroq" + TEXT_RESET);
        int i = in.nextInt();
        if (i < 2) {
            switch (i) {
                case 1: {
                    question();
                }
                default:
                    menyu(args);
            }
        }

    }

    private static void question() {
        System.out.println("Instance nima? ");
        System.out.println("1.Obyekt yaratish");
        System.out.println("2.Getter - Setter");
        System.out.println("3.Muxim bolmagan method");
        int i = in.nextInt();
        if (i == 1) {

            System.out.println("Togri javob" + (bal + 1));
            System.out.println("1.Ballarni ko'rish \n 2.Keyingi savol");
            int i3 = in.nextInt();
            if (i3 == 1) {
                Ballar.bal+=1;
                System.out.println("Balingiz: " + Ballar.bal);
            } else {
                System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);
            }
        } else {
            System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);

        }
        System.out.println(TEXT_RESET + "Package nima? " + TEXT_RESET);
        System.out.println("1.OOP.");
        System.out.println("2.classlar toplami.");
        System.out.println("3.Standart kutubxonasi.");
        int i1 = in.nextInt();
        if (i1 == 2) {
            System.out.println("Togri javob" + (Ballar.bal));
            System.out.println("1.Ballarni korish \n 2.Keyingi savol");
            int i3 = in.nextInt();
            if (i3 == 1) {
                Ballar.bal+=1;
                System.out.println("Balingiz: " + Ballar.bal);
            } else {
                System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);
            }
        } else {
            System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);

        }
        System.out.println(TEXT_RED + "Encapsulation bolishi uchun nima bolishi kerak? " + TEXT_RESET);
        System.out.println("1. a: Construktor, b: enum set, c: hech biri");
        System.out.println("2. a:classlar toplami, b: HashMap, c: Array");
        System.out.println("3. a:ozgaruvchilar private, b: getter - setter, c: construktor");
        int i2 = in.nextInt();
        if (i2 == 3) {
            System.out.println(TEXT_GREEN + "Togri javob" + (Ballar.bal) + TEXT_RESET);
            System.out.println("1.Ballarni korish \n 2.Keyingi savol");
            int i3 = in.nextInt();
            if (i3 == 1) {
                Ballar.bal += 1;
                System.out.println("Balingiz: " + Ballar.bal);
            } else {
                System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);
            }

        } else {
            System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);

        }
        System.out.println(TEXT_RED + "polymorphism nima? " + TEXT_RESET);
        System.out.println("1. parametrlarni yashirish");
        System.out.println("2. javani har xil xolatda ishlatish");
        System.out.println("3. muhim bolmagan methodlarni yashirish");
        int i4 = in.nextInt();
        if (i4 == 2) {
            Ballar.bal+=1;
            System.out.println(TEXT_GREEN + "Togri javob" + TEXT_RESET);
            System.out.println("1.Ballarni korish \n 2.Keyingi savol");
            int i3 = in.nextInt();
            if (i3 == 1) {
                Ballar.bal+=1;
                System.out.println("Balingiz: " + Ballar.bal);
            } else {
                System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);

            }



        } else {
            System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);

        }

        System.out.println(TEXT_RED + "Java qachon yaratilish boshlangan? " + TEXT_RESET);
        System.out.println("1. 1999");
        System.out.println("2. 1991");
        System.out.println("3. 2024");
        int i5 = in.nextInt();
        if (i5 == 2) {

            System.out.println(TEXT_GREEN + "Togri javob" + (Ballar.bal + 1) + TEXT_RESET);
            System.out.println("1.Ballarni korish \n 2.Keyingi savol");
            int i3 = in.nextInt();
            if (i3 == 1) {
                Ballar.bal+=1;
                System.out.println("Balingiz: " + Ballar.bal);
            } else {
                System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);

            }
        } else {
            System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);

        }

        System.out.println(TEXT_RED + "Javaning birinchi nomi nima? " + TEXT_RESET);
        System.out.println("1. OAK");
        System.out.println("2. APPLE");
        System.out.println("3. OOP");
        int i6 = in.nextInt();
        if (i6 == 1) {
            Ballar.bal+=1;
            System.out.println(TEXT_GREEN + "Togri javob" + (Ballar.bal) + TEXT_RESET);
            System.out.println("1.Ballarni korish \n 2.Keyingi savol");
            int i3 = in.nextInt();
            if (i3 == 1) {
                System.out.println("Balingiz: " + Ballar.bal);
            } else {
                System.out.println(TEXT_GREEN + "Keyingi savol" + TEXT_RESET);
            }
        } else {
            System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);

        }
        System.out.println(TEXT_RED + "super nima vazifani bajaradi?" + TEXT_RESET);
        System.out.println("1. consolga chiqaradi");
        System.out.println("2.ota klacga murojat qiladi");
        System.out.println("3.bola klasga implament oladi");
        int i7 = in.nextInt();
        if (i7 == 2) {
            System.out.println(TEXT_GREEN + "Togri javob" + (Ballar.bal) + TEXT_RESET);
            System.out.println("1.Ballarni korish \n 2.Keyingi savol");
            int i3 = in.nextInt();
            if (i3 == 1) {
                Ballar.bal+=1;
                System.out.println("Balingiz: " + Ballar.bal);
            } else {
                System.out.println(TEXT_GREEN + "Keyingi savol" + TEXT_RESET);
            }
        } else {
            System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);

        }
        System.out.println("add nima amalni bajaradi?");
        System.out.println("1.o'chiradi");
        System.out.println("2.almashtiradi");
        System.out.println("3.qo'shadi");
        int i8 = in.nextInt();
        if (i8 == 3) {

            System.out.println(TEXT_GREEN + "Togri javob" + (Ballar.bal) + TEXT_RESET);
            System.out.println("1.Ballarni korish \n 2.Keyingi savol");
            int i3 = in.nextInt();
            if (i3 == 1) {
                Ballar.bal+=1;
                System.out.println("Balingiz: " + Ballar.bal);
            } else {
                System.out.println(TEXT_GREEN + "Keyingi savol" + TEXT_RESET);
            }
        } else {
            System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);

        }
        System.out.println("clear nima amalni bajaradi?");
        System.out.println("1. elementlarni qaytaradi ");
        System.out.println("2. barcha elementni ochiradi");
        System.out.println("3. uzunligini qaytaradi");
        int i9 = in.nextInt();
        if (i9 == 2) {
            System.out.println(TEXT_GREEN + "Togri javob" + (Ballar.bal) + TEXT_RESET);
            System.out.println("1.Ballarni korish \n 2.Keyingi savol");
            int i3 = in.nextInt();
            if (i3 == 1) {
                Ballar.bal+=1;
                System.out.println("Balingiz: " + Ballar.bal);
            } else {
                System.out.println(TEXT_GREEN + "Keyingi savol" + TEXT_RESET);
            }

        } else {
            System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);

        }

        System.out.println("return nima uchun ishlatiladi?");
        System.out.println("1. dasturni toxtatish va qiymat qaytarish");
        System.out.println("2. construktor bolishi kerak");
        System.out.println("3. dasturni ishlatish va qiyma qoshish");
        int i10 = in.nextInt();
        if (i10 == 1) {
            System.out.println(TEXT_GREEN + "Togri javob" + (Ballar.bal ) + TEXT_RESET);
            System.out.println("1.Ballarni korish \n 2.Keyingi savol");
            int i3 = in.nextInt();
            if (i3 == 1) {
                Ballar.bal+=1;
                System.out.println("Balingiz: " + Ballar.bal);
            } else {
                System.out.println(TEXT_GREEN + "Keyingi savol" + TEXT_RESET);
            }
        } else {
            System.out.println(TEXT_RED + "Notogri javob" + TEXT_RESET);

        }

    }


    public static void login(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ismingiz nima: ");
        String next = in.next();
        System.out.println("Parol: ");
        String next1 = in.next();
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i) != null) {
                if (user.get(i).getIsm().equals(next) && user.get(i).getParol().equals(next1)) {
                    if (user.get(i).getRolla() == Rolla.ISHCHI) {
                        Obyektlar.ishchi.menu();
                    } else if (user.get(i).getRolla() == Rolla.KLENT) {
                        Obyektlar.oluvchi.menu();
                    } else {
                        System.out.println("Kimsan ?");
                    }
                }
            }
        }
        main(Main.args);


    }

    private static void Fiiliyal(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Shahar   | Tuman        | Kocha   |  Ish vaqti");
        System.out.println("Toshkent | Shayxontoxur | Gulobod | 9:00 / 00:00");
        System.out.println("\u001b[32mKeyingi\u001b[32m");
        in.nextInt();
        menyu(args);
    }

    private static void Mahsulotlar(String[] args) {
//        System.out.println("Yangi mahsulot");
//        String next = in.next();
//        if (next == 1){
//            neew();
//        }
        int i = getInt("\u001b[37m", "1.iPhone 2.iPad 3.Air Pods 4.Mac 5.Watch 6.Accesories 7.Necessary\u001b[31m 8.Support" + TEXT_WHITE + " 9.Filial\u001b[31m" + TEXT_RED + " 10.(New)" + TEXT_RED);
        if (i < 11) {
            switch (i) {
                case 1:
                    iPhone(args);
                    break;
                case 2:
                    iPad(args);
                    break;
                case 3:
                    AirPods(args);
                    break;
                case 4:
                    MacBook(args);
                    break;
                case 5:
                    watch();
                    break;
                case 6:
                    accesories();
                    break;
                case 7:
                    necessary();
                    break;
                case 8:
                    support();
                    break;
                case 9:
                    Fiiliyal(args);
                    break;
                case 10:
                    neew(args);
                    break;
                default:
                    System.out.println("Eror!");

            }
        } else {
            System.out.println("Eror!");
        }

    }

    private static void support() {
        support();
    }

    private static void necessary() {
        Necessary.Necessary();
    }

    private static void accesories() {
        Accesories.accesuaries();
    }

    private static void watch() {
        Watch.Watch();
    }

    private static void MacBook(String[] args) {
        Mac.Mac(args);
    }

    private static void AirPods(String[] args) {
        Air_Pods.Air_pods();
    }

    private static void iPad(String[] args) {
        iPad(args);
    }

    public static void iPhone(String[] args) {
        iPhone(args);
    }

    private static void Apple_haqida(String[] args) {
        Haqida_.Haqida(args);
    }

    private static int getInt(String color, String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(color + text);
        return sc.nextInt();
    }

    private static String getText(String color, String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(color + text);
        return sc.nextLine();
    }


}