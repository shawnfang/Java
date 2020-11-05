package designDemo.D5_01;

public class MediaAdapter implements MediaPlaer {
    public AdvanceMediaPlayer advanceMediaPlayer;
    public MediaAdapter(String type){
        if (type == "mp4") {
            advanceMediaPlayer = new Mp4Player();
        }else if (type == "vlc") {
            advanceMediaPlayer = new VlcPlayer();
        }

    }
    @Override
    public void play(String type,String filename) {
        if (type.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(filename);
        }else if(type.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVlc(filename);
        }
    }
}
