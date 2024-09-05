package CodePractice.Codeday27_Interface.MediaPlayer;

 interface MediaPlayer {
    void play();
    void stop();
}
interface AdvancedmediaPlayer extends MediaPlayer{
    void pause();

}
 class MusicPlayer implements AdvancedmediaPlayer{
    public void play(){
        System.out.println("A");
    }
    public void pause(){
        System.out.println("B");
    }
     public void stop(){
         System.out.println("C");
     }
}
class VideoPlayer implements AdvancedmediaPlayer{
     private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    VideoPlayer(String title){
        this.title = title;
    }

    public void play(){
        if(this.title != null){
            System.out.println("Playing music    "+title);
        }else{
            System.out.println("Title is not be empty string.");
        }

    }
    public void pause(){
        if(this.title != null){
        System.out.println("Pausing music    "+title);
        }else{
            System.out.println("Title is not be empty string.");
        }
    }
    public void stop(){
        if(this.title != null){
        System.out.println("Stopping music    "+title);
        }else{
            System.out.println("Title is not be empty string.");
        }
    }
}
public class MainTest{
    public static void main(String[] args){
        VideoPlayer v1 = new VideoPlayer("Life");
        v1.pause();
        v1.play();
        v1.stop();
    }
}
