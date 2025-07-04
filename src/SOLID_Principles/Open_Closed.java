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

        Mediaplayer_Service obj1=new Mediaplayer_Service(musicPlayer);
        Mediaplayer_Service obj2=new Mediaplayer_Service(podcastPlayer);
        Mediaplayer_Service obj3=new Mediaplayer_Service(audioBookPlayer);

        obj1.setPlay();
        obj2.setPlay();
        obj3.setPlay();

    }

}
