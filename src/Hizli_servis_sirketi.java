public class Hizli_servis_sirketi extends Servisler {

    //Servisler classından kalıtılıyor.


    public String ekstra_ozellik3;
    public String ekstra_ozellik4;


    public Hizli_servis_sirketi(String servisci_isim, String telefon_no, int bos_koltuk_sayisi, String ekstra_ozellik3, String ekstra_ozellik4) {
        super(servisci_isim, telefon_no, bos_koltuk_sayisi);
        this.ekstra_ozellik3 = ekstra_ozellik3;
        this.ekstra_ozellik4 = ekstra_ozellik4;
    }


    //Servisler classındaki bilgileri gösterme metotu override ediliyor.
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Ek olarak Hızlı şirketi servislerinde " + ekstra_ozellik3 + " ve " + ekstra_ozellik4 + " bulunmaktadır.");
    }


}
