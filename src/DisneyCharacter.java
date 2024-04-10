public class DisneyCharacter {

    private int energy;
    private int happiness;
    private boolean isVillain;

    public DisneyCharacter(int energy, int happiness, boolean isVillain) {
        this.energy = energy;
        this.happiness = happiness;
        this.isVillain = isVillain;
    }

    private int getEnergy() {
        return energy;
    }

    private int getHappiness() {
        return happiness;
    }

    private boolean isVillain() {
        return isVillain;
    }

    private void setEnergy(int energy) {
        this.energy = energy;
    }

    private void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    private void setVillain(boolean isVillain) {
        this.isVillain = isVillain;
    }

    public void printCharacterInfo() {
        System.out.println("Energy: " + this.energy);
        System.out.println("Happiness: " + this.happiness);
        System.out.println("Is a villain: " + this.isVillain);
    }

    public void interact(DisneyCharacter other) {
        int happinessBoost = this.energy * 2;
        other.setHappiness(other.getHappiness() + happinessBoost);
    }

    public static void main(String[] args) {
            DisneyCharacter mickeyMouse = new DisneyCharacter(10, 100, true);
            mickeyMouse.printCharacterInfo();
    }
}
