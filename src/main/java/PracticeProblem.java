/**
 * Abstract class Animal
 * Provides the base structure for all animal types.
 */
abstract class Animal {
    private String name;
    private int age;
    private String type;
    private int position;

    /**
     * Instantiates a new Animal.
     *
     * @param name     the name
     * @param age      the age
     * @param type     the type
     * @param position the position
     */
// The test specifically checks for this constructor signature
    public Animal(String name, int age, String type, int position) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.position = position;
    }

    /**
     * Animal sound string.
     *
     * @return the string
     */
// Abstract methods - must be implemented by subclasses
    public abstract String animalSound();

    /**
     * Move.
     */
    public abstract void move();

    /**
     * Sleep string.
     *
     * @return the string
     */
// Concrete method common to all animals
    public String sleep() {
        return "Zzz";
    }

    /**
     * Gets name.
     *
     * @return the name
     */
// Getters for all instance variables
    public String getName() { return name; }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() { return age; }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() { return type; }

    /**
     * Gets position.
     *
     * @return the position
     */
    public int getPosition() { return position; }

    /**
     * Update position.
     *
     * @param increment the increment
     */
// Helper method to allow subclasses to update private position
    protected void updatePosition(int increment) {
        this.position += increment;
    }
}

/**
 * Cat implementation
 */
class Cat extends Animal {
    /**
     * Instantiates a new Cat.
     *
     * @param name     the name
     * @param age      the age
     * @param type     the type
     * @param position the position
     */
    public Cat(String name, int age, String type, int position) {
        super(name, age, type, position);
    }

    @Override
    public String animalSound() {
        return "Meow";
    }

    @Override
    public void move() {
        updatePosition(5);
    }
}

/**
 * Bird implementation
 */
class Bird extends Animal {
    /**
     * Instantiates a new Bird.
     *
     * @param name     the name
     * @param age      the age
     * @param type     the type
     * @param position the position
     */
    public Bird(String name, int age, String type, int position) {
        super(name, age, type, position);
    }

    @Override
    public String animalSound() {
        return "Chirp";
    }

    @Override
    public void move() {
        updatePosition(50);
    }
}

/**
 * Bear implementation
 */
class Bear extends Animal {
    /**
     * Instantiates a new Bear.
     *
     * @param name     the name
     * @param age      the age
     * @param type     the type
     * @param position the position
     */
    public Bear(String name, int age, String type, int position) {
        super(name, age, type, position);
    }

    @Override
    public String animalSound() {
        return "Roar";
    }

    @Override
    public void move() {
        updatePosition(1);
    }
}
