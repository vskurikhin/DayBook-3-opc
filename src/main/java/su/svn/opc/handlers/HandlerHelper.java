package su.svn.opc.handlers;

import lombok.extern.slf4j.Slf4j;
import su.svn.opc.domain.DBSubject;

@Slf4j
public class HandlerHelper<T extends DBSubject> {

    private final Class<T> aClass;

    HandlerHelper(Class<T> aClass) {
        this.aClass = aClass;
    }

    public void handleBeforeCreate(T entity) {
        log.info("Before create {}{id={}}....", aClass.getSimpleName(), entity.getId());
    }

    public void handleAfterCreate(T entity) {
        log.info("After create {}{id={}}....", aClass.getSimpleName(), entity.getId());
    }

    public void handleBeforeSave(T entity) {
        log.info("Before save {}{id={}}....", aClass.getSimpleName(), entity.getId());
    }

    public void handleAfterSave(T entity) {
        log.info("After save {}{id={}}....", aClass.getSimpleName(), entity.getId());
    }

    public void handleBeforeDelete(T entity) {
        log.info("Before delete {}{id={}}....", aClass.getSimpleName(), entity.getId());
    }

    public void handleAfterDelete(T entity) {
        log.info("After delete {}{id={}}....", aClass.getSimpleName(), entity.getId());
    }
}
