package use_case.clear_users;

import com.sun.org.apache.xerces.internal.xs.StringList;
import entity.User;

public class ClearOutputData {
    private final StringList usernames;
    private boolean useCaseFaild;

    public ClearOutputData(StringList usernames, boolean useCaseFaild){
        this.usernames = usernames;
        this.useCaseFaild = useCaseFaild;
    }

    public StringList getUsernames() {
        return usernames;
    }
}
