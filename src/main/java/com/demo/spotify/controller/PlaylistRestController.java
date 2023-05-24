package com.demo.spotify.controller;

import com.demo.spotify.model.Playlist;
import com.demo.spotify.repository.PlaylistRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlaylistRestController {
    private final PlaylistRepository playlistRepository;

    public PlaylistRestController(PlaylistRepository playlistRepository) {
        this.playlistRepository= playlistRepository;

    }

    @GetMapping("/playlist")
    public List<Playlist> getAllPlaylists(){
        return playlistRepository.findAll();
    }

    @PostMapping("/playlist")
    public void createPlaylist(@RequestBody Playlist playlist){
        playlistRepository.save(playlist);
    }
}
