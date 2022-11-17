package lt.techin.karolina.philatelist;

import philatelist.Philatelist;
import philatelist.PostStamp;

import java.util.ArrayList;
import java.util.List;

public class PhilatelistImpl implements Philatelist {
    List<PostStamp> collection = new ArrayList<>();

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (!collection.contains(postStamp)) {
            collection.add(postStamp);
        }
        if (postStamp == null || postStamp.getName() == null || postStamp.getName().isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public PostStamp getTheMostExpensivePostStamByMarketValue() {
        PostStamp mostExpensive = this.collection.get(0);
//        if (mostExpensive == null) {
//            throw new IllegalArgumentException();
//        }
        for (PostStamp thing : this.collection) {
            if (thing.getMarketPrice() > mostExpensive.getMarketPrice()) {
                mostExpensive = thing;
            }
        }
        return mostExpensive;
    }

    @Override
    public double getAveragePostStampPrice() {
        double sum = 0;
        for (PostStamp stamp : collection) {
            sum += stamp.getMarketPrice();
        }
        return sum / collection.size();
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return collection.size();
    }
}
