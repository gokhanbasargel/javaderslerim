package entities;

public class Product {
    private String name ;
    private int id;
    private String description;
    private int stockAmount;
    private String renk;
    private String kod;

    // Overloading : (Aşırı Yükleme) Constracktorları ve metotları parametreli ve parametresiz kullanma olayına denir.
    public Product() {
    }

    public Product(String name, int id, String description, int stockAmount, String renk, String kod) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.stockAmount = stockAmount;
        this.renk = renk;
        this.kod = kod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return kod = this.name.substring(0,1)+id;
    }

}
