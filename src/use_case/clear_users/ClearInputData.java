package use_case.clear_users;

import com.sun.org.apache.xerces.internal.xs.StringList;

public class ClearInputData {

    final private StringList usernames;

    public ClearInputData(StringList usernames){
        this.usernames = usernames;
    }

    StringList getUsernames(){
        return usernames;
    }

}
