package use_case.clear_users;

import java.util.ArrayList;

public interface ClearUserDataAccessInterface {
    ArrayList<String> getUsernames();

    boolean existsByName(String identifier);

    void delete(String user);

    void finishDelete();
}
