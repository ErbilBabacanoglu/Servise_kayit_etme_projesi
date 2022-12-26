public class Servisler {

    //Servis şirketlerinin kullanması için bilgiler tanımlanıyor.
    private String servis_sorumlusu;
    private String telefon_no;
    private int bos_hat_sayisi;


    public Servisler(String servis_sorumlusu, String telefon_no, int bos_hat_sayisi) {
        this.servis_sorumlusu = servis_sorumlusu;
        this.telefon_no = telefon_no;
        this.bos_hat_sayisi = bos_hat_sayisi;
    }

    public void bilgileriGoster() {
        System.out.println( getServis_sorumlusu() + "adlı " + "Servisçinin telefon numarası: " + telefon_no + "Hat sayısı: " + bos_hat_sayisi);
    }

    public String getServis_sorumlusu() {
        return servis_sorumlusu;
    }

    public void setServis_sorumlusu(String servis_sorumlusu) {
        this.servis_sorumlusu = servis_sorumlusu;
    }

    public String getTelefon_no() {
        return telefon_no;
    }

    public void setTelefon_no(String telefon_no) {
        this.telefon_no = telefon_no;
    }

    public int getBos_hat_sayisi() {
        return bos_hat_sayisi;
    }

    public void setBos_hat_sayisi(int bos_hat_sayisi) {
        this.bos_hat_sayisi = bos_hat_sayisi;
    }
}
