package portfolio.web.softSkill;

import portfolio.model.SoftSkill;
import portfolio.services.softSkill.SoftSkillService;
import portfolio.web._CRUD.CRUDControllerImpl;

public class SoftSkillControllerImpl extends CRUDControllerImpl<SoftSkill> implements SoftSkillController {

    public SoftSkillControllerImpl(SoftSkillService softSkillService) { super(softSkillService); }
}
