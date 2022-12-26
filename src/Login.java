import java.util.Scanner;

//bu classta kullanıcıdan alınan kullanıcı adı ve şifreler ile,
//sistemdeki kullanıcı adı ve şifreler kontrol ediliyor,
//eşleşiyor ise uygulamaya devam ediliyor.
public class Login {

    Scanner scan =  new Scanner(System.in);

    public boolean login1(Hesap hesap) {
        // Hesap sınıfından hesap objesi oluşturuluyor.


        System.out.println("Sırayla ad ve parola giriniz");

        String kullanici_adi = scan.next();
        String parola = scan.next();

        if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)) {  //paswword check
            return true;
        }
        else {
            return false;
        }

    }


}
