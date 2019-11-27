package by.ipps.adminpart.controller;

import by.ipps.adminpart.controller.base.BaseEntityAbstractController;
import by.ipps.adminpart.controller.base.BaseEntityController;
import by.ipps.dao.entity.Language;
import by.ipps.dao.service.LanguageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/language")
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LanguageController extends BaseEntityAbstractController<Language, LanguageService>
        implements BaseEntityController<Language> {

    protected LanguageController(LanguageService languageService) {
        super(languageService);
    }

}
