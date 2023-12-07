// public,private,protected
public class Kisi {
    public String ad;
    private String soyad;
    public int yas;
    
    
    public Kisi(String a ,String s,int y){
        ad = a;
        soyad = s;
        yas = y;
    }
    
    public void yazdir(){
        System.out.println(ad);
        System.out.println(soyad);
        System.out.println(yas);
    }
    
    
}
