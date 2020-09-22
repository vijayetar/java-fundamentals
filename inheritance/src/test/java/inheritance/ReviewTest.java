package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
    @Test
    public void testReviewClass(){
        Restaurant daVinci = new Restaurant ("daVinci", 3, "$$");
        Review review = new Review("great place", "vij", 3);
        assertEquals("Review: great place, Author: vij,  Stars: 3", review.toString());

    }
    @Test public void testReviewRestaurantList(){
        Restaurant daVinci = new Restaurant ("daVinci", 3, "$$");
        Restaurant angeles = new Restaurant ("Angeles", 4, "$$");
        daVinci.addReview(new Review ("great place", "vij", 3));
        daVinci.addReview(new Review("so-so", "vij", 2));
        angeles.addReview(new Review ("so-so", "vij", 2));
        assertEquals(" Restaurants reviewed so far: \n" +
                " Name : daVinci, Stars: 3, Price: $$ ,\n" +
                " Name : Angeles, Stars: 4, Price: $$ ,\n", Review.showRestaurantList());
    }
    @Test public void testReviewRestaurantAndReviews(){
        Restaurant daVinci = new Restaurant ("daVinci", 3, "$$");
        Restaurant angeles = new Restaurant ("Angeles", 4, "$$");
        daVinci.addReview(new Review ("great place", "vij", 3));
        daVinci.addReview(new Review("so-so", "john", 2));
        angeles.addReview(new Review ("so-so", "vij", 2));
        assertEquals("\nRestaurant Details: Name : daVinci, Stars: 3, Price: $$ \n" +
                "1.  Review: great place, Author: vij,  Stars: 3\n" +
                "2.  Review: so-so, Author: john,  Stars: 2\n" +
                "\n" +
                "Restaurant Details: Name : Angeles, Stars: 4, Price: $$ \n" +
                "1.  Review: so-so, Author: vij,  Stars: 2\n", Review.showEachRestaurantReview());
    }

}
