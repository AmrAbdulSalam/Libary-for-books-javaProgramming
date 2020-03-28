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

    public Book(){
        Borrowed = false;
        puplishedYear = 0000;
        Edition = 1;
        Title = "";
        Author = "";
    }

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
    public void setBorrowed(boolean Borrowed){
        this.Borrowed = Borrowed;
    }


    public String getISBN(){
        return ISBN;
    }
    public String getTitle(){
        return Title;
    }
    public String getAuthor(){
        return Author;
    }
    public int getEdition(){
        return Edition;
    }
    public int getPuplishedYear(){
        return puplishedYear;
    }

    public boolean getBorrowed(){
        return Borrowed;
    }
}
