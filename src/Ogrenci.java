import java.util.Scanner;

public class Ogrenci {

    private String kontrol;



    //Öprenci tarafından verilen bilgiyi işleyen kısım.
    public boolean okula_gitme_durumu(String kontrolu) {
        if (kontrolu.equals("evet")) {
            System.out.println("Okula gittiğinin bilgisi sisteme gönderiliyor.");
            return true;
        }
        else {
            System.out.println("Okula gitmediğinin bilgisi sisteme gönderiliyor");
            return false;
        }
    }


    public void calis1(Hesap hesap) {

        System.out.println();
        System.out.println("***Öğrenci arayüzüne hoş geldiniz***");

        Login newlogin = new Login();

        Scanner scan = new Scanner(System.in);



        //Arayüze giriş.

        int giris_hakki = 3;

        while (true) {
            if (newlogin.login1(hesap)) {
                System.out.println();
                System.out.println("***Giriş başarılı***");
                System.out.println();
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






        //Velinin gereken bilgileri karşılayıp karşılamadığını test etmek için.

        Veli veliref = new Veli();

        while (true) {

            if (veliref.referans()) {

            }
            else {
                break;
            }



            //Öğrenci işlemleri

            System.out.println();
            System.out.println("Servis bilgilerini görmek için 1'e   ||   Okula gitme durumunu belirtmek için 2'ye   ||   Uygulamadan çıkmak için q'ya basınız.  ");
            String islem = scan.nextLine();


            if (islem.equals("q")) {
                break;
            }

            else if (islem.equals("1")) {
                System.out.println("Güven şirketi servisleri, Servis sorumlusu: Ahmet Solmaz, Telefon numarası: 0533-145-26-59");
                System.out.println("Ayrıca gelişmiş havalandırma sistemi var");
                System.out.println("Doğru şirketi servisleri, Servis sorumlusu: Eren Yılmaz, Telefon numarası: 0536-229-72-16");
                System.out.println("Ayrıca araç takip sistemi var");
                System.out.println("Hızlı şirketi servisleri, Servis sorumlusu: Kutay Tanık, Telefon numarası: 0548-345-39-49");
                System.out.println("Ayrıca gelişmiş havalandırma sistemi ve araç takip sistemi var");

            }

            else if (islem.equals("2")) {

                //Verilen evet veya hayır üzerinden bilginin iletilmesi
                  this.kontrol=scan.nextLine();
                  okula_gitme_durumu(kontrol);



            }

            else {
                System.out.println("Geçersiz işlem girildi tekrar deneyiniz.");
            }

        }

    }


}
