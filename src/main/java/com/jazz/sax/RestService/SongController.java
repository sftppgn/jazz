package com.jazz.sax.RestService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SongController {
    private final AtomicLong counter = new AtomicLong();
    public int id;
    public byte content;
    String songUrl;

    @PostMapping("/writesong")
    public Song song(@RequestParam String songUrl) throws IOException, InterruptedException {
        return new Song(songUrl);
    }

//    @GetMapping("/getsong")
//    public Song song(@RequestParam(value="name")String id, (value="content") byte content){
//        return new Song(id, content);
//    }
    }
