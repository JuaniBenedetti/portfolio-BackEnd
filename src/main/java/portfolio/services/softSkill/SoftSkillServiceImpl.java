package portfolio.services.softSkill;

import portfolio.dao.softSkill.SoftSkillDao;
import portfolio.model.SoftSkill;
import portfolio.services._CRUD.CRUDServiceImpl;

public class SoftSkillServiceImpl extends CRUDServiceImpl<SoftSkill> implements SoftSkillService {

    public SoftSkillServiceImpl(SoftSkillDao softSkillDao) { super(softSkillDao); }
}
