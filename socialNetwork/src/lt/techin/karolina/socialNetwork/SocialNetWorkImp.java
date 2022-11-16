package lt.techin.karolina.socialNetwork;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SocialNetWorkImp implements SocialNetwork {
    List<Friend> friendList = new ArrayList<>();

    @Override
    public void addFriend(Friend friend) throws IllegalArgumentException{
        if (friendList.contains(friend)) {
        } else if (friend == null) {
            throw new IllegalArgumentException("IllegalArgumentException");
        } else {
            friendList.add(friend);
        }
    }

    @Override
    public int getNumberOfFriends() {
        return friendList.size();
    }

    @Override
    public Friend findFriend(String firstName, String lastName) throws FriendNotFoundException {
//        Collection collection = new ArrayList<>();
        Friend collection = null;
        for (Friend friend : friendList) {
            if (firstName.matches(friend.getFirstName())
                    && lastName.matches(friend.getLastName())) {
                collection = friend;
            } else {
                throw new FriendNotFoundException(firstName, lastName);
            }
        }
        return collection;
    }


    @Override
    public Collection<Friend> findByCity(String city) {
        Collection collections = new ArrayList<>();
        for (Friend friend : friendList) {
            if (city.matches(friend.getCity())) {
                collections.add(friend);
            }
        }
        return collections;
    }

    @Override
    public Collection<Friend> getOrderedFriends() {
//       return Collections.sort(friendList, new ComporatorFriend());
        return null;
    }
}
