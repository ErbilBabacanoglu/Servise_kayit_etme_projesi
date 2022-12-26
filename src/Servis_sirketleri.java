public class Servis_sirketleri {

    //Bu kısımda,
    //Kalıtılan şirket classlarından, İdarenin seçimine göre şirketlerden birisi seçiliyor.

    //Alt classın referansından üst classa doğrudan tanımlayarak polymorphism kullanılıyor.

    public Servisler sirketlerdenservisAl (String sirket_turu) {


        //Birbirinden farklı özelliklerine göre şirket servislerinin özellikleri sıralanıyor.

        if (sirket_turu.equalsIgnoreCase("A")) {
            System.out.println();
            return new Guven_servis_sirketi("Ahmet Solmaz ", "0533-145-26-59 ", 3, "gelişmiş havalandırma sistemi");


        }

        else if (sirket_turu.equalsIgnoreCase("B")) {
            System.out.println();
            return new Dogru_servis_sirketi("Eren Yılmaz ", "0536-229-72-16 ", 1, "araç takip sistemi");
        }

        else if (sirket_turu.equalsIgnoreCase("C")) {
            System.out.println();
            return new Hizli_servis_sirketi("Kutay Tanık ", "0548-345-39-49 ", 5, "gelişmiş havalandırma sistemi", "araç takip sistemi");
        }

        else {
            return null;
        }


    }


}


