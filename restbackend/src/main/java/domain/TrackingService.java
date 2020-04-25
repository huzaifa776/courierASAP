package domain;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@ApplicationScoped
@Transactional
public class TrackingService implements TrackingInterface {

    @PersistenceContext(unitName = "payaraHibernate")
    private EntityManager em;

    //storing data into the database
    public void storeData(Tracking addingData) {
        em.persist(addingData);
    }


    //retrieving data from the database
    public List<Tracking> retrieveData() {
        return em.createQuery("SELECT e FROM domain.Tracking e").getResultList();
    }


}
