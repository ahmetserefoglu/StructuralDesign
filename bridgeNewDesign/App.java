package bridgeNewDesign;


import bridgeNewDesign.cihaz.BilgisayarKf;
import bridgeNewDesign.muzikcalar.Fizy;
import bridgeNewDesign.muzikcalar.Spotify;
import bridgeNewDesign.sescihazi.Hoparlor;
import bridgeNewDesign.sescihazi.Kulaklik;
import bridgeNewDesign.cihaz.Telefon;

public class App {
    public static void main(String[] args) {
        
        Muzik muzik = new Muzik("AhmetSerefoglu","Şimdi Uzaklardasın Hayallerdesin");

        BilgisayarKf bilgisayarKf = new BilgisayarKf();

        bilgisayarKf.muzikCal(muzik);

        System.out.println("**************");        

        Telefon telefon = new Telefon(new Kulaklik(),new Fizy());

        telefon.muzikCal(muzik);

        System.out.println("**************");

        Telefon telefon2 =  new Telefon(new Hoparlor(), new Spotify());

        telefon2.muzikCal(muzik);

        
    }
}