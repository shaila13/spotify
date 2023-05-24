package com.demo.spotify;

import com.demo.spotify.model.Playlist;
import com.demo.spotify.model.Track;
import com.demo.spotify.model.User;
import com.demo.spotify.repository.PlaylistRepository;
import com.demo.spotify.repository.TrackRepository;
import com.demo.spotify.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpotifyApplication implements CommandLineRunner {


  private final TrackRepository trackRepository;
  private final UserRepository userRepository;
  private final PlaylistRepository playListRepository;

  public SpotifyApplication(TrackRepository trackRepository, UserRepository userRepository, PlaylistRepository playListRepository) {
    this.trackRepository = trackRepository;
    this.userRepository = userRepository;
    this.playListRepository = playListRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpotifyApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {


    Track track1 = new Track("Vuela con el viento", 200L, "Canción moderna");
    Track track2 = new Track("Vuela con Alfredo", 200L, "Canción moderna 2");
    Track track3 = new Track("Vuela", 200L, "Canción moderna 3");

    trackRepository.save(track1);
    trackRepository.save(track2);
    trackRepository.save(track3);

    User user = new User("A", "pruebas");
    userRepository.save(user);

    Playlist playlist = new Playlist("Course","Descripticon",true);
    playlist.setOwner(user);
    playListRepository.save(playlist);

  }
}
