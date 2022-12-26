import java.util.Scanner;

public class Veli implements Ogrenci_gereksinim {

    private int ucret_durumu=0;
    private boolean ogrenci_belgesi_durumu;

    public void calis2(Hesap hesap2) throws InterruptedException {

        System.out.println("*******");
        System.out.println("Veli arayüzüne hoş geldiniz");

        Login newLogin = new Login();

        Scanner scan = new Scanner(System.in);




        int giris_hakki = 3;


        //Arayüze giriş.
        while (true) {
            System.out.println();
            if (newLogin.login1(hesap2)) {
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

        //
        boolean kontrol=true;

        while (true) {

            if (kontrol) {

                System.out.println("Lütfen yeteri kadar ücret yatırınız (6500 türk lirası)");

                this.ucret_durumu=scan.nextInt();
                scan.nextLine();     // Integer değer aldıktan sonra hata vermemesi için boş String değer alınıyor.



                System.out.println("Öğrenci belgesi iletildi mi?");

                String cevap = scan.nextLine();

                if (cevap.equals("evet")) {
                    this.ogrenci_belgesi_durumu=true;
                }
                else {
                    this.ogrenci_belgesi_durumu=false;
                }



                System.out.println("Ücretin ödenmesi ve öğrenci belgesinin teslimi kontrol ediliyor...");
                Thread.sleep(1500);
                System.out.println();

                //Şartların sağlandığının kontrolü.
                if (ogrenci_belgesi() && ucret()) {
                    kontrol=false;
                    System.out.println("Şartlar sağlandı, servis seçme aşamasına geçilebilir.");
                }
                else {
                    System.out.println("Şartlar sağlanmadı.");
                    continue;
                }
            }




            //Veli işlemleri.

            System.out.println();
            System.out.println("*****");
            System.out.println("1-Servis ve servisçi bilgilerini göster");
            System.out.println("2-Servis seç");
            System.out.println("q=çikiş");
            System.out.println("*****");

            String islem = scan.nextLine();

            if (islem.equals("q")) {
                break;
            }

            else if (islem.equals("1")) {
                System.out.println("Güven şirketi servisleri, Servis sorumlusu: Ahmet Solmaz, Telefon numarası: 0533-145-26-59");
                System.out.println("Ayrıca gelişmiş havalandırma sistemi var ");
                System.out.println();
                System.out.println("Doğru şirketi servisleri, Servis sorumlusu: Eren Yılmaz, Telefon numarası: 0536-229-72-16");
                System.out.println("Ayrıca araç takip sistemi var");
                System.out.println();
                System.out.println("Hızlı şirketi servisleri, Servis sorumlusu: Kutay Tanık, Telefon numarası: 0548-345-39-49");
                System.out.println("Ayrıca gelişmiş havalandırma sistemi ve araç takip sistemi var");
            }

            else if (islem.equals("2")) {

                System.out.println("Güven şirketini seçmek için 1   ||  Doğru şirketini seçmek için 2   ||  Hızlı şirketini seçmek için 3'e basınız");
                String secim= scan.nextLine();
                if (secim.equals("1")) {
                    System.out.println("Güven şirketi seçildi");
                }

                if (secim.equals("2")) {
                    System.out.println("Doğru şirketi seçildi");
                }

                if (secim.equals("3")) {
                    System.out.println("Hızlı şirketi seçildi");
                }
            }

            else {
                System.out.println("Geçersiz işlem girildi tekrar deneyiniz.");
            }

        }


    }



    //Öğrencinin şartların sağlandığını kontrol etmesi için oluşturulmuş metot.
    public boolean referans() {
        if (ucret() && ogrenci_belgesi()) {
            System.out.println("Şartlar karşılanmış");
            return true;
        }
        else {
            System.out.println("Şartlar karşılanmamış lütfen veli arayüzünden şartları karşılayınız");
            return false;
        }
    }




    //Interface kısmından iki metot da override edildi ve şartların sağlandığı test ediliyor.
    @Override
    public boolean ucret() {
        if (ucret_durumu<6500) {

            System.out.println("ücret yeteri kadar yatırılmamış.");
            System.out.println();
            return false;
        }

        else {
            System.out.println("Ücret ödenmiş.");
            System.out.println();
            return true;
        }
    }

    @Override
    public boolean ogrenci_belgesi() {
        if (this.ogrenci_belgesi_durumu==true) {
            System.out.println("Öğrenci belgesi teslim edilmiş.");
            return true;
        }
        else {
            System.out.println("öğrenci belgesi teslim edilmemiş");
            return false;
        }
    }
}
