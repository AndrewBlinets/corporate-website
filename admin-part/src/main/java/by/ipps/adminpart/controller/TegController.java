package by.ipps.adminpart.controller;

import by.ipps.adminpart.controller.base.BaseEntityAbstractController;
import by.ipps.adminpart.controller.base.BaseEntityController;
import by.ipps.adminpart.entity.Teg;
import by.ipps.dao.entity.Teg;
import by.ipps.dao.service.TegService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teg")
public class TegController extends BaseEntityAbstractController<Teg, TegService>
        implements BaseEntityController<Teg> {

    protected TegController(TegService tegService) {
        super(tegService);
    }


}
