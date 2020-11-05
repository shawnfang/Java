package designDemo.D5_01;

public class AudioPlayer implements MediaPlaer {
    public MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String filename) {
        if (type.equalsIgnoreCase("mp3")) {
            System.out.println("我播放mp3"+filename);
        }else if (type.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type,filename);
        }else if (type.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type,filename);
        }else {
            System.out.println("没有你能播放的格式");
        }
    }
}
