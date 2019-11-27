package by.ipps.adminpart.controller;

import by.ipps.adminpart.controller.base.BaseEntityAbstractController;
import by.ipps.adminpart.controller.base.BaseEntityController;
import by.ipps.dao.entity.Logger;
import by.ipps.dao.service.LoggerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logger")
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LoggerController extends BaseEntityAbstractController<Logger, LoggerService>
        implements BaseEntityController<Logger> {

    protected LoggerController(LoggerService loggerService) {
        super(loggerService);
    }
}
