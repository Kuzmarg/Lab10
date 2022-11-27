package adapter.task2;

public class TwitterUserWrapper implements Client{
    public TwitterUser user;
    public TwitterUserWrapper(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public String getLastActiveTime() {
        return null;
    }
}
