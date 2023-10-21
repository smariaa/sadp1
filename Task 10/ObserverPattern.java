import java.util.ArrayList;
import java.util.List;

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String post);
}

class FacebookUser implements Subject {
    private String username;
    private List<Observer> followers;
    private String latestPost;

    public FacebookUser(String username) {
        this.username = username;
        this.followers = new ArrayList<>();
    }

    public void postUpdate(String post) {
        latestPost = post;
        notifyObservers(post);
    }

    @Override
    public void registerObserver(Observer observer) {
        followers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        followers.remove(observer);
    }

    @Override
    public void notifyObservers(String post) {
        for (Observer follower : followers) {
            follower.update(username, post);
        }
    }
}

interface Observer {
    void update(String username, String post);
}

class FacebookFollower implements Observer {
    private String followerName;

    public FacebookFollower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String username, String post) {
        System.out.println(followerName + " received an update from " + username + ":");
        System.out.println(post);
        System.out.println();
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        FacebookUser alice = new FacebookUser("Alice");
        FacebookUser bob = new FacebookUser("Bob");

        FacebookFollower follower1 = new FacebookFollower("Follower 1");
        FacebookFollower follower2 = new FacebookFollower("Follower 2");

        alice.registerObserver(follower1);
        alice.registerObserver(follower2);
        bob.registerObserver(follower2);

        alice.postUpdate("Hello, everyone! This is my first post.");
        bob.postUpdate("Feeling excited about the weekend!");

        alice.removeObserver(follower1);

        alice.postUpdate("A beautiful sunset today!");
    }
}