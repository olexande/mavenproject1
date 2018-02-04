package com.mycompany.mavenproject1.model;

import com.mycompany.mavenproject1.model.DocumentType;
import java.util.Date;

public class Document {
    private Integer ID;
    private Date CreationDate;
    private DocumentType TheDocumentType;

    public Document() {

    }

    public Document(Integer ID, Date CreationDate, DocumentType TheDocumentType) {
        this.ID = ID;
        this.TheDocumentType = TheDocumentType;
        this.CreationDate = CreationDate;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date CreationDate) {
        this.CreationDate = CreationDate;
    }

    public DocumentType getTheDocumentType() {
        return TheDocumentType;
    }

    public void setTheDocumentType(DocumentType TheDocumentType) {
        this.TheDocumentType = TheDocumentType;
    }

    @Override
    public String toString() {
        return "Document{" +
                "ID='" + ID + '\'' +
                "CreationDate='" + CreationDate + '\'' +
                ", TheDocumentType='" + TheDocumentType + '\'' +
                '}';
    }
}
