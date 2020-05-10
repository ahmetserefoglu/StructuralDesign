package bridgedesign;

public class Bilgisayar {
    
    private Spotify spotify;
    private Hoparlor hoparlor;
    
    public Bilgisayar() {
        spotify = new Spotify();
        hoparlor = new Hoparlor();
    }

    public void muzikCal(Muzik muzik) {
        String ses = spotify.muzikCal(muzik);
        hoparlor.muzikSesVer(ses);
    }

    public Spotify getSpotify() {
        return this.spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Hoparlor getHoparlor() {
        return this.hoparlor;
    }

    public void setHoparlor(Hoparlor hoparlor) {
        this.hoparlor = hoparlor;
    }
    


}