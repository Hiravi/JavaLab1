public abstract class Food  implements Consumable {
    private String name  = null;


    public Food(String name) {
        this.name = name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
