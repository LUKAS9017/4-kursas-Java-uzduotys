package personsdb;

import entities.Person;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;

public class PersonService {

    public static void createPerson(Person person) {
        EntityManager em = DatabaseUtils.getEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();
    }

    public static void createPerson(String firstName, String secondName, LocalDate birthday, BigDecimal height, BigDecimal weight) {
        EntityManager em = DatabaseUtils.getEntityManager();
        em.getTransaction().begin();

        Person p = new Person();

        p.setFirstName(firstName);
        p.setSecondName(secondName);
        p.setBirthday(birthday);
        p.setHeight(height);
        p.setWeight(weight);

        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }

//Gaunamas Person pagal id
    public static Person findPersonById(Long id) {
        Person p = null;
        EntityManager em = DatabaseUtils.getEntityManager();
        p = em.find(Person.class, id);
        em.close();
        return p;
    }
//Update

    public static Person updatePerson(Person person) {
        EntityManager em = DatabaseUtils.getEntityManager();
        em.getTransaction().begin();
        em.merge(person);
        em.getTransaction().commit();
        em.close();
        return person;
    }

    public static void deletePerson(Person person) {
        EntityManager em = DatabaseUtils.getEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(person));
        em.getTransaction().commit();
        em.close();
    }

    public static void deletePersonById(Long id) {
        EntityManager em = DatabaseUtils.getEntityManager();
        em.getTransaction().begin();
        Person p = em.find(Person.class, id);
        if (p != null) {
            em.remove(p);
        }
        em.getTransaction().commit();
        em.close();
    }

    public static List<Person> getAllPersons() {
        List<Person> persons = null;
        EntityManager em = DatabaseUtils.getEntityManager();
        persons = em.createQuery("select p from Person p").getResultList();
        em.close();
        return persons;
    }

    public static BigDecimal getAverageHeight() {
        BigDecimal result = null;
        EntityManager em = DatabaseUtils.getEntityManager();
        double iresult = ((double) em.createQuery("select avg(p.height) from Person p").getSingleResult());
        System.out.println("Tarpinis " + iresult);
        result = new BigDecimal(iresult, new MathContext(3, RoundingMode.HALF_UP));
        em.close();
        return result;
    }

    //Daro tapai, kaip "public static BigDecimal getAverageHeight()" tiktais per Java, o ne per gpa
    public static BigDecimal getAverageHeight2() {
        BigDecimal result = null;
        List<Person> p1 = getAllPersons();
        double iresult = p1.stream().mapToDouble(p -> p.getHeight().doubleValue()).average().getAsDouble();
        System.out.println("Tarpinis " + iresult);
        result = new BigDecimal(iresult, new MathContext(3, RoundingMode.HALF_UP));
        return result;
    }

    public static List<Person> getPersonsByHeight(BigDecimal heightFrom, BigDecimal heightTo) {
        List<Person> result = null;
        EntityManager em = DatabaseUtils.getEntityManager();
        result = em.createQuery("select p from Person p where p.height between :h1 and :h2")
                .setParameter("h1", heightFrom)
                .setParameter("h2", heightTo)
                .getResultList();
        em.close();
        return result;
    }
}
