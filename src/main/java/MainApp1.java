import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainApp1 {


    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        School school1 = new School();
        school1.setName("HAPPY_SCHOOL");

        Student student1 = new Student();
        student1.setName("Ed");
        student1.setSchool(school1);

        tx.begin();
        em.persist(student1);
        tx.commit();
        emf.close();






    }
}
