package portfolio.dao._CRUD;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import portfolio.model.interfaces.User;

@NoRepositoryBean
public interface CRUDDao<T extends User> extends JpaRepository<T, Long> {

}
