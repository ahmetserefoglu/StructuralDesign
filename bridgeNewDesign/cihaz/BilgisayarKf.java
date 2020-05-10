package bridgeNewDesign.cihaz;

import bridgeNewDesign.Muzik;
import bridgeNewDesign.muzikcalar.Fizy;
import bridgeNewDesign.sescihazi.Kulaklik;

public class BilgisayarKf extends MuzikCalabilenBilgisayar {
    
    public BilgisayarKf(){
        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();
    }

    @Override
    public void muzikCal(Muzik muzik){

        System.out.println("Bilgisayar calisti");
        super.muzikCal(muzik);
    }
}