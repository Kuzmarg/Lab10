package adapter.task2;

import java.time.LocalDate;

public class Main {
    public Client login(String loginMethod) {
        if(loginMethod.equals("twitter")){
            return new TwitterUserWrapper(new TwitterUser("dobosevych", "Ukraine", "2022-11-11"));
        }
        else {
            return new FacebookCLientWrapper(new FacebookUser("dobosevych", Country.Ukraine, LocalDate.of(2022,11,11)));
        }
    }
}
