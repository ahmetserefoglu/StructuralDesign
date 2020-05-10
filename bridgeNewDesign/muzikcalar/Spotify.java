package bridgeNewDesign.muzikcalar;

import bridgeNewDesign.*;

public class Spotify implements MuzikCalar{
    
    @Override
    public String muzikCal(Muzik muzik) {

        System.out.println("Muzik Spotify " + muzik.getAdi() + " caliyor");

        return muzik.getAdi();
    }
}