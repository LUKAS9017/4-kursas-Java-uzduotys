package personsdb;

import entities.Contact;
import entities.ContactType;
import entities.Person;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class PersonsDB {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            double height = Math.random() + 1;
            double weight = Math.random() * 100;
            PersonService.createPerson("Jonas" + i, "Maratonas" + i, LocalDate.now(), new BigDecimal(height), new BigDecimal(weight));
        }

        System.out.println("Ugiu vidurkis " + PersonService.getAverageHeight());
        System.out.println("Ugiu vidurkis " + PersonService.getAverageHeight2());

        BigDecimal nuo = new BigDecimal(0);
        BigDecimal iki = new BigDecimal(2.00);

        List<Person> r = PersonService.getPersonsByHeight(nuo, iki);

        for (Person person : r) {
            System.out.println(person.getId() + " " + person.getHeight());
        }

        Person p1 = new Person();
        p1.setFirstName("Saulius");
        p1.setSecondName("Vetra");
        p1.setBirthday(LocalDate.now());

        Contact p1c1 = new Contact();
        p1c1.setContent("+370123456789");
        p1c1.setType(ContactType.MOBILE);
        p1c1.setPerson(p1);

        Contact p1c2 = new Contact();
        p1c2.setContent("svako@svako.lt");
        p1c2.setType(ContactType.EMAIL);
        p1c2.setPerson(p1);

        p1.getContacts().add(p1c1);
        p1.getContacts().add(p1c2);
        PersonService.createPerson(p1);

        Person p2 = PersonService.findPersonById(11L);

        List<Contact> p2contacts = p2.getContacts();

        for (Contact p2contact : p2contacts) {
            System.out.println(p2contact.getContent());
        }
        /*
            Person p = PersonService.findPersonById(1L);
            p.setFirstName("Petras");
            p.setSecondName("Petraitis");
            PersonService.updatePerson(p);

            PersonService.deletePersonById(2L);

            PersonService.deletePerson(p);

            List<Person> allp = PersonService.getAllPersons();
            for (Person person : allp) {
                System.out.println(person.getFirstName());
            }
         */
 /*
        Person p3 = em.find(Person.class, 1L);
        Person p4 = em.find(Person.class, 2L);
        
        System.out.println(p3.getFirstName());
        System.out.println(p4.getFirstName());
         */
    }

}
