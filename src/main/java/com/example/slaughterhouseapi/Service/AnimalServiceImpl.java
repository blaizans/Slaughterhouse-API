package com.example.slaughterhouseapi.Service;

import com.example.slaughterhouseapi.Models.Animal;
import com.example.slaughterhouseapi.Repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService{

    private final AnimalRepository animalRepository;

    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public Optional<Animal> findAnimalById(Long id) {
        return animalRepository.findById(id);
    }

    @Override
    public List<Animal> findAnimalsByOrigin(String origin) {
        return animalRepository.findByOrigin(origin);
    }

    @Override
    public List<Animal> findAnimalsByDate(LocalDate date) {
        return animalRepository.findByDate(date);
    }


    @Override
    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Animal updateAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public void deleteAnimalById(Long id) {
        animalRepository.deleteById(id);
    }

    @Override
    public List<Animal> getAll() {
        return animalRepository.findAll();
    }

}
