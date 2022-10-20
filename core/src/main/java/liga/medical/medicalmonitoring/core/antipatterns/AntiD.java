package liga.medical.medicalmonitoring.core.antipatterns;

import java.util.ArrayList;
import java.util.List;

public class AntiD {
    public class Dog {

    }

    public class Cat {

    }

    public class Cow {

    }

    public class Animals {
        private List<Dog> dogs;
        private List<Cat> cats;
        private List<Cow> cows;

        public Animals() {
            dogs = new ArrayList<Dog>();
            cats = new ArrayList<Cat>();
            cows = new ArrayList<Cow>();
        }

        public void addDogs(Dog dog) {
            dogs.add(dog);
        }

        public void addCat(Cat cat) {
            cats.add(cat);
        }

        public void addCow(Cow cow) {
            cows.add(cow);
        }
    }
}
