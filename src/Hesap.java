public class Hesap {

    // Hesap classında login classında kontrol edilmek üzere gönderilen kullanıcı adı ve parola tanımlanıyor.
    private String kullanici_adi;
    private String parola;

    public Hesap(String kullanici_adi, String parola) {

        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
    }




    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
}
