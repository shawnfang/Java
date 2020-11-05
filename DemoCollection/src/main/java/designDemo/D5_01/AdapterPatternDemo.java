package designDemo.D5_01;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","龙卷风");
        audioPlayer.play("mp4","钢铁侠");
        audioPlayer.play("vlc","不知道这是什么格式");
    }
}
