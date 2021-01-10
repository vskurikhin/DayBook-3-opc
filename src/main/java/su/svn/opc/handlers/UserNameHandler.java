package su.svn.opc.handlers;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleAfterSave;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import su.svn.opc.domain.UserName;

@RepositoryEventHandler
public class UserNameHandler {

    private final HandlerHelper<UserName> handlerHelper;

    public UserNameHandler() {
        handlerHelper = new HandlerHelper<>(UserName.class);
    }

    @HandleBeforeCreate
    public void handleBeforeCreate(UserName userName){
        handlerHelper.handleBeforeCreate(userName);
    }

    @HandleAfterCreate
    public void handleAfterCreate(UserName userName){
        handlerHelper.handleAfterCreate(userName);
    }

    @HandleBeforeSave
    public void handleBeforeSave(UserName userName){
        handlerHelper.handleBeforeSave(userName);
    }

    @HandleAfterSave
    public void handleAfterSave(UserName userName){
        handlerHelper.handleAfterSave(userName);
    }

    @HandleBeforeDelete
    public void handleBeforeDelete(UserName userName){
        handlerHelper.handleBeforeDelete(userName);
    }

    @HandleAfterDelete
    public void handleAfterDelete(UserName userName){
        handlerHelper.handleAfterDelete(userName);
    }
}
