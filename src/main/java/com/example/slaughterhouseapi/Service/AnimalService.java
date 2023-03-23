package com.example.slaughterhouseapi.Service;
import java.util.List;
import java.util.Optional;
import com.example.slaughterhouseapi.Models.Animal;

public interface AnimalService {
    Animal create(Animal animal);
    List<Animal> findAll();
    Iterable<Animal> findAllItr();
    Optional<Animal> findById(Long regNumber);
    Animal update(Animal animal);
    void deleteById(Long regNumber);
}
