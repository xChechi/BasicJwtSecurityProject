package chechi.homework.jwtsecurity.repository;

import chechi.homework.jwtsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //Amigo is not using this annotation.. why ?
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail (String email);

}
