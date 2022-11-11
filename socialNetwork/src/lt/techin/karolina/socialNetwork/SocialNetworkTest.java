package lt.techin.karolina.socialNetwork;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.BaseSocialNetworkTest;

public class SocialNetworkTest extends BaseSocialNetworkTest {
    @Override
    protected lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork getSocialNetwork() {
        return new SocialNetWorkImp();
    }
}
