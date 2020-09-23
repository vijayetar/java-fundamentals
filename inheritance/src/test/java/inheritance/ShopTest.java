package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    public void resetStaticVariables(){
        Shop.shopReviews.clear();
    }
    @Test
    public void testShopString(){
        Shop myShop = new Shop("V", "sells flowers", 3);
        assertEquals("Shop name:  V, \n" +
                " Description: sells flowers, \n" +
                " Dollars: 3", myShop.toString());

    }
    @Test public void testShopReviews(){
        resetStaticVariables();
        Shop flowerShop = new Shop("Buzzy", "sells flowers", 4);
        flowerShop.addReview(new Review("This is a great place", "V", 4));
        flowerShop.addReview(new Review("This is so-so", "another author", 2));
        assertEquals("Review: This is a great place, Author: V,  Stars: 4\n" +
                "Review: This is so-so, Author: VV,  Stars: 2\n", flowerShop.getReviews());
    }
}
