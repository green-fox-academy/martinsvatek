package BlogPost;

public class BlogPost {

    private String authorName;
    private String title;
    private String text;
    private String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate){

        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public void print() {
        System.out.println("Author: " + authorName);
        System.out.println("Title: " + title);
        System.out.println("Text:: " + text);
        System.out.println("Publication date: " + publicationDate);
    }
}