package br.gov.ac.sefaz;

import br.gov.ac.sefaz.model.Efd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EfdGerador {
    public static void main(String[] args) {
        // Use persistence.xml configuration
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("geradorEfd"); //  O erro da logo aqui nesta primeira linha
        EntityManager em = emf.createEntityManager(); // Retrieve an application managed entity manager

        //Trabalhe com o em Efd
        try {
            Efd efd= new Efd();
            em.getTransaction().begin();
            em.persist(efd);
            efd.setId(2);
            efd.setNome("nome de algum aquivo ai mano");
            efd.setFome("matei quase indagora");
            em.getTransaction().commit();
            System.out.println("Foi caralho !");
        } catch (Exception e) {
            System.out.println("Eita porra acho que deu merda !!"+ e.getMessage());
        } finally {
            em.close();
        }
    }
}
