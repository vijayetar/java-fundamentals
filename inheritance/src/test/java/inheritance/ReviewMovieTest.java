package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewMovieTest {
    @Test
    public void testReviewMovieToString(){
        ReviewMovie reviewMovie = new ReviewMovie("This movie", "Great movie", "V", 3);
        assertEquals("Movie name: This movie  Review: Great movie  By: V Stars: 3", reviewMovie.toString());

    }
}
