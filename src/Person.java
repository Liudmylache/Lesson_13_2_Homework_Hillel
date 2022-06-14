public final class Person {
    String name;
    String surname;
    String age;
    String height;
    String weight;

    public Person(String name, String surname, String age, String height, String weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Name:" + name + ", surname:" + surname + ", age:" + age + "(years), height:"
                + height + "(sm), weight:" + weight + "(kg)";
    }


    public static Person[] createAPerson(){
        Person[] persons = new Person[100];
        for (int i = 0; i < 100; i++) {
            String name = (Utils.generateName(Utils.NAMES));
            String surname = Utils.generateSurname(Utils.SURNAMES);
            String age = Utils.convertAgeToString(Utils.generateAge());
            String height = Utils.convertHeightToString(Utils.getHeight(Utils.generateAge()));
            String weight = Utils.convertWeightToString(Utils.getWeight(Utils.generateAge(),Utils.getHeight(Utils.generateAge())));
            persons[i] = new Person(name, surname,age, height, weight);
        } return persons;
    }


    public static void printPersons(Person[] persons) {
        for (int i = 0; i<100; i++){
            System.out.println((i+1) + ") " + persons[i].toString());
        }
    }
}

