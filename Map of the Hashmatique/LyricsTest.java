import java.util.*;

public class LyricsTest {
    
    public static void main(String[] args){

        LyricsMap lyrics = new LyricsMap();

        String songLyrics = lyrics.songLyrics("Livin la vida loca");

        System.out.println(songLyrics);

    }
}