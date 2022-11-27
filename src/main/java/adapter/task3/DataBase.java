package adapter.task3;

public class DataBase extends БазаДаних{
    public String retrieveUserData(){
        return super.отриматиДаніКористувача();
    }
    public String retrieveStatic() {
        return super.отриматиСтатистичніДані();
    }

}
