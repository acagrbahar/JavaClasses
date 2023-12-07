//Classes1
public class JavaClasses1 {

    public static void main(String[] args) {
        Araba nesne = new Araba(); //nesne olusturuldu.
        
        nesne.marka = "Toyata";  // nesnenin degerleri girildi.
        nesne.modelYili = 2023;
        nesne.plaka = "38abc38";
        nesne.renk = "kırmızı";
        
        Araba nesne2 = new Araba(); // 2.nesne olusturuldu.
        
        nesne2.marka = "Reno";  // 2.nesnenin degerleri girildi.
        nesne2.modelYili = 2021;
        nesne2.plaka = "38acb38";
        nesne2.renk = "beyaz";
        /*
        System.out.println(nesne.marka);
        System.out.println(nesne.modelYili);
        System.out.println(nesne.plaka);
        System.out.println(nesne.renk);
        
        System.out.println("***************************************");
        
        System.out.println(nesne2.marka);
        System.out.println(nesne2.modelYili);
        System.out.println(nesne2.plaka);
        System.out.println(nesne2.renk);
        */
        
        nesne.hareketEt();
        nesne.durdur();
        
        nesne2.hareketEt();
        nesne2.durdur();
        
        System.out.println("*************************");
        
        nesne.bilgileriGoster();
        System.out.println("\n");
        nesne2.bilgileriGoster();
        
        
        
        
        
    }
}
