package by.ipps.adminpart.controller;

import by.ipps.adminpart.controller.base.BaseEntityAbstractController;
import by.ipps.adminpart.controller.base.BaseEntityController;
import by.ipps.adminpart.entity.Contact;
import by.ipps.adminpart.utils.resttemplate.ContactRestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController extends BaseEntityAbstractController<Contact, ContactRestTemplate>
        implements BaseEntityController<Contact> {
    protected ContactController(ContactRestTemplate contactRestTemplate) {
        super(contactRestTemplate, "/contact");
    }
}
