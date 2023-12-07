//this
public class Kisi {
    String ad;
    String soyad;
    int yas;

    public Kisi(String ad,String soyad,int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }
    public void bilgileriGoster(){
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yas: " + yas);
    }
    
    
    
}
