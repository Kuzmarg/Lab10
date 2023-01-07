package adapter.task2;

public class FacebookCLientWrapper implements Client{
    public FacebookUser user;
    public FacebookCLientWrapper(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry().equals(Country.Poland) ? "Poland" :
                user.getUserCountry().equals(Country.Ukraine) ? "Ukraine": "USA";
    }

    @Override
    public String getLastActiveTime() {
        return null;
    }
}
