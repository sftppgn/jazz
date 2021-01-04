package Database;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//todo: method to check/write to db from this (just add/redirect?)

public class CreateSongId {
    private String songId;
    private String[] notes;
    private String note;
    private String fret;
    private String songLine;
    private String configFile;
    private String stringNumber;

    private static final String regexSongId = "songId";
    //private static final String regexSongDelim = "\\{";
    private static final String regexSongDelim = "type";
    private static final String regexValDelim = ":|,";

    Pattern songIdPattern = Pattern.compile(".*songId\":\"[0-9]+\".*");
    Pattern notePattern = Pattern.compile(".*string\":[0-9].*");

    public String writeSongId(String songLine) {
        //System.out.print(songLine);
        //System.out.print(songLine.split(regexSongDelim));
        String[] item = songLine.split(regexSongDelim);
        //System.out.print(items);
        //System.out.println(items);

        for (String s : item){
            //System.out.print("*** item "+ s + "\n");
            Matcher songIdMatcher = songIdPattern.matcher(s);
            //System.out.print("matcher "+ s +" song id "+ songIdMatcher.matches()+"\n");
            if (songIdMatcher.matches()){
                //System.out.println("***song id " + s);
                this.songId = (s.split(regexValDelim)[6]);
                //this.songId = (s);
                //*System.out.println("***song id " + this.songId);
                return(songId);
            }
            Matcher noteMatcher = notePattern.matcher(s);
            String[] test123;
            //System.out.println(s.split(regexValDelim).length);
            if (noteMatcher.matches()){
                System.out.println("s "+s);
                for (Integer i=0; s.split(regexValDelim).length < i; i++){
                }
                //System.out.println(s);
                //this.note = (s.split(regexValDelim)[8]);
//                    this.note = (s.split(regexValDelim)[4]);
                //System.out.println("note "+ this.note);
//                    System.out.println("fret "+ this.fret);

            }
        }
        return(regexSongId);
    }
}
