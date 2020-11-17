

public class Apple extends Food {
    private String size = null;

    public Apple(String size) {
        super("яблоко");
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void consume() {
        System.out.println(size + " " + this.toString() + " съедено");
    }
}
