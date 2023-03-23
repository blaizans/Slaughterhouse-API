package com.example.slaughterhouseapi.Repository;
import com.example.slaughterhouseapi.Models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepositoryI extends JpaRepository<Animal, Long>{

}
