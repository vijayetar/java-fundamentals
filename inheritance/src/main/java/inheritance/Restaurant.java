package inheritance;

import java.util.ArrayList;

import static java.lang.String.format;

public class Restaurant {
    // variables
    private String name;
    private String price;
    private double stars;
    private Review review;
    public static ArrayList<Review> restaurantReviews= new ArrayList<>();

    //constructor
    public Restaurant(String name, String price){
        this.name = name;
        this.price = price;
        this.stars = 3;
    }
    // return string
    public String toString(){
        return format("Name : %s, Price: %s", name, price);
    }

    // get name, stars, price
    public String getName(){
        return this.name;
    }
    public double getStars(){
        return this.stars;
    }
    public String getPrice(){
        return this.price;
    }

    // set name, stars, price
    public String setName(String name){
       this.name=name;
       return this.name;
    }
    public double setStars(int stars){
        this.stars = stars;
        return this.stars;
    }
    public String setPrice(String price){
        this.price = price;
        return this.price;
    }

    // add reviews to the array list
    public void addReview(Review review){
        // adds the review to the array list of reviews for the restaurant
        this.restaurantReviews.add(review);
        this.updateStars();
        // adds the restaurant to the array list of restaurants reviewed altogether
        if (!review.allRestaurants.contains(this)) {
            review.allRestaurants.add(this);
        }
        // adds restaurant as key and reviews in an arraylist as value in a hashmap
        ArrayList<Review> allReviews = new ArrayList<>();
        if (review.restaurantAndReviews.containsKey(this)) {
            allReviews = review.restaurantAndReviews.get(this);
        }
        allReviews.add(review);
        review.restaurantAndReviews.put(this, allReviews);
    }
    // update the stars
    public double updateStars(){
        int totalReviews = 0;
        int totalStars = 0;
        for (Review rv: this.restaurantReviews){
           totalStars+= rv.getReviewStars();
           totalReviews++;
        }
        int newStars = totalStars/totalReviews;
        return this.setStars(newStars);
    }

    // shows the reviews for that restaurant
    public static String showReviews(){
        int count = 0;
        String outputString = format(" These are reviews: \n");
        for (Review rev: restaurantReviews) {
            count ++;
            outputString+= count+". "+rev+ " ,\n";
        }
        return outputString;
    }
}
