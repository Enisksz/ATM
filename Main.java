package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String userName,password;
        Scanner input = new Scanner(System.in);

        int right=3;
        int select;
        int balance=1500;
        while (right>0){
            System.out.println("Kullanıcı adınız: ");
            userName = input.nextLine();

            System.out.println("Parolanız: ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba kodluyoruz bankasına hoşgeldiniz.");
                do {
                    System.out.println("1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgula\n"+"4-Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Para miktarı: ");
                            int price = input.nextInt();
                            System.out.println(price);
                            balance += price;
                            System.out.println(balance);
                            break;
                        case 2:
                            System.out.println("Para miktarı: ");
                            price = input.nextInt();
                            if (price>balance){
                                System.out.println("Bakiye Yetersiz.");
                            }else
                                balance -=price;
                        case 3:
                            System.out.println("Bakiyeniz: "+ balance);
                    }
                }while(select != 4);
                System.out.println("Tekrar görüşmek üzere");
                break;
            }
            else{
                right--;
                System.out.println("Hatalı Kullanıcı adı veya şifre. Tekrar deneyiniz.");

                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız: "+right);
                }
            }
        }
    }
}
