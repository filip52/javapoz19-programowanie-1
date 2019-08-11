package pl.sdacademy.javapoz19programowanie1.pet;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PetServiceTest {
    @Test
    public void findAllShouldReturnListOfPets() {
        List<Pet> testPets = Arrays.asList(
                new Pet("pet-1", 2, "a", "xyz"),
                new Pet("pet-2", 5, "b", "abc")
        );
        PetService petService = new PetService(new InMemoryPetRepository(testPets));
        List<Pet> actualList = petService.findAll();
        Assert.assertEquals(testPets, actualList);

    }

    @Test
    public void findByBreedShouldReturnListOfPetsOfBreed() {
        List<Pet> testPets = Arrays.asList(
                new Pet("pet-1", 2, "a", "xyz"),
                new Pet("pet-2", 5, "b", "abc")
        );
        PetService petService = new PetService(new InMemoryPetRepository(testPets));
        List<Pet> result = petService.findByBreed("a");
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(new Pet("pet-1", 2, "a", "xyz"), result.get(0));
    }

    @Test
    public void findByLocationShouldReturnListOfPetsOfLocation() {
        List<Pet> testPets = Arrays.asList(
                new Pet("pet-1", 2, "a", "xyz"),
                new Pet("pet-2", 5, "b", "abc")
        );
        PetService petService = new PetService(new InMemoryPetRepository(testPets));
        List<Pet> result = petService.findByLocation("xyz");
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(new Pet("pet-1", 2, "a", "xyz"), result.get(0));
    }
    @Test
    public void sortByAgeShouldReturnSortedList(){
        List<Pet> testPets = Arrays.asList(
                new Pet("pet-1", 2, "a", "xyz"),
                new Pet("pet-2", 5, "b", "abc")
        );
        PetService petService = new PetService(new InMemoryPetRepository(testPets));
        List<Pet> pets = petService.sortByAge();
        Assert.assertEquals(pets.get(0),testPets.get(1));
        Assert.assertEquals(pets.get(1),testPets.get(2));
        Assert.assertEquals(pets.get(2),testPets.get(0));


    }
    @Test
    public void groupByBreedShouldReturnMapWithGroupedPets(){
        PetService petService  = new PetService(new InMemoryPetRepository());

        Map<String, List<Pet>> map = petService.groupByBreed();

        Assert.assertEquals(4,map.get("Scottish Terrier").size());
        Assert.assertEquals(5,map.get("French Bulldog").size());
        Assert.assertEquals(3,map.get("Boxer").size());
        Assert.assertEquals(3,map.get("Golden Retriever").size());
    }
}
