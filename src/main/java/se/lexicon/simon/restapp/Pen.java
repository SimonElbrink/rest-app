package se.lexicon.simon.restapp;

import java.util.Objects;

public class Pen {

    int id;
    String name;
    String Barcode;

    public Pen(int id, String name, String barcode) {
        this.id = id;
        this.name = name;
        Barcode = barcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return id == pen.id &&
                Objects.equals(name, pen.name) &&
                Objects.equals(Barcode, pen.Barcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, Barcode);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Barcode='" + Barcode + '\'' +
                '}';
    }
}
