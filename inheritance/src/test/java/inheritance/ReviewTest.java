package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
    public void clearAllStaticLists(){
        Restaurant.restaurantReviews.clear();
        Shop.shopReviews.clear();
        Review.allRestaurants.clear();
        Review.restaurantAndReviews.clear();
        Review.allShops.clear();
        Review.shopAndReviews.clear();
    }
    @Test
    public void testReviewClass(){
        clearAllStaticLists();
        Restaurant daVinci = new Restaurant ("daVinci", "$$");
        Review review = new Review("great place", "vij", 3);
        assertEquals("Review: great place, Author: vij,  Stars: 3", review.toString());

    }
    /// Restaurant Reviews tested///////
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
        assertEquals("\n" +
                "Restaurant Details: Name : daVinci, Price: $$ \n" +
                "1.  Review: so-so, Author: vij,  Stars: 2\n" +
                "2.  Review: so-so, Author: vij,  Stars: 2\n" +
                "\n" +
                "Restaurant Details: Name : Angeles, Price: $$ \n" +
                "1.  Review: so-so, Author: vij,  Stars: 2\n", Review.showEachRestaurantReview());
    }
    @Test public void testGetReviewStars(){
        clearAllStaticLists();
        Review testPlace = new Review("too expensive", "Vij", 2);
        assertEquals(2, testPlace.getReviewStars() );

    }
    //////// Shop reviews Tested ///////////
    @Test public void testReviewShopList(){
        clearAllStaticLists();
        Shop buzzy = new Shop("Buzzy", "flower shop", 3);
        Shop lucky = new Shop ("Lucky", "noodle place", 5);
        buzzy.addReview(new Review ("beautiful service", "Vij", 3));
        lucky.addReview(new Review ("great noodles", "Vij", 4));
        lucky.addReview(new Review ("delicious food", "V", 5));
        assertEquals(" Shops reviewed so far: \n" +
                " Shop name:  Buzzy, \n" +
                " Description: flower shop, \n" +
                " Dollars: 3 ,\n" +
                " Shop name:  Lucky, \n" +
                " Description: noodle place, \n" +
                " Dollars: 5 ,\n", Review.showShopList());
    }
    @Test public void testReviewShopAndReviews(){
        clearAllStaticLists();
        Shop buzzy = new Shop("Buzzy", "flower shop", 3);
        Shop lucky = new Shop ("Lucky", "noodle place", 5);
        buzzy.addReview(new Review ("beautiful service", "Vij", 3));
        lucky.addReview(new Review ("great noodles", "Vij", 4));
        lucky.addReview(new Review ("delicious food", "V", 5));
        assertEquals("\n" +
                "Shop Details: Shop name:  Lucky, \n" +
                " Description: noodle place, \n" +
                " Dollars: 5 \n" +
                "1.  Review: delicious food, Author: V,  Stars: 5\n" +
                "2.  Review: delicious food, Author: V,  Stars: 5\n" +
                "\n" +
                "Shop Details: Shop name:  Buzzy, \n" +
                " Description: flower shop, \n" +
                " Dollars: 3 \n" +
                "1.  Review: delicious food, Author: V,  Stars: 5\n", Review.showEachShopReview());
    }

}
