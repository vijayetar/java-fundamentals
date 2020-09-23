package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TheaterTest {
    public void clearStatics(){
        Theater.movieList.clear();
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
}
