package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class DogHospital {

    private Dog animal;

    public void set(Dog aniaml){
        this.animal = aniaml;
    }

    public void checkup(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Dog bigger(Dog target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

    public Animal bigger(Cat target){
        return animal.getSize() > target.getSize() ? animal : target;
    }


}
