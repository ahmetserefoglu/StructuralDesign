package bridgedesign;

public class App {
    
    public static void main(String[] args) {

        Muzik muzik = new Muzik("Sezen Aksu", "Gulumse  Hadi Gulumse");

        // Spotify spotify = new Spotify();

        // String ses = spotify.muzikCal(muzik);

        // Hoparlor hoparlor = new Hoparlor();

        // String sesCikis = hoparlor.muzikSesVer(ses);

        // System.out.println("Muzik"+ ses +" caliyor "+"Ses "+ sesCikis + "veriyor");
        Bilgisayar bilgisayar = new Bilgisayar();

        bilgisayar.muzikCal(muzik);

        // String ses = bilgisayar.muzikCal(muzik);


    }
}