package Oynalar;

import Mahsulotlar.Main;
import User_uchun.User;
import enums.Rolla;
import listlar.Obyektlar;

import java.util.Scanner;

import static listlar.Royxat.user;

public class Ishchi implements Ummumiy {
    public static final String TEXT_BLACK = "\u001b[30m";
    public static final String TEXT_RED = "\u001b[31m";
    public static final String TEXT_GREEN = "\u001b[32m";
    public static final String TEXT_WHITE = "\u001b[37m";
    //    private static Scanner in;
    private static String[] args;

    @Override
    public void menu() {
        System.out.println("Assalomu alekum");
        System.out.println("REGISRATSIYADAN O'TGANMISIZ\n1.Ha\n2.Yoq");
        int i = Obyektlar.in.nextInt();
        if (i == 1) {
            System.out.println("Ismingiz nima: ");
            String next = Obyektlar.in.next();
            System.out.println("Parol: ");
            String next1 = Obyektlar.in.next();
            for (User user1 : user) {
                if (user1.getIsm().equals(next) && user1.getParol().equals(next1)) {
                    System.out.println("Siz royxatda bor");
                    abc();
                    return;
                }
            }
            System.out.println("Regitratsiyadan topilmadingiz!");
            Main.registratsiya(args);
        } else {
            Main.registratsiya(args);
        }
        Main.menyu(args);
    }

    private static void abc() {
        System.out.println(TEXT_RED + "Bizda hozircha naqd" + TEXT_RED);
        System.out.println("1.Naqd");
        int i1 = Obyektlar.in.nextInt();
        //////////////////////////////////////////
        System.out.println("Summani kiriting: ");
        Integer nexted = Obyektlar.in.nextInt();
        if (nexted == nexted) {
            System.out.println("1.Sotib olindingiz");
            int next = Obyektlar.in.nextInt();
            if (next == 1) {
                Main.main(args);
            }
        }
    }


}

