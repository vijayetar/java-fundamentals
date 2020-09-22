package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    @Test
    public void testResturant(){
        Restaurant daVinci = new Restaurant("daVinci", 4, "$$$");
        assertEquals("Name : daVinci, Stars: 4, Price: $$$", daVinci.toString());
    }
    @Test public void testGetNamePriceStars(){
        Restaurant daVinci = new Restaurant("daVinci", 4, "$$$");
        assertEquals("daVinci", daVinci.getName());
        assertEquals("$$$", daVinci.getPrice());
        assertEquals(4, daVinci.getStars());
    }
    @Test public void testSetNamePriceStars(){
        Restaurant daVinci = new Restaurant("daVinci", 4, "$$$");
        daVinci.setName("DaVinci");
        daVinci.setStars(2);
        daVinci.setPrice("$$");
        assertEquals("DaVinci", daVinci.getName());
        assertEquals("$$", daVinci.getPrice());
        assertEquals(2, daVinci.getStars());
    }
    @Test
    public void testRestaurantAllReviews(){
        Restaurant daVinci = new Restaurant("daVinci", 4, "$$$");
        daVinci.addReview(new Review("Great job with service!", "Vij", 3));
        daVinci.addReview(new Review ("Not so great today!", "Vij", 1));
        assertEquals(" These are reviews: \n" +
                "1. Review: Great job with service!, Author: Vij,  Stars: 3 ,\n" +
                "2. Review: Not so great today!, Author: Vij,  Stars: 1 ,\n", daVinci.showReviews());
    }


}
