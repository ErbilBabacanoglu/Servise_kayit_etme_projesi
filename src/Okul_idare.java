import java.util.Scanner;

public class Okul_idare {

    public void calis3(Hesap hesap3) {

        System.out.println("*******");
        System.out.println("Okul idaresi arayüzüne hoş geldiniz");

        Login newlogin3 = new Login();

        Scanner scan = new Scanner(System.in);



        // Arayüze giriş.

        int giris_hakki = 3;

        while (true) {
            if (newlogin3.login1(hesap3)) {
                System.out.println("***Giriş başarılı***");
                break;
            }
            else {
                System.out.println("Giriş başarısız: " + (giris_hakki-1) + " hakkınız kaldı" );
                giris_hakki -=1;
            }

            if (giris_hakki==0) {
                System.out.println("Giriş hakkınız bitti");
                System.out.println("Uygulama sonlandırılıyor");
                return;
            }
        }




        //Servis ekleme kısmı.

        while (true) {

            System.out.println();
            System.out.println("Servis şirketlerinden servis eklemek için 1'e   ||   Çıkmak için q'ya basınız");

            String islem = scan.nextLine();


            if (islem.equals("q")) {
                break;
            }

            else if (islem.equals("1")) {

                while (true) {
                    System.out.println();
                    System.out.println();
                    System.out.println("Hangi şirketten servis eklemek istiyorsunuz?");
                    System.out.println("Güven, şirketinden eklemek için A'ya  ||  Doğru, şirketinden eklemek için B'ye  ||  Çabuk, şirketinden eklemek için C'ye  || Çıkmak için q'ya basınız");
                    String secim = scan.nextLine();

                    if (secim.equalsIgnoreCase("q")) {
                        break;
                    }

                    else {
                        Servis_sirketleri uret1 = new Servis_sirketleri();
                        Servisler servis1 = uret1.sirketlerdenservisAl(secim);

                        if (servis1==null) {
                            System.out.println("Geçerli şirket türü giriniz");
                        }

                        else {
                            servis1.bilgileriGoster();
                        }
                    }
                }


            }

            else {
                System.out.println("Geçersiz işlem girildi tekrar deneyiniz.");
            }

        }




    }



}