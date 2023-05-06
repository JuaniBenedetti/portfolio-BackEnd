package portfolio.web.skill;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.model.Skill;
import portfolio.services.skill.SkillService;
import portfolio.web._CRUD.CRUDControllerImpl;

@RestController
@RequestMapping("/skill")
public class SkillControllerImpl extends CRUDControllerImpl<Skill> implements SkillController {

    public SkillControllerImpl(SkillService skillService) { super(skillService); }
}
