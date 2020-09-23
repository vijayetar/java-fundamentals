package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Shop {
    private String name;
    private String description;
    private int dollars;
    public static LinkedList<Review> shopReviews = new LinkedList<>();

    //constructors
    public Shop (String name, String description, int dollars){
        this.name=name;
        this.description = description;
        this.dollars = dollars;
    }
    // add reviews to the array list
    public void addReview(Review review){
        // adds the review to the array list of reviews for the restaurant
        shopReviews.add(review);
        return;
//        // adds the shop to the array list of all shops reviewed altogether
//        if (!review.allShops.contains(this)) {
//            review.allShops.add(this);
//        }
//        // adds restaurant as key and reviews in an arraylist as value in a hashmap
//        ArrayList<Review> allReviews = new ArrayList<>();
//        if (review.shopAndReviews.containsKey(this)) {
//            allReviews = review.shopAndReviews.get(this);
//        }
//        allReviews.add(review);
//        review.shopAndReviews.put(this, allReviews);
    }
    // get the reviews in the shopReviews
    public String getReviews(){
        String outputReview = "";
        for (Review rw:shopReviews){
            outputReview+=rw+"\n";
        }
        return outputReview;
    }

    public String toString(){
        return String.format("Shop name:  %s, \n Description: %s, \n Dollars: %d", name, description, dollars);
    }
}
