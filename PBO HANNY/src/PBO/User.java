package PBO;

public class User {
    private Mesin mesin;
    public User(Mesin mesin){
        this.mesin = mesin;
    }

    void masukUang(){
        this.mesin.Uang();
    }

    void pililhBarang(){
        this.mesin.pilih();
    }

    void uangKembali(){
        this.mesin.kembalian();
    }

    void cetakStruk(){
        this.mesin.struk();
    }
}
