package inheritance;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    public void resetArrayList(){
        Restaurant.restaurantReviews.clear();
    }
    @Test
    public void testResturant(){
        resetArrayList();
        Restaurant daVinci = new Restaurant("daVinci", "$$$");
        assertEquals("Name : daVinci, Price: $$$", daVinci.toString());
    }
    @Test public void testGetNamePriceStars(){
        resetArrayList();
        Restaurant daVinci = new Restaurant("daVinci",  "$$$");
        assertEquals("daVinci", daVinci.getName());
        assertEquals("$$$", daVinci.getPrice());
        assertEquals(3.0, daVinci.getStars(), 0);
    }
    @Test public void testSetNamePriceStars(){
        resetArrayList();
        Restaurant daVinci = new Restaurant("daVinci", "$$$");
        daVinci.setName("DaVinci");
        daVinci.setStars(2);
        daVinci.setPrice("$$");
        assertEquals("DaVinci", daVinci.getName());
        assertEquals("$$", daVinci.getPrice());
        assertEquals(2.0, daVinci.getStars(),0);
    }
    @Test
    public void testRestaurantAllReviews(){
        resetArrayList();
        Restaurant daVinci = new Restaurant("daVinci", "$$$");
        daVinci.addReview(new Review("Great job with service!", "Vij", 3));
        daVinci.addReview(new Review ("Not so great today!", "Vij", 1));
        assertEquals(" These are reviews: \n" +
                "1. Review: Great job with service!, Author: Vij,  Stars: 3 ,\n" +
                "2. Review: Not so great today!, Author: Vij,  Stars: 1 ,\n", daVinci.showReviews());
    }
    @Test public void testUpdateStars(){
        resetArrayList();
        Restaurant daVinci = new Restaurant("daVinci", "$$$");
        daVinci.addReview(new Review("Great job with service!", "Vij", 3));
        daVinci.addReview(new Review ("Not so great today!", "Vij", 1));
        daVinci.addReview(new Review ("Great day today!", "Vij", 5));
        System.out.println(daVinci.updateStars());
        assertEquals(3.0, daVinci.updateStars(),0);
    }


}
