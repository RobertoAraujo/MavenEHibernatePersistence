package br.gov.ac.sefaz.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "efd")
public class Efd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome;
    @Column
    private String fome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFome() {
        return fome;
    }

    public void setFome(String fome) {
        this.fome = fome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Efd)) return false;
        Efd efd = (Efd) o;
        return getId() == efd.getId() && Objects.equals(getNome(), efd.getNome()) && Objects.equals(getFome(), efd.getFome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getFome());
    }

    @Override
    public String toString() {
        return "Efd{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", fome='" + fome + '\'' +
                '}';
    }
}
