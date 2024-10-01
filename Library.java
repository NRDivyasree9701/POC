import java.util.*;
class Books{
    String userid;
    String username;
    HashMap<String,String>user=new HashMap<String,String>();
    Scanner sc=new Scanner(System.in);
    public void adduser(){
        System.out.println("Enter the user ID :");
        userid=sc.next();
        System.out.println("Enter the username :");
        username=sc.next();
        user.put(userid,username);
        System.out.println("User no "+userid+" has been enrolled!");
    }
    public void searchUser(){
        System.out.println("Enter the user ID to search:");
        userid=sc.next();
        if(user.containsKey(userid)){
            System.out.print("User no "+userid+" is present.");
            System.out.println("Welcome User!");
        }
        else{
            System.out.println("User not found.");
            System.exit(0);
        }
    }
}
class Transactions{
    int bookid;
    String title;
    String author;
  
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,String>books=new HashMap<Integer,String>();
    HashMap<String,String>booksAuthor=new HashMap<String,String>();
    public void addBook(){
        System.out.print("Enter the book ID :");
        int id=sc.nextInt();
        System.out.print("Enter the book title :");
        String title=sc.next();
        System.out.print("Enter author of the book :");
        String author=sc.next();
        books.put(id,title);
        booksAuthor.put(title, author);
        System.out.println("The book has been added successfully.");
    }
    public void removeBook(){
        System.out.print("Enter the book ID to remove:");
        int id=sc.nextInt();
        
                if(books.containsKey(id)){
                    books.remove(id);
                    System.out.println("The book has been removed successfully.");
                }
                else{
                    System.out.println("Book not found");
                }
            }
    public void search(){
        System.out.println("Enter the book ID to search:");
        int id=sc.nextInt();
        if(books.containsKey(id)){
            System.out.print("Book no "+id+" is present.");
        }
        else{
            System.out.println("Book is not found.");
            //throw new Exception("Book is not found");
        }
    }
    public void borrow(){
        System.out.println("Enter the book title to be borrowed :");
        String title=sc.next();
        if(books.containsValue(title)){
            System.out.println("Book of the title "+title+" is ready to be borrowed.");
        }
        else{
            System.out.println("Book of the title "+title+" is not ready to be borrowed.");
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Transactions t=new Transactions();
        Books b=new Books();
        Scanner sc=new Scanner(System.in);
        b.adduser();
        b.searchUser();
        
        while(true){
        System.out.println("choose an option:");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Search");
        System.out.println("4. Borrow");
        System.out.println("5. Exit");
        int opt=sc.nextInt();
            switch(opt){
                case 1:t.addBook();
                break;
                case 2:t.removeBook();
                break;
                case 3:t.search();
                break;
                case 4:t.borrow();
                break;
                case 5:
                return;
        }
    }
}
}
