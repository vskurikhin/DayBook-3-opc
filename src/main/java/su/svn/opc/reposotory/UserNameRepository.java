package su.svn.opc.reposotory;

import org.springframework.data.repository.CrudRepository;
import su.svn.opc.domain.UserName;

import java.util.UUID;

public interface UserNameRepository extends CrudRepository<UserName, UUID> {
}
