
public class Eggs extends Food {

    String number;

    public Eggs(String number) {
        super("Яйцо");
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {

            return true;
        }

        return super.equals(obj);
    }

    @Override
    public void consume() {
        System.out.println(number + " " + this.toString() + " съедено");
    }

}

