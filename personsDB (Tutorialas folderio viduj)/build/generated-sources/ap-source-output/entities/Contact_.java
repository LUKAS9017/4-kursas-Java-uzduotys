package entities;

import entities.ContactType;
import entities.Person;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-27T18:33:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Contact.class)
public class Contact_ { 

    public static volatile SingularAttribute<Contact, String> contect;
    public static volatile SingularAttribute<Contact, Person> person;
    public static volatile SingularAttribute<Contact, Long> id;
    public static volatile SingularAttribute<Contact, ContactType> type;

}