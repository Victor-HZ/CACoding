package interface_adapter.clear_users;

import com.sun.org.apache.xerces.internal.xs.StringList;

public class ClearState {
    private StringList usernames;
    private String usernameError = null;

    public ClearState(ClearState copy){
        usernames = copy.usernames;
        usernameError = copy.usernameError;
    }

    public ClearState(){}

    public StringList getUsernames(){return usernames;}

    public String getUsernameError() {
        return usernameError;
    }

    public void setUsernames(StringList usernames){
        this.usernames = usernames;
    }

    public void setUsernameError(String usernameError) {
        this.usernameError = usernameError;
    }
}
