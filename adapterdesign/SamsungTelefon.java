package adapterdesign;

public class SamsungTelefon implements Telefon {
    
    private int calismaVoltaji;

    public SamsungTelefon() {
        calismaVoltaji = 5;
    }

    public int sarjEt() {
        
        System.out.println("Samsung Telefon Çalışıyor");
        
        return calismaVoltaji; 
    }
}