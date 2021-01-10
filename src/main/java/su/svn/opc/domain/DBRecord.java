package su.svn.opc.domain;

import java.io.Serializable;

public interface DBRecord<K> extends Serializable {

    K getId();
}
