package arrays;

public class AnimalService {
    private Pet[] pets = new Pet[5];
    private int size = 0;

    public boolean addPet(Pet pet) {
        if (size == pets.length) {
            return false;
        } else {
            pets[size] = pet;
            size++;
            return true;
        }
    }

    public Pet[] getAllPets() {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = pets[i];
        }
        return result;
    }
}
