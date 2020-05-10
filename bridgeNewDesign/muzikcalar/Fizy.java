package bridgeNewDesign.muzikcalar;

import bridgeNewDesign.*;

public class Fizy implements MuzikCalar {
    
    @Override
    public String muzikCal(Muzik muzik){

        System.out.println("Muzik Fizyden "+ muzik.getAdi()+ " caliyor");

        return muzik.getAdi();
    }
}