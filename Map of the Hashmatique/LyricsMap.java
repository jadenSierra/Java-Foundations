import java.util.*;

public class LyricsMap {

    public String songLyrics(String title){
    HashMap <String, String> trackList = new HashMap<String,String>();

    trackList.put("All Star", "star");


    trackList.put("Livin la vida loca","vida");


    trackList.put("Accidently in love", "strawberry");


    trackList.put("I need a hero", "hero");

    String lyrics = trackList.get(title);
return String.format("%s : %s" ,title,lyrics);
    }
}