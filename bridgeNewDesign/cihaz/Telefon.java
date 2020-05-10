package bridgeNewDesign.cihaz;

import bridgeNewDesign.muzikcalar.MuzikCalar;
import bridgeNewDesign.sescihazi.SesCihazi;
import bridgeNewDesign.*;

public class Telefon extends MuzikCalabilenBilgisayar {
    
    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar){
        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik){
        System.out.println("Telefon calisiyor");
        super.muzikCal(muzik);
    }
}