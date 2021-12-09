package br.gov.ac.sefaz.model;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "EFD_IDENTIFICACAO", schema = "EFD")
public class Efd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "NOME_ARQUIVO")
    private String NOME_ARQUIVO;
    @Lob
    @Column (name = "ARQUIVO_BLOB")
    private String ARQUIVO_BLOB;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNOME_ARQUIVO() {
        return NOME_ARQUIVO;
    }

    public void setNOME_ARQUIVO(String NOME_ARQUIVO) {
        this.NOME_ARQUIVO = NOME_ARQUIVO;
    }

    public String getARQUIVO_BLOB() {
        return ARQUIVO_BLOB;
    }

    public void setARQUIVO_BLOB(String ARQUIVO_BLOB) {
        this.ARQUIVO_BLOB = ARQUIVO_BLOB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Efd)) return false;
        Efd efd = (Efd) o;
        return getId() == efd.getId() && Objects.equals(getNOME_ARQUIVO(), efd.getNOME_ARQUIVO()) && Objects.equals(getARQUIVO_BLOB(), efd.getARQUIVO_BLOB());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNOME_ARQUIVO(), getARQUIVO_BLOB());
    }

    @Override
    public String toString() {
        return "Efd{" +
                "id=" + id +
                ", NOME_ARQUIVO='" + NOME_ARQUIVO + '\'' +
                ", ARQUIVO_BLOB='" + ARQUIVO_BLOB + '\'' +
                '}';
    }
}
