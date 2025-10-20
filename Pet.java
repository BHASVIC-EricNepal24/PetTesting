public class Pet {
    private String petName;
    private int hunger = 100;
    private int boredom = 100;
    private int sleepiness = 100;
    private int happiness = 100;
    private int hygiene = 100;

    public Pet(String name) {
        this.petName = name;
    }

    public String getPetName() {
        return this.petName;
    }

    public int getHunger() {
        return this.hunger;
    }

    public int getBoredom() {
        return this.boredom;
    }

    public int getSleepiness() {
        return this.sleepiness;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public int getHygiene() {
        return this.hygiene;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public void setSleepiness(int sleepiness) {
        this.sleepiness = sleepiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void setHygiene(int hygiene) {
        this.hygiene = hygiene;
    }

    public void decrementAttributes() {
        if (getHunger() != 0) {
            setHunger(getHunger() - 1);
        }

        if (getBoredom() != 0) {
            setBoredom(getBoredom() - 1);
        }

        if (getSleepiness() != 0) {
            setSleepiness(getSleepiness() - 1);
        }

        if (getHappiness() != 0) {
            setHappiness(getHappiness() - 1);
        }

        if (getHygiene() != 0) {
            setHygiene(getHygiene() - 1);
        }
    }

}
