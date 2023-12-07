//Overload(asiri yukleme)
public class Hesaplama {
    public int toplama(int a,int b){
        System.out.println("Tam sayi toplama metodu");
        return a+b;
    }
    public float toplama(float a,float b){
        System.out.println("Float sayi toplama metodu");
        return a+b;
    }
    public float toplama(float a,int b){
        System.out.println("Bir float bir tam sayi toplama metodu");
        return a+b;
    }
    public float toplama(int a,float b){
        System.out.println("Bir float bir tam sayi toplama metodu");
        return a+b;
    }
    
}
