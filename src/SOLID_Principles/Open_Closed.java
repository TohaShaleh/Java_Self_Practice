package SOLID_Principles;


interface MediaPlayer{
    void play();
}

class Music_Player implements MediaPlayer{
    @Override
    public void play()
    {
        System.out.println("Playing music in music player!\n");
    }
}

class Podcast_Player implements MediaPlayer{
    @Override
    public void play()
    {
        System.out.println("Playing podcast on media player!\n");
    }
}

class AudioBook_Player implements MediaPlayer{
    @Override
    public void play()
    {
        System.out.println("Playing audio songs!\n");
    }
}

class videoPlayer implements MediaPlayer{
    @Override
    public void play(){
        System.out.println("Playing video through the Media player!\n");
    }
}



class Mediaplayer_Service{

    private MediaPlayer mediaPlayer;

    public Mediaplayer_Service(MediaPlayer mediaPlayer)
    {
        this.mediaPlayer=mediaPlayer;
    }

    public void setPlay(){
        mediaPlayer.play();
    }
}


public class Open_Closed {
    public static void main(String[] args) {

        MediaPlayer musicPlayer=new Music_Player();
        MediaPlayer podcastPlayer=new Podcast_Player();
        MediaPlayer audioBookPlayer=new AudioBook_Player();
        MediaPlayer videoPlayer=new videoPlayer();

        Mediaplayer_Service obj1=new Mediaplayer_Service(musicPlayer);
        Mediaplayer_Service obj2=new Mediaplayer_Service(podcastPlayer);
        Mediaplayer_Service obj3=new Mediaplayer_Service(audioBookPlayer);
        Mediaplayer_Service obj4=new Mediaplayer_Service(videoPlayer);

        obj1.setPlay();
        obj2.setPlay();
        obj3.setPlay();
        obj4.setPlay();

    }

}
