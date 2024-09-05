package CodePractice.Codeday29_Interface.SocialMediaSystem;

public class TextPost implements Post{
    String textContent;
    int likes;
    TextPost(){
        this.likes = 0;
    }
   @Override
   public void publish(){
       System.out.println("post has been published.");
   }
   @Override
    public void like(){
        likes++;
       System.out.println("The post has been liked."+likes);
   }


    public String getTextContent() {
        return textContent;
    }
}
