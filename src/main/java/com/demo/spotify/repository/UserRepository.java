package com.demo.spotify.repository;

import com.demo.spotify.model.Track;
import com.demo.spotify.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
