package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookArr = new ArrayList<Book>();
        System.out.println("Welcome to my program please start using the given COMANDS : ");
        Scanner input = new Scanner(System.in);
        Book book = new Book();
        String output ="";
        int index;
        int num ;
        int pls = 0;
        for(;;){
            System.out.print("> ");
            String commands = input.nextLine();
            String tokens [] = commands.split(" ");
            tokens[0] = tokens[0].toLowerCase();


            switch (tokens[0]){

                case "add" :
                    if(tokens.length != 2){
                        System.out.println("Invalid inputs");
                    }
                    else {
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
                    if(tokens.length >= 3){
                        for(int i = 3 ; i < tokens.length ;i++){
                            output +=tokens[i] + " " ;
                        }


                        tokens[2] = tokens[2].toLowerCase();
                        switch (tokens[2]){
                            case "title" :
                                book.setTitle(tokens[3]);
                                break;
                            case "author" :
                                book.setAuthor(tokens[3]);
                                break;
                            case "publish" :
                                num = Integer.parseInt(tokens[3]);
                                book.setPuplishedYear(num);
                                break;

                            case "edition" :

                                break;
                        }//case tokens[1]
                    }//if
                    else {
                        System.out.println("Invalid inputs");
                    }
                    break;
                case "get" :
                    for(Book b : bookArr){
                        if(b.getISBN().equals(tokens[1])){
                            System.out.println("found");
                            pls++;
                            break;
                        }
                        else
                            System.out.println("We could not find your book");
                    }
                    System.out.println(pls);
                    break;
                default :
                    System.out.println("Wrong commands please try again");
            }//swtich endscope

        }//infite loop endscope

    }// main endscope
}// class endscope
