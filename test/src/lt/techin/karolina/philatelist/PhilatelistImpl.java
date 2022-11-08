package lt.techin.karolina.philatelist;

import philatelist.Philatelist;
import philatelist.PostStamp;

import java.util.ArrayList;
import java.util.List;

public class PhilatelistImpl implements Philatelist {

    List<PostStamp> collection = new ArrayList<>();
    double marketPrice;


    @Override
    public void addToCollection(PostStamp postStamp) {
        if (collection.contains(postStamp)) {
        } else {
            collection.add(postStamp);
        }
    }

    @Override
    public PostStamp getTheMostExpensivePostStamByMarketValue() {
        return null;
    }

    @Override
    public double getAveragePostStampPrice() {
        return 0;
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return collection.size();
    }
}
