package pl.sdacademy.javapoz19programowanie1.pet;

import java.util.*;
import java.util.stream.Collectors;

public class InMemoryPetRepository implements PetRepository{

    private List<Pet> pets;

     InMemoryPetRepository(List<Pet> pets) {
        this.pets = pets;
    }

    public InMemoryPetRepository(){
        this.init();
    }

    public void init(){
       this.pets = Arrays.asList(
       new Pet("Frieda",3,"Scottish Terrier","Lisco, Alabama"),
       new Pet("Gina",3,"Scottish Terrier","Camas, Pennsylvania"),
       new Pet("Collins",4,"Scottish Terrier","Lisco, Alabama"),
       new Pet("Melissa",2,"French Bulldog","Camas, Pennsylvania"),
       new Pet("Jeanine",5,"Boxer","Lisco, Alabama"),
       new Pet("Elvia",3,"French Bulldog","Innsbrook, Illinois"),
       new Pet("Latisha",6,"French Bulldog","Camas, Pennsylvania"),
       new Pet("Coleman",3,"Golden Retriever","Jacksonwald, Palau"),
       new Pet("Nichole",2,"Golden Retriever","Lisco, Alabama"),
       new Pet("Fran",7,"French Bulldog","Camas, Pennsylvania"),
       new Pet("Leonor",2,"Boxer","Tyhee, Indiana"),
       new Pet("Dean",3,"Boxer","Lisco, Alabama"),
       new Pet("Stevenson",3,"Scottish Terrier","Camas, Pennsylvania"),
       new Pet("Kristina",4,"French Bulldog","Tyhee, Indiana"),
       new Pet("Ethel",9,"Golden Retriever","Lisco, Alabama")
        );



    }

    @Override
    public List<Pet> findAll() {
        return new ArrayList<>(pets);
    }

    @Override
    public List<Pet> findByBreed(String breed) {
        return pets.stream()
            .filter(pet -> pet.getBreed().equals(breed))
                .collect(Collectors.toList());

    }

    @Override
    public List<Pet> findByLocation(String location) {
        return pets.stream()
                .filter(pet ->pet.getLocation().equals(location))
                .collect(Collectors.toList());

    }

    @Override
    public List<Pet> sortByAge() {
        return pets.stream()
                .sorted(Comparator.comparingLong(pet -> pet.getAge()))
                .collect(Collectors.toList());
     }

    @Override
    public Map<String, List<Pet>> groupByBreed() {
        return pets.stream()
                .collect(Collectors.groupingBy(pet -> pet.getBreed()));
    }


}
