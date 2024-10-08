public static void main(String[] args) {
    Cat garfield = new Cat();
    Cow sapii = new Cow();
    Duck donald = new Duck();
    Animal animal = new Animal(false, false);


    System.out.println("Are Cats mammals? " + garfield.isMammal());
    System.out.println("Are Cats carnivores? " + garfield.isCarnivore());

    System.out.println("Are Cow mammals? " + sapii.isMammal());
    System.out.println("Are Cow carnivores? " + sapii.isCarnivore());

    System.out.println("Are Duck mammals? " + donald.isMammal());
    System.out.println("Are Duck carnivores? " + donald.isCarnivore());

    System.out.println("Please Override This Function");
    animal.animalSound();
    garfield.animalSound();
    sapii.animalSound();
    donald.animalSound();
}
}

class Animal {
    boolean isMammal;
    boolean isCarnivore;

    public Animal(boolean isMammal, boolean isCarnivore) {
        this.isMammal = isMammal;
        this.isCarnivore = isCarnivore;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void animalSound() {
    }
}

class Cat extends Animal {
    public Cat() {
        super(true, true);
    }
    @Override
    public void animalSound() {
        System.out.println("Meow...");
    }
}

class Cow extends Animal {
    public Cow() {
        super(true, false);
    }
    @Override
    public void animalSound() {
        System.out.println("Moooo...");
    }
}

class Duck extends Animal {
    public Duck() {
        super(false, false);
    }
    @Override
    public void animalSound() {
        System.out.println("Quack...");
    }
}
