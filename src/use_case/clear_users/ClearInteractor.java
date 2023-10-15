package use_case.clear_users;

import com.sun.org.apache.xerces.internal.xs.StringList;
import entity.User;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject,
                           ClearOutputBoundary clearOutputBoundary){
        this.userDataAccessObject = userDataAccessObject;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {
        StringList usernames = clearInputData.getUsernames();
        StringList usernamesSuccessfullyDeleted = null;
        for(Object username : usernames){
            if(!userDataAccessObject.existsByName((String)username)){
                clearPresenter.prepareFailedView(username + ": Account does not exist.");
            } else {
                userDataAccessObject.delete((String) username);
                usernamesSuccessfullyDeleted.add(username);
            }
        }
        ClearOutputData clearOutputData = new ClearOutputData(usernamesSuccessfullyDeleted, false);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
