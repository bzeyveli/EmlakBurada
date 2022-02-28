package emlakburada.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import emlakburada.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
