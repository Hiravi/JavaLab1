
public class Eggs extends Food {

    int number;

    public Eggs(int number) {
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

