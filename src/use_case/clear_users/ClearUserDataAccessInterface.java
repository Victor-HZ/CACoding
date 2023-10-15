package use_case.clear_users;

public interface ClearUserDataAccessInterface {
    boolean existsByName(String identifier);

    void delete(String user);

    void finishDelete();
}
