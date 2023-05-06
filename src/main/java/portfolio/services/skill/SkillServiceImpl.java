package portfolio.services.skill;

import org.springframework.stereotype.Service;
import portfolio.dao.skill.SkillDao;
import portfolio.model.Skill;
import portfolio.services.educacion._CRUD.CRUDServiceImpl;

@Service
public class SkillServiceImpl extends CRUDServiceImpl<Skill> implements SkillService {

    public SkillServiceImpl(SkillDao skillDao) {
        super(skillDao);
    }
}
