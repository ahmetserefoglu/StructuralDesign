package adapterdesign;

public class Test {
    
    public static void main(String[] args) {

        Priz priz = new Priz();

        Utu utu = new Utu();
        Buzdolabi buzdolabi = new Buzdolabi();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabi);

        SamsungTelefon samsungTelefon = new SamsungTelefon();
        //Telefonu direk prize takıp çalıştıramıyoruz priz.elektrikVer(samsungTelefon); hatalı bir uygulama,
        //Prizde 220 volt var biz oradaki voltajı telefonun çalışmasını sağlamak adına biz birtane adapter sınıfı oluşturduk,
        //Oluşturduğumuz bu sınıfa implement elektriklievaletleri olarak alıyoruz daha sonra bu adapterimizi gönderiyoruz.
        TelefonAdapter telefonAdapter = new TelefonAdapter(samsungTelefon);
        
        priz.elektrikVer(telefonAdapter);
                 
    }
}