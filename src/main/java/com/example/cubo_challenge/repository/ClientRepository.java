package com.example.cubo_challenge.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cubo_challenge.entity.Client;

public interface ClientRepository extends JpaRepository <Client, Long> {

}
