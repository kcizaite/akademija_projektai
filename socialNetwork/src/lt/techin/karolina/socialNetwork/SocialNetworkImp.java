package lt.techin.karolina.socialNetwork;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.*;

public class SocialNetworkImp implements SocialNetwork {
    List<Friend> friendList = new ArrayList<>();

    @Override
    public void addFriend(Friend friend) {
        if (friend == null) {
            throw new IllegalArgumentException(); }
        if (! friendList.contains(friend))
        {friendList.add(friend);
        }
    }

    @Override
    public int getNumberOfFriends() {
        return friendList.size();
    }

    @Override
    public Friend findFriend(String firstName, String lastName) throws FriendNotFoundException {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException();
        }
        return friendList.stream().filter(fr -> fr.getFirstName().equals(firstName)
                        && fr.getLastName().equals(lastName))
                .findFirst().orElseThrow(() -> new FriendNotFoundException(firstName, lastName));
    }

    @Override
    public Collection<Friend> findByCity(String city) {
        Collection collections = new ArrayList<>();
        if (city == null) {
            throw new IllegalArgumentException();
        }
        for (Friend friend : friendList) {
            if (city.matches(friend.getCity())) {
                collections.add(friend);
            }
        }
        return collections;
    }

    @Override
    public Collection<Friend> getOrderedFriends() {
        friendList.sort(Comparator.comparing(Friend::getCity).thenComparing(Friend::getLastName)
                .thenComparing(Friend::getFirstName));
        return friendList;
    }
}
