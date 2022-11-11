package lt.techin.karolina.socialNetwork;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SocialNetWorkImp implements SocialNetwork{
    List<Friend> friendList = new ArrayList<>();

    @Override
    public void addFriend(Friend friend) {
        if (friendList.contains(friend)) {
        } else {
            friendList.add(friend);
        }
    }

    @Override
    public int getNumberOfFriends() {
        return friendList.size();
    }

    @Override
    public Friend findFriend(String s, String s1) throws FriendNotFoundException {
        return null;
    }

    @Override
    public Collection<Friend> findByCity(String s) {
        return null;
    }

    @Override
    public Collection<Friend> getOrderedFriends() {
       return Collections.sort(friendList, new ComporatorFriend());
    }
}
