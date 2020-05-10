package bridgeNewDesign.sescihazi;

public class Kulaklik implements SesCihazi {
    
    @Override
    public void sesiCal(String ses){

        System.out.println("Kulaklıkdan Ses " + ses + " caliniyor.");
    }
}