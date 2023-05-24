package com.demo.spotify.controller;

import com.demo.spotify.model.Track;
import com.demo.spotify.repository.TrackRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrackRestController {

  private final TrackRepository trackRepository;

  public TrackRestController(TrackRepository trackRepository) {
    this.trackRepository = trackRepository;
  }

  @GetMapping("/tracks")
  public List<Track> getAllTracks(){
    return trackRepository.findAll();
  }

  @PostMapping("/tracks")
  public void createTrack(@RequestBody Track track){
    trackRepository.save(track);

  }
}
