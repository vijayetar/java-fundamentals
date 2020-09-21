package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    @Test
    public void testResturant(){
        Restaurant daVinci = new Restaurant("daVinci", 4, "$$$");
        assertEquals("Name : daVinci, Stars: 4, Price: $$$", daVinci.toString());
    }
}
