package adapter.task3;

public class Authorization extends Авторизація{
    public boolean authorize(DataBase db) {
        db.retrieveUserData();
        return true;
    }
}
