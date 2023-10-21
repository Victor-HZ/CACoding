package interface_adapter.clear_users;

import use_case.clear_users.*;

import java.util.ArrayList;

public class ClearController {

    final ClearInputBoundary clearUseCaseInteractor;
    public ClearController(ClearInputBoundary clearUseCaseInteractor){
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public void execute(ArrayList<String> usernames) {
        ClearInputData clearInputData = new ClearInputData(usernames);

        clearUseCaseInteractor.execute(clearInputData);
    }
}
