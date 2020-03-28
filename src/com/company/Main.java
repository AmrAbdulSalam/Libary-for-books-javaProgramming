package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookArr = new ArrayList<Book>();
        System.out.println("Welcome to my program please start using the given COMANDS : ");
        Scanner input = new Scanner(System.in);
        Book book ;
        String output ="";
        int index = -1; // means not found
        int num ; // should not be initilaze
        int pls ;
        int in , ne = 0;
        for(;;){
            System.out.print("> ");
            String commands = input.nextLine();
            String tokens [] = commands.split(" ");
            tokens[0] = tokens[0].toLowerCase();
            output="";
            pls = -1;
            ne = 0;
            switch (tokens[0]){
                case "add" :
                    if(tokens.length != 2){
                        System.out.println("Invalid inputs");
                    }
                    else {
                        book = new Book();
                        book.setISBN(tokens[1]);
                        bookArr.add(book);
                        book.count++;
                        System.out.println("Thank you for adding a new book :)");
                    }
                    break;

                case "quit" :
                    System.out.println("Thank you for using our program ");
                    System.exit(0);
                    break;

                case "print" :
                    if(tokens.length == 1) {
                        output = "\t\tISBN\t\t\t\t" + "Title\t\t\t\t\t  " + "Edition\t\t\t\t" + "Author\t\t\t" + "Year\t\t\t" + "Available";
                        System.out.println(output);


                    }//end of if lenght
                    else{
                        System.out.println("Invalid inputs");
                    }
                    //book.toString();

                    break;

                case "set" :
                    //pls = -1;
                    if(tokens.length > 3){
                        for(int i = 3 ; i < tokens.length ;i++){
                            output +=tokens[i] + " " ;
                        }
                        tokens[2] = tokens[2].toLowerCase(); // to ignore any capital litters
                        for(Book b : bookArr){
                            pls ++;
                            if(b.getISBN().equals(tokens[1])){
                                ne ++;
                                switch (tokens[2]){
                                    case "title" :
                                        bookArr.get(pls).setTitle(output);
                                        break;
                                    case "author" :
                                        bookArr.get(pls).setAuthor(output);
                                        break;
                                    case "publish" :
                                        num = Integer.parseInt(tokens[3]);
                                        bookArr.get(pls).setPuplishedYear(num);
                                        break;
                                    case "edition" :
                                        num = Integer.parseInt(tokens[3]);
                                        bookArr.get(pls).setEdition(num);
                                        break;
                                }

                            }
                            if(ne == 0)
                                System.out.println("No book found");
                        }
                    }//if
                    else
                        System.out.println("Invalid inputs");
                    break;

                    // get case
                case "get" :
                   // pls = -1;
                    if(tokens.length == 3){
                    for(Book b : bookArr){
                        pls ++;
                        if(b.getISBN().equals(tokens[1])){
                            //System.out.println("The book is found ");
                            ne ++;
                            switch (tokens[2]){
                                case "title" :
                                    //System.out.println("in here");
                                    System.out.println(bookArr.get(pls).getTitle());
                                    break;
                                case "author" :
                                    System.out.println(bookArr.get(pls).getAuthor());
                                    break;
                                case "edition" :
                                    System.out.println(bookArr.get(pls).getEdition());
                                    break;
                                case "publish" :
                                    System.out.println(bookArr.get(pls).getPuplishedYear());
                                    break;
                                case "rent" :
                                    System.out.println(bookArr.get(pls).getBorrowed());
                                    break;
                            }
                        }
                        if(ne == 0)
                            System.out.println("No book found");
                    }
                    }
                    else
                        System.out.println("Invalid inputs");

                    break;

                case "rent" :
                    if(tokens.length == 2) {
                        for (Book b : bookArr) {
                            pls++;
                            if (b.getISBN().equals(tokens[1]) && !b.getBorrowed()) {
                                    System.out.println("Book found and you rent it");
                                    ne++;
                                    bookArr.get(pls).setBorrowed(true);
                                    //System.out.println(bookArr.get(pls).getBorrowed());
                            }
                            if (ne == 0)
                                System.out.println("No book found");
                        }
                    }
                    else
                        System.out.println("invalid inputs");
                    break;

                case "return" :
                    if(tokens.length == 2){
                        for(Book b : bookArr){
                            pls ++;
                            if (b.getISBN().equals(tokens[1])){
                                ne ++;
                                if(b.getBorrowed() == true){
                                    System.out.println("Thank you for returning the book");
                                    bookArr.get(pls).setBorrowed(false);
                                }
                                else
                                    System.out.println("The book is already returned");
                            }
                        }

                        if(ne == 0)
                            System.out.println("No book found");
                    }
                    else
                        System.out.println("Invalid inputs");
                    break;
                default :
                    System.out.println("Wrong commands please try again");
            }//swtich endscope

        }//infite loop endscope

    }// main endscope
}// class endscope
