package UserService;

import java.util.List;
import User.User;
import util.DBHelper;
import java.sql.SQLException;

public class UserService {

    private static UserService userService;

    public static UserService getUserService() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    public void addUser(User user) throws SQLException {
        DBHelper.getDBHelper().addUser(user);
    }

    public boolean updateUser(User user) throws SQLException {
        return DBHelper.getDBHelper().updateUser(user);
    }

    public User getUserById(int id) {
        return DBHelper.getDBHelper().getUserById(id);
    }

    public List< User > getAllUsers() {
        return DBHelper.getDBHelper().getAllUsers();
    }

    public boolean deleteUser(int id) throws SQLException {
        return DBHelper.getDBHelper().deleteUser(id);
    }
}
