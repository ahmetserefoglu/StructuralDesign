package adapterdesign;

public class Priz {
    
    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri ) {
        
        int volt = elektrikliEvAletleri.prizeTakVeCalistir();

        System.out.println("Priz "+ volt + " elektrik veriyor");
    }
}