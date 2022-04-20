package OOP.animals;

public class Fish extends Animal {
    private String nameOfFish;
    private int ageOfFish;
    private boolean isSaltWater;

    //super constructor has to be first if you are using one
    public Fish(String name, int age, boolean isSaltWater) {
        super(nameOfFish, ageOfFish);
        this.nameOfFish = name;
        this.ageOfFish = age;
        this.isSaltWater = isSaltWater;
    }

    public String getNameOfFish() {
        return nameOfFish;
    }

    public int getAgeOfFish() {
        return ageOfFish;
    }

    public boolean getIsSaltWater() {
        return isSaltWater;
    }

    public void setNameOfFish(String name) {
        this.nameOfFish = name;
    }

    public void setAgeOfFish(int age) {
        this.ageOfFish = age;
    }

    public void setIsSaltWater(boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }

    public String toString() {
        return "Fish: " + nameOfFish + " " + ageOfFish + " " + isSaltWater;
    }

    @Override
    public String getAnimalInfo() {
        return "Fish: " + nameOfFish + " " + ageOfFish + " " + isSaltWater;
    }

}
