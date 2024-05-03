package entities;

import entities.Contact;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-27T18:33:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, LocalDate> birthday;
    public static volatile SingularAttribute<Person, String> firstName;
    public static volatile SingularAttribute<Person, Long> id;
    public static volatile ListAttribute<Person, Contact> contacts;
    public static volatile SingularAttribute<Person, String> secondName;

}