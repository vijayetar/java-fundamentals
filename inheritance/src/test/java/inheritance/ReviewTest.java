package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
    @Test
    public void testReviewClass(){
        Review review = new Review("Great place!", "Vij", 3);
        assertEquals("1. Stars: 3  By Vij : Great place!", review.toString());
    }

}
