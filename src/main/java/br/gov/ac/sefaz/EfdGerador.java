package br.gov.ac.sefaz;

import br.gov.ac.sefaz.model.Efd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EfdGerador {
    public static void main(String[] args) {
        // Use persistence.xml configuration
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("geradorefd"); //O erro da logo aqui nesta primeira linha
        EntityManager em = emf.createEntityManager(); // Retrieve an application managed entity manager

        //Trabalhe com o em Efd
        Efd efd = new Efd();
        efd.setId(1);
        efd.setNome("noe de algum aquivo ai mano");
        efd.setFome("matei quase indagora");
        em.persist(efd);

        em.close();
        emf.close(); //close at application end
    }
}
