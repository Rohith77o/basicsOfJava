interface MediaPlayer{
    void play();
    void pause();
    void stop();
    default void adjustPlaybackspeed(double speed){
        System.out.println("Playback speed is disable for this media");
    }
    default void enableSubtitles(boolean enable){
        System.out.println("Subtitles are disabled for this media ");
    }
}

class AudioPlayer implements MediaPlayer{
    private String currentTrack;
    AudioPlayer(String track){
        this.currentTrack= track;
    }
    public void play(){
        System.out.println("Playing audio : "+currentTrack);
    }
    public void pause(){
        System.out.println("Audio track "+currentTrack+" paused");
    }
    public void stop(){
        System.out.println("Audio track "+ currentTrack+" stoped");
    }
    void changeTrack(String newTrack){
        currentTrack= newTrack;
        System.out.println("Audio track changed to : "+currentTrack);
    }
}
class VideoPlayer implements MediaPlayer{
    private String currentVideo;
    VideoPlayer(String Video){
        this.currentVideo=Video;
    }
    public void play(){
        System.out.println("Playing Video : "+currentVideo);
    }
    public void pause(){
        System.out.println("Video track : "+currentVideo+" Paused");
    }
    public void stop(){
        System.out.println("Video track : "+currentVideo+" Stopped");
    }
    public void adjustPlaybackspeed(double speed){
        System.out.println("Adjusting playback speed "+speed+"x for video "+currentVideo);
    }
    public void enableSubtitles(boolean enable){
        if(enable){
            System.out.println("Adjusting playback speed "+currentVideo);
        }
        else{
            System.out.println("Playback speed disabled for this media "+currentVideo);
        }
    }
    void changeVideo(String newvideo){
        currentVideo=newvideo;
        System.out.println("video changed to : "+currentVideo);
    }
}
class StreamingPlayer implements MediaPlayer{
    private String StreamURL;
    StreamingPlayer(String url){
        this.StreamURL=url;
    }
    public void play(){
        System.out.println("Streaming content from : "+StreamURL);
    }
    public void pause(){
        System.out.println("Streaming from "+StreamURL+" is paused");
    }
    public void stop(){
        System.out.println("Streaming from "+StreamURL+" is stopped");
    }
    public void adjustPlaybackspeed(double speed ){
        System.out.println("Adjusting playback speed to : "+speed+"x for stream "+StreamURL);
    }
    public void enableSubtitles(boolean enable){
        if(enable){
            System.out.println("Subtitles enable for : "+StreamURL);
            
        }
        else{
            System.out.println("Subtitles disabled for : "+StreamURL);
        }
    }
    void changeStream(String newUrl){
        StreamURL=newUrl;
        System.out.println("The stream changed to :"+StreamURL);
    }
}
public class Interface{
    public static void main(String[]args){
        AudioPlayer audioplayer = new AudioPlayer("song.mp3");
        VideoPlayer videoplayer = new VideoPlayer("johnWick.mp4");
        StreamingPlayer streamingPlayer = new StreamingPlayer("https://johnWick.com/stream");
        
        audioplayer.play();
        audioplayer.changeTrack("new_song:mp3");
        audioplayer.pause();
        audioplayer.stop();
        System.out.println();
        
        videoplayer.play();
        videoplayer.changeVideo("VJ Siddhu Vlogs");
        videoplayer.adjustPlaybackspeed(1.5);
        videoplayer.enableSubtitles(false);
        videoplayer.pause();
        videoplayer.stop();
        System.out.println();
        
        streamingPlayer.play();
        streamingPlayer.adjustPlaybackspeed(2.0);
        streamingPlayer.enableSubtitles(true);
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}
