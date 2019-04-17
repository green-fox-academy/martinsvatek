package BlogPost;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate){

        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public void print() {
        System.out.println("Autor: " + this.authorName);
        System.out.println("Title: " + this.title);
        System.out.println("Text:: " + this.text);
        System.out.println("Publication date: " + this.publicationDate);
    }
}