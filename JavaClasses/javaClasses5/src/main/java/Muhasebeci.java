//Inheritance(subclass)
public class Muhasebeci extends Kisi {
    int maas;
    
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Maas:  " + maas);
    
    }
}
