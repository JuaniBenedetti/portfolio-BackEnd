package portfolio.dao._CRUD;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CRUDDao<T> extends JpaRepository<T, Long> {

}
