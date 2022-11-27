package singleton.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;

    public void save() {
        Connection connection = Connection.getConnection();
        String query = "insert into user (email, name) values (" + email + "," + name + ");";
        connection.executeQuery(query);
    }
}
