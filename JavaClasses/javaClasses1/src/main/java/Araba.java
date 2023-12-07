
public class Araba {
    String marka;
    String plaka;
    int modelYili;
    String renk;
    
    public void hareketEt(){
        System.out.println("Arac hareket ediyor.....");
    }
    public void durdur(){
        System.out.println("Arac durduruluyor.....");
    }
    
    public void bilgileriGoster(){
        
        System.out.println("Arac bilgileri: ");
        
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + modelYili);
        System.out.println("Plaka: " + plaka);
        System.out.println("Renk: " + renk);
        
    }
    
}
