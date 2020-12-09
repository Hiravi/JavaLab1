public class Main {
    public static void main(String[] args) throws Exception {
        int cheeseType = 0, appleType = 0, eggsType = 0;
        Cheese CompC = new Cheese(); // Создаем экземпляры класса, чтобы найти кол-во продуктов по типам
        Eggs CompB = new Eggs(null);
        Apple CompA = new Apple(null);

        Food[] breakfast = new Food[20];

        int itemsSoFar = 0;

        for (String arg: args) {
            String[] parts = arg.split(",");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            }
            else if (parts[0].equals("Eggs")) {
                breakfast[itemsSoFar] = new Eggs(parts[1]);
                if ("one".equals(parts[1])) {
                    eggsType++;
                }
                else if ("two".equals(parts[1])) {
                    eggsType += 2;
                }
                else if ("three".equals(parts[1])) {
                    eggsType += 3;
                }
            }
            else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            itemsSoFar++;
        }

        System.out.println("Посчитаем количество продуктов разного типа.");
        for (int i=0; i<20; i++) {
            if (breakfast[i] != null) {
                if (breakfast[i].equals(CompC)) {
                    cheeseType++;
                }
               /* else if (breakfast[i].equals(CompB)) {
                    eggsType++;
                }*/
                else if (breakfast[i].equals(CompA)) {
                    appleType++;
                }
            }
            else break;
        }
        System.out.println("Ваш завтрак состоит из "+appleType+" яблок, "+ eggsType+" порций яиц и "+cheeseType+ " сыров.");

        for (Food item: breakfast) {
            if (item != null) {
                item.consume();
            }
            else break;
        }
        System.out.println("Спасибо, что выбрали наше заведение!");
    }
}