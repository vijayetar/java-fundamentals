package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TheaterTest {
    public void clearStatics(){
        Theater.movieList.clear();
        Theater.reviewList.clear();
    }
    @Test
    public void testTheaterInstance(){
        clearStatics();
        Theater theBase = new Theater("The Base");
        assertEquals("The Base is playing : \n" +
                "No movies playing right now!", theBase.toString());
    }
    @Test public void testAddMovie(){
        clearStatics();
        Theater theBase = new Theater("The Base");
        theBase.addMovie("Movie One");
        theBase.addMovie("Movie Two");
        assertEquals("The Base is playing : \n" +
                "Movie One\n" +
                "Movie Two\n", theBase.toString());

    }
    @Test public void testRemoveMoviePresent() throws Exception {
        clearStatics();
        Theater theBase = new Theater("The Base");
        theBase.addMovie("Movie One");
        theBase.addMovie("Movie Two");
        theBase.addMovie("Movie Three");
        theBase.addMovie("Movie Four");
        theBase.removeMovie("Movie Two");
        assertEquals("The Base is playing : \n" +
                "Movie One\n" +
                "Movie Three\n" +
                "Movie Four\n", theBase.toString());

    }
//    @Test public void testRemoveMovieAbsent() throws Exception {
//        clearStatics();
//        Theater theBase = new Theater("The Base");
//        theBase.addMovie("Movie One");
//        theBase.addMovie("Movie Two");
//        theBase.addMovie("Movie Three");
//        theBase.addMovie("Movie Four");
//        assertThrows(theBase.removeMovie("Movie Five"), "");
//
//    }
    // test add reviews and show reviews
    @Test public void testAddTheaterReview() {
        clearStatics();
        Theater theBase = new Theater("The Base");
        theBase.addTheaterReview(new Review ("great place", "V", 3));
        theBase.addTheaterReview(new Review ("so-so", "v", 2));
        assertEquals("Here are the reviews: \n" +
                "Review: so-so, Author: v,  Stars: 2\n" +
                "Review: so-so, Author: v,  Stars: 2", theBase.showReviews());
    }
    @Test public void testAddMovieReview() {
        clearStatics();
        Theater theBase = new Theater("The Base");
        theBase.addTheaterReview(new Review ("great place", "V", 3));
        theBase.addTheaterReview(new Review ("so-so", "v", 2));
        theBase.addMovieReview(new ReviewMovie("Movie One", "So-so movie", "V", 2));
        assertEquals("Here are the reviews: \n" +
                "Review: So-so movie, Author: V,  Stars: 2\n" +
                "Review: So-so movie, Author: V,  Stars: 2\n" +
                "Movie name: Movie One  Review: So-so movie  By: V Stars: 2", theBase.showReviews());
    }
}
