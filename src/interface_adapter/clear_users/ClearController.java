package interface_adapter.clear_users;

import com.sun.org.apache.xerces.internal.xs.StringList;
import use_case.clear_users.*;

public class ClearController {

    final ClearInputBoundary clearUseCaseInteractor;
    public ClearController(ClearInputBoundary clearUseCaseInteractor){
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public void execute(StringList usernames) {
        ClearInputData clearInputData = new ClearInputData(usernames);

        clearUseCaseInteractor.execute(clearInputData);
    }
}
