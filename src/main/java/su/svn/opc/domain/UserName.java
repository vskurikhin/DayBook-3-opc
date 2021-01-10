package su.svn.opc.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "user_name")
public class UserName implements Serializable {

    @Getter
    @NotNull
    @Id
    @Type(type = "uuid-binary")
    @GeneratedValue(generator = "idUserNameGenerator")
    @GenericGenerator(name = "idUserNameGenerator", strategy = "uuid2")
    @Column(name = "id", length = 16, unique = true, nullable = false, updatable = false)
    private UUID id;

    @Getter
    @Setter
    @Column(name = "user_name")
    private String userName;

    @Getter
    @Setter
    @Column(name = "password")
    private String password;

    @Getter
    @Setter
    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Getter
    @Setter
    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @Getter
    @Setter
    @Column(name = "enabled")
    private Boolean enabled;

    @Getter
    @Setter
    @Column(name = "visible")
    private Boolean visible;

    @Getter
    @Setter
    @Column(name = "flags")
    private Integer flags;
}
