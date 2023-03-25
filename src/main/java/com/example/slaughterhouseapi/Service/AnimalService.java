package com.example.slaughterhouseapi.Service;
import com.example.slaughterhouseapi.Models.Animal;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AnimalService {
    Optional<Animal> findAnimalById(Long id);
    List<Animal> findAnimalsByOrigin(String origin);
    List<Animal> findAnimalsByDate(LocalDate date);
    Animal saveAnimal(Animal animal);
    Animal updateAnimal(Animal animal);
    void deleteAnimalById(Long id);
    List<Animal> getAll();
}
