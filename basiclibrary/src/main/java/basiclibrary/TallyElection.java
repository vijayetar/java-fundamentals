package basiclibrary;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TallyElection {
    public boolean someLibraryMethod() {
        return true;
    }
    public String tally(List<String> stringList){
        // create a hashmap
        // add each new key with a counter 0
        // if there are matches, then the counter should increase by 1
        // find the key with the highest count
        // return one string with the winner in it
        HashMap<String, Integer> votesTally = new HashMap<>();
        int count;
        int maxCount = 0;
        String winner = null;
        if (stringList.size()==0) {return "Empty List";}
        for (String name:stringList)
            if (!votesTally.containsKey(name)) votesTally.put(name, 1);
            else {
                count = votesTally.get(name);
                count++;
                winner = (count > maxCount) ? name : winner;
                votesTally.put(name, count);
                System.out.println(name + " " + votesTally.get(name));
            }
        return MessageFormat.format("{0} received the most votes!", winner);
    }
}
