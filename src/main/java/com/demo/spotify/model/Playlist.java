package com.demo.spotify.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

import java.util.ArrayList;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Playlist {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  private String description;

  private Boolean isPublic;

  @ManyToOne
  private User owner;

  @ManyToMany
  @OrderColumn
  private List<Track> tracks;

  public Playlist(String name, String description, Boolean isPublic) {
    this.name = name;
    this.description = description;
    this.isPublic = isPublic;
  }

  public Playlist(String name, String description, Boolean isPublic, User owner, List<Track> tracks) {
    this.name = name;
    this.description = description;
    this.isPublic = isPublic;
    this.owner = owner;
    this.tracks = tracks;
  }
}
