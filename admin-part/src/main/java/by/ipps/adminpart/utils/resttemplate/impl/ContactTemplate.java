package by.ipps.adminpart.utils.resttemplate.impl;

import by.ipps.adminpart.entity.Contact;
import by.ipps.adminpart.utils.resttemplate.ContactRestTemplate;
import by.ipps.adminpart.utils.resttemplate.base.AbstractBaseEntityRestTemplate;
import org.springframework.stereotype.Component;

@Component
public class ContactTemplate extends AbstractBaseEntityRestTemplate<Contact> implements ContactRestTemplate {
}
