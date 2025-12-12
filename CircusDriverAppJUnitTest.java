import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CircusDriverAppJUnitTest {
    private Circus circus;

    @BeforeEach
    void setUp() {
        circus = new Circus();
    }

    @Test
    void testAddDog() {
        Dog dog = new Dog("Shila", 3, "Golden Retriever", "Brown");
        circus.addAnimal(dog);
        List<Animal> animals = circus.getAnimals();
        assertEquals(1, animals.size());
        assertTrue(animals.get(0) instanceof Dog);
        assertEquals("Shila", animals.get(0).getName());
    }

    @Test
    public void testAddBird() {
        Circus circus = new Circus();
        Bird bird = new Bird("Tweety", 2, "Canary", "Yellow");
        circus.addAnimal(bird);
        assertEquals(bird, circus.getAnimals().get(0));
    }

    @Test
    public void testDisplayAnimals() {
        Circus circus = new Circus();
        Bird bird = new Bird("Tweety", 2, "Canary", "Yellow");
        circus.addAnimal(bird);
        assertEquals("Tweety", circus.getAnimals().get(0).getName());
    }

    @Test
    public void testSortAnimalsByAge() {
        Circus circus = new Circus();
        Bird b1 = new Bird("Tweety", 2, "Canary", "Yellow");
        Bird b2 = new Bird("Polly", 5, "Parrot", "Green");
        circus.addAnimal(b2);
        circus.addAnimal(b1);
        circus.sortAnimalsByAge();
        assertEquals("Tweety", circus.getAnimals().get(0).getName());
    }

    @Test
    public void testSortAnimalsByName() {
        Circus circus = new Circus();
        Bird b1 = new Bird("Tweety", 2, "Canary", "Yellow");
        Bird b2 = new Bird("Polly", 5, "Parrot", "Green");
        circus.addAnimal(b1);
        circus.addAnimal(b2);
        circus.sortAnimalsByName();
        assertEquals("Polly", circus.getAnimals().get(0).getName());
    }

    @Test
    public void testSearchAnimalByName() {
        Circus circus = new Circus();
        Bird bird = new Bird("Tweety", 2, "Canary", "Yellow");
        circus.addAnimal(bird);
        assertEquals("Tweety", circus.getAnimals().get(0).getName());
    }

    @Test
    public void testAddAndDisplayTickets() {
        Ticket ticket = new Ticket("Monday", 20.0, 10); 
        assertEquals(16.0, ticket.calculatePrice(), 0.01);
    }

}



