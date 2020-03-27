package com.company;

public class Book {
    private String ISBN ;
    private String Title;
    private String Author;
    private int Edition ;
    private int puplishedYear ;
    private boolean Borrowed;

    public int count = 0;

    //public String toString(){
       // return
    //}

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public void setTitle(String Title){
        this.Title = Title;
    }
    public void setAuthor(String Author){
        this.Author = Author;
    }
    public void setPuplishedYear(int puplishedYear){
        this.puplishedYear = puplishedYear;
    }
    public void setEdition(int Edition){
        this.Edition = Edition;
    }








    public String getISBN(){
        return ISBN;
    }
}
