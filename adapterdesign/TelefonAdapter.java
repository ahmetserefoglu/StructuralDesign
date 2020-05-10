package adapterdesign;

public class TelefonAdapter implements ElektrikliEvAletleri {
    
    private Telefon telefon;

    public TelefonAdapter(Telefon telefon) {
        this.telefon = telefon; 
    }
    
    public int prizeTakVeCalistir() {
        return telefon.sarjEt();
    }
}