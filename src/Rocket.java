public class Rocket implements SpaceShip {

    private int cost;
    private double currentWeight;
    private double weight;
    private double totalWeight;
    private double maxCargo;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public final boolean canCarry(Item item) {
        if (maxCargo >= (currentWeight + item.getWeight()))
            return true;
        else {
            System.out.println("Cannot carry item " + item.getName() + ", weight: " + item.getWeight());
            return false;
        }
    }

    @Override
    public final void carry(Item item) {
        System.out.println("Carrying item " + item.getName() + ", weight: " + item.getWeight());
        currentWeight += item.getWeight();
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setMaxCargo(double maxCargo) {
        this.maxCargo = maxCargo;
    }

    public double getMaxCargo() {
        return maxCargo;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setTotalWeight() {
        this.totalWeight = getCurrentWeight() + getWeight();
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
