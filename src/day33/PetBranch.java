package day33;

public class PetBranch {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.leg = 4;
        int leg = pet.getLeg();
        System.out.println(leg);
    }
}
