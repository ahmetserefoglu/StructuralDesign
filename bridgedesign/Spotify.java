package bridgedesign;

public class Spotify {
    
    public String muzikCal(Muzik muzik) {
        
        System.out.println("Spotify "+ muzik.getAdi()  +" şarkısını çalıyor.");

        return muzik.getSes();
    }
}