package su.svn.opc.reposotory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import su.svn.opc.domain.UserName;

import java.util.Optional;
import java.util.UUID;

public interface UserNameRepository extends CrudRepository<UserName, UUID> {

    @Query("SELECT e FROM UserName e WHERE e.visible = true")
    Page<UserName> findAll(Pageable pageable);

    @Query("SELECT e FROM UserName e WHERE e.visible IS NULL OR e.visible <> true")
    Page<UserName> findAllNonVisible(Pageable pageable);

    @Query("SELECT e FROM UserName e WHERE e.id = :id AND e.visible = true")
    Optional<UserName> findById(UUID id);

    @Query("SELECT COUNT(e) FROM UserName e WHERE e.visible = true")
    Long findCount();
}
