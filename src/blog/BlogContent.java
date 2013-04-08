package blog;

public class BlogContent {

	public String title;
	public String content;
	public Category category;
	public Writer writer;
	
	public void Print() {
		
		System.out.println("Title: " + title + " Content: " + content + " Catergory: " + category.name + " Writer: " + writer.Fullname());

	}

}
