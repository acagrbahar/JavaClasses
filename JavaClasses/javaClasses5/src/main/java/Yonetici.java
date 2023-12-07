//Inheritance(subclass)
public class Yonetici extends Kisi{
    String rol;
    
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Rol:    " + rol);
    }
    
}
