package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
    public void clearAllStaticLists(){
        Restaurant.restaurantReviews.clear();
        Review.allRestaurants.clear();
        Review.restaurantAndReviews.clear();

    }
    @Test
    public void testReviewClass(){
        clearAllStaticLists();
        Restaurant daVinci = new Restaurant ("daVinci", "$$");
        Review review = new Review("great place", "vij", 3);
        assertEquals("Review: great place, Author: vij,  Stars: 3", review.toString());

    }
    @Test public void testReviewRestaurantList(){
        clearAllStaticLists();
        Restaurant daVinci = new Restaurant ("daVinci", "$$");
        Restaurant angeles = new Restaurant ("Angeles", "$$");
        daVinci.addReview(new Review ("great place", "vij", 3));
        daVinci.addReview(new Review("so-so", "vij", 2));
        angeles.addReview(new Review ("so-so", "vij", 2));
        assertEquals(" Restaurants reviewed so far: \n" +
                " Name : daVinci, Price: $$ ,\n" +
                " Name : Angeles, Price: $$ ,\n", Review.showRestaurantList());
    }
    @Test public void testReviewRestaurantAndReviews(){
        clearAllStaticLists();
        Restaurant daVinci = new Restaurant ("daVinci", "$$");
        Restaurant angeles = new Restaurant ("Angeles", "$$");
        daVinci.addReview(new Review ("great place", "vij", 3));
        daVinci.addReview(new Review("so-so", "john", 2));
        angeles.addReview(new Review ("so-so", "vij", 2));
        assertEquals("\nRestaurant Details: Name : daVinci, Price: $$ \n" +
                "1.  Review: great place, Author: vij,  Stars: 3\n" +
                "2.  Review: so-so, Author: john,  Stars: 2\n" +
                "\n" +
                "Restaurant Details: Name : Angeles, Price: $$ \n" +
                "1.  Review: so-so, Author: vij,  Stars: 2\n", Review.showEachRestaurantReview());
    }
    @Test public void testGetReviewStars(){
        clearAllStaticLists();
        Review testPlace = new Review("too expensive", "Vij", 2);
        assertEquals(2, testPlace.getReviewStars() );

    }

}
