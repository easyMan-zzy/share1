package boot_springDataJPA.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserRepositoryImpl implements UserDao{
	@PersistenceContext
	private EntityManager em;
	
	public List<DTO> test() {
		List<DTO> abcs = em.createQuery("select new boot_springDataJPA.domain.DTO(u.a,ue.personName) " +
                "from User u, UserExtent ue  where u.guanlian=ue.guanlian").getResultList();
		return abcs;
	}
}
