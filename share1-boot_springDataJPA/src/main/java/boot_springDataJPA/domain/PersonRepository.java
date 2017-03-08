package boot_springDataJPA.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByAddress(String name);
    
    List<Person> findByNameAndAddress(String name, String address);
    
    @Query("select p from Person p where p.name=:name and p.address= :address")
    List<Person> withNameAndAddressQuery(@Param("name") String name,@Param("address") String address);
    
    
}
