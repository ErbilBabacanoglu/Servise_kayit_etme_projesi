public class Guven_servis_sirketi extends Servisler {

    //Servisler classından kalıtılıyor.


    public String ekstra_ozellik;

    public Guven_servis_sirketi(String servisci_isim, String telefon_no, int bos_koltuk_sayisi, String ekstra_ozellik) {
        super(servisci_isim, telefon_no, bos_koltuk_sayisi);
        this.ekstra_ozellik=ekstra_ozellik;
    }



    //Servisler classındaki bilgileri gösterme metotu override ediliyor.
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Ek olarak Güven şirketi servislerinde " + ekstra_ozellik + " bulunmaktadır.");
    }
}
