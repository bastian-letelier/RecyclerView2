package com.example.recyclerview2;

import java.util.Objects;

public class Element {
    private String id;
    private String texto_1;
    private String texto_2;

    public Element(String id, String texto_1, String texto_2) {
        this.id = id;
        this.texto_1 = texto_1;
        this.texto_2 = texto_2;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getTexto_1() { return texto_1; }

    public void setTexto_1(String texto_1) { this.texto_1 = texto_1; }

    public String getTexto_2() { return texto_2; }

    public void setTexto_2(String texto_2) { this.texto_2 = texto_2; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return id.equals(element.id) &&
                texto_1.equals(element.texto_1) &&
                texto_2.equals(element.texto_2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, texto_1, texto_2);
    }
}
