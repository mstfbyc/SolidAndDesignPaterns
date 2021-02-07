package com.bilgeadam.designpatterns.creational.prototype;

public class DocumentType implements Cloneable{
    private Long id;
    private String Name;

    public DocumentType() {
    }

    public DocumentType(Long id, String name) {
        this.id = id;
        Name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    protected DocumentType clone() throws CloneNotSupportedException {
        return (DocumentType) super.clone();
    }

    @Override
    public String toString() {
        return "DocumentType{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
