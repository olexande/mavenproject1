package com.mycompany.mavenproject1.model;

public class DocumentType {

        private Integer DocumentTypeID;
        private String password;

        public DocumentType() {

        }

        public DocumentType(Integer DocumentTypeID, String password) {
            this.DocumentTypeID = DocumentTypeID;
            this.password = password;
        }

        public Integer getDocumentTypeID() {
            return DocumentTypeID;
        }

        public void setDocumentTypeID(Integer DocumentTypeID) {
            this.DocumentTypeID = DocumentTypeID;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "DocumentType{" +
                    "DocumentTypeID='" + DocumentTypeID + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

