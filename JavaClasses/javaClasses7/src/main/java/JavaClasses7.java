//Override(metotların ezilmesi)
public class JavaClasses7 {

    public static void main(String[] args) {
        Hayvan h1 = new Hayvan();
        h1.sesVer();
        System.out.println("***************");
        Kus k1 = new Kus();
        k1.boy = 10;
        k1.kilo = 2;
        k1.sesVer();
        System.out.println("***************");
        Kopek ko1 = new Kopek();
        ko1.boy = 100;
        ko1.kilo = 10;
        ko1.sesVer();
        System.out.println("***************");
        Kedi ked1 = new Kedi();
        ked1.boy = 60;
        ked1.kilo = 4;
        ked1.sesVer();
        
        
        
        
        
        
        
    }
}
