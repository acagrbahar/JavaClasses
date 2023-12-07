//Inheritance
public class JavaClasses5 {

    public static void main(String[] args) {
        Muhasebeci m1 = new Muhasebeci();
        Kisi k1 = new Kisi();
        Yonetici y1 = new Yonetici();
        
        m1.isim = "Ali";
        m1.soyisim = "Yilmaz";
        m1.yas = 30;
        m1.maas = 10000;
        
        k1.isim = "Veli";
        k1.soyisim = "Ates";
        k1.yas = 35;
        
        
        k1.bilgileriGoster();
        System.out.println("*****************");
        m1.bilgileriGoster();
        System.out.println("*****************");
        
        y1.isim = "Ahmet";
        y1.soyisim = "Bahar";
        y1.yas = 45;
        y1.rol = "Ust yonetici";
        
        y1.bilgileriGoster();
        
    }
}
