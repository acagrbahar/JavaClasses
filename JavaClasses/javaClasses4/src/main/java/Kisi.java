//Encapsulation(setter-getter)
public class Kisi {
    private String ad;
    private String soyad;
    private int yas;
    
    public Kisi(String a,String s,int y){
        ad = a;
        soyad = s;
        yas = y;
    
    }
    
    public void setAd(String a){
        
        ad = a;
    }
    public String getAd(){
        return ad;
    }
    public void setSoyad(String s){
        soyad = s;
    }
    public String getSoyad(){
        return soyad;
    }
    public void setYas(int y){
        if((y>0) && (y<=110)){
            yas = y;
        }
        else{
            System.out.println("yanlis yas girisi....");
            yas = 0;
        
        }
        
    }
    public int getYas(){
        return yas;
    }
    
    public void bilgileriGoster(){
        System.out.println("Ad: " + getAd());
        System.out.println("Soyad: " + getSoyad());
        System.out.println("Yas: " + getYas());
    
    }
    
}
