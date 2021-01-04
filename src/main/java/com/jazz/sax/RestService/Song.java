package com.jazz.sax.RestService;

import Database.CreateSongId;
import com.jazz.sax.Web.ReadWebPage;

import java.io.IOException;

public class Song {
    private String songUrl;
    private int id;
    private byte content;
    private Boolean songExists = false;
    private String urlContent;
    private String songId;

    public Song(String songUrl) throws IOException, InterruptedException {
       this.songUrl=songUrl;

        //create song
       if (songExists == false){
           ReadWebPage webReader = new ReadWebPage();
           urlContent = webReader.getUrl(songUrl);
           CreateSongId songIdClass = new CreateSongId();
           songId = songIdClass.writeSongId(urlContent);
           System.out.println(songId);
       }
       else{
           System.out.println("song exists in db " + songUrl);
       }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getContent() {
        return content;
    }

    public void setContent(byte content) {
        this.content = content;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl= songUrl;
    }
}
