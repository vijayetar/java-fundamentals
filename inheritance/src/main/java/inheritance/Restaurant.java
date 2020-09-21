package inheritance;

public class Restaurant {
    private String name;
    private String price;
    private int stars;

    public Restaurant(String name, int stars, String price){
        this.name = name;
        this.stars = stars;
        this.price = price;
    }
    public String toString(){
        return String.format("Name : %s, Stars: %d, Price: %s", name, stars, price);
    }
}
