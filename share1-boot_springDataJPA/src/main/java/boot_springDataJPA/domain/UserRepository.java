package boot_springDataJPA.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person, Long> , UserDao{

}
