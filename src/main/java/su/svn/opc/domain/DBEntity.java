package su.svn.opc.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public interface DBEntity extends DBRecord<UUID> {

    LocalDateTime getCreateTime();

    void setCreateTime(LocalDateTime createTime);

    LocalDateTime getUpdateTime();

    void setUpdateTime(LocalDateTime updateTime);

    Integer getFlags();

    void setFlags(Integer flags);
}
