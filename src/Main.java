import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("***Servise kaydolma uygulamasına hoş geldiniz***");



        while (true) {

            //Farklı şifre ve kullanıcı adlarıyla farklı arayüzlere giriş.

            System.out.println();
            System.out.println("Uygun kullanıcı adı ve şifre ile sisteme giriş yapınız");
            System.out.println("Öğrenci arayüzü için 1   ||   Veli arayüzü için 2  ||  Okul idaresi arayüzü için 3  ||   Çıkış için q'ya basınız");

            String secim = scan.nextLine();

            if (secim.equals("q")) {
                break;
            }
            else if (secim.equals("1")) {

                Ogrenci ogrenci1 = new Ogrenci();

                Hesap hesap1 = new Hesap("öğrenci", "123");
                ogrenci1.calis1(hesap1);


            }
            else if (secim.equals("2")) {

                Veli veli1 = new Veli();

                Hesap hesap2 = new Hesap("veli", "123");
                veli1.calis2(hesap2);


            }
            else if (secim.equals("3")) {

                Okul_idare idare1 = new Okul_idare();

                Hesap hesap3 = new Hesap("idare", "123");
                idare1.calis3(hesap3);



            }


        }
        System.out.println("Program sonlandı");
    }
}