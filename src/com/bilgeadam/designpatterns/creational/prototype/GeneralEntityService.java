package com.bilgeadam.designpatterns.creational.prototype;

public class GeneralEntityService {
    public DocumentType findDocumentTypeById(Long id){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DocumentType documentType = new DocumentType();
        documentType.setId(id);
        String name;
        if(id.compareTo(1l)==00){
            name = "Personel";
        }else  if(id.compareTo(2l)==00){
            name= "Company";
        }else {
            name = "Genarel";
        }
        documentType.setName(name);
        return documentType;
    }

    public Category findCategoryById(Long id){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Category category = new Category();
        category.setId(id);
        String name;
        if(id.compareTo(1l)==00){
            name = "Personel";
        }else  if(id.compareTo(2l)==00){
            name= "Company";
        }else {
            name = "Genarel";
        }
        category.setName(name);
        return category;
    }
    public Document findDocumentByID(Long id){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Document document = new Document();
        document.setId(id);
        document.setDocumentType(findDocumentTypeById(id));
        document.setCategory(findCategoryById(id));
        String name;
        String data;
        if(id.compareTo(1l)==00){
            name = "Personel";
            data = "Sevgili Dostum Mustafa";
        }else  if(id.compareTo(2l)==00){
            name = "Company";
            data ="Genel Müdür raporu";
        }else {
            name = "Genarel";
            data = "Yaya yol ver.";
        }
        document.setName(name);
        document.setData(data);
        return document;
    }
}
