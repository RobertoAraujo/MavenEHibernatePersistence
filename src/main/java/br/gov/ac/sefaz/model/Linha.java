package br.gov.ac.sefaz.model;

import java.util.List;
import java.util.Objects;

public class Linha {
    private String linha;
    public static List<String> newArrayList() {
        return null;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Linha)) return false;
        Linha linha1 = (Linha) o;
        return Objects.equals(getLinha(), linha1.getLinha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLinha());
    }

    @Override
    public String toString() {
        return "Linha{" +
                "linha='" + linha + '\'' +
                '}';
    }
}
