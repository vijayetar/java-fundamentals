package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TallyElectionTest {
    @Test
    public void testSomeLibraryMethod() {
        TallyElection classUnderTest = new TallyElection();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test public void testTally(){
        TallyElection tallyElection = new TallyElection();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        assertEquals("Bush received the most votes!", tallyElection.tally(votes));
    }
    @Test public void testTallyEmpty(){
        TallyElection tallyElection = new TallyElection();
        List<String> votes = new ArrayList<>();
        assertEquals("Empty List", tallyElection.tally(votes));
    }
}
