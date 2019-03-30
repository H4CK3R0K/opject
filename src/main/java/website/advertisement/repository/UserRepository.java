package website.advertisement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import website.advertisement.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}