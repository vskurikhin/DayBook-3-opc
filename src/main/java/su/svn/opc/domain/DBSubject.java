package su.svn.opc.domain;

public interface DBSubject extends DBEntity {

    String getUserName();

    void setUserName(String userName);

    Boolean getEnabled();

    void setEnabled(Boolean enabled);

    Boolean getVisible();

    void setVisible(Boolean visible);
}
