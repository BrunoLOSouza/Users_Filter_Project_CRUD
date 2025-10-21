package brunolosouza.Users_Filter_Project.repository;

import brunolosouza.Users_Filter_Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
