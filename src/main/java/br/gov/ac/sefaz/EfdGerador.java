package br.gov.ac.sefaz;

import br.gov.ac.sefaz.model.Efd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class EfdGerador {
    // ler o nome do arquivo
//    public static void listaArquivos(final File pasta) {
//        for (final File fileEntry : pasta.listFiles()) {
//            if (!fileEntry.isDirectory()) {
//                System.out.println(fileEntry.getName());
//            }
//        }
//    }
    public static void main(String[] args) {
        String texto = "";

        Efd efd = new Efd();// instacia da lcasse que ira se usada
        // Use persistence.xml configuration
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("geradorEfd");
        EntityManager em = emf.createEntityManager();

        try {
            File caminhoDoTexto = new File("C:\\Users\\sefaz\\Documents\\efds\\F0140715_SRF+SRF1_EFD_001-9912-SpedOIE-RO-09117799000175-00000001698583-0-202111-09122021092945-015-09122021100429.txt");
            FileReader lerCaminhoDoTexto = new FileReader(caminhoDoTexto);
            BufferedReader lerArquivo = new BufferedReader(lerCaminhoDoTexto);
            while (lerArquivo.ready()) {
                texto = lerArquivo.readLine();
                String textoSplit[] = texto.split(";");
                System.out.println(texto);
            }
            lerArquivo.close();
            //System.out.println(lerArquivo);
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado");
        }

        //Trabalhe com o em Efd
        try {

            em.getTransaction().begin(); //abre um atransação
            em.persist(efd);//pecistem o documento
            // lista todos os aquivos na pastas
            final File pasta = new File("C:\\Users\\sefaz\\Documents\\efds");
            for (final File fileEntry : pasta.listFiles()) {
                if (!fileEntry.isDirectory()) {
                    System.out.println("Aqui e o nome porra   " + fileEntry.getName());
                    efd.setNOME_ARQUIVO(fileEntry.getName());
                    efd.setARQUIVO_BLOB(texto);
                }
            }
            System.out.println("aquiiiii  ->  " + pasta.getName());
            //listaArquivos(pasta);
            em.getTransaction().commit(); // faz um commit dos arquivos

        } catch (Exception e) {
            System.out.println("Eita porra acho que deu merda !!" + e.getMessage());
        } finally {
            em.close();
        }


    }
}

