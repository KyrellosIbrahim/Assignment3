/*
the purpose of this class is to test out the generic versions of each list,
instead of using the Book class only.
 */
public class storeItems {
    String name;
    String company;
    double price;
    public storeItems(String name, String company, double price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return ("Name: " + name + ", Company: " + company + ", Price: " + price);
    }
}
