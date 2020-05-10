package adapterdesign;

public class Buzdolabi implements ElektrikliEvAletleri {

    private int voltaj;

    public Buzdolabi() {
        this.voltaj=220;
    }

    public int prizeTakVeCalistir() {
        
        System.out.println("Buzdolabi Çalişiyor");
        return voltaj;
    }
    
}