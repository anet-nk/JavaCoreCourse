package homeWorkLesson1;

public class Team {
    private String name;
    private Sportsman[] sportsmen;

    public Team(String name, Sportsman[] sportsmen) {
        this.name = name;
        this.sportsmen = sportsmen;
    }

    public String getName() {
        return name;
    }

    public Sportsman[] getSportsmen() {
        return sportsmen;
    }

    @Override
    public String toString() {
        String men = "\n";
        for (Sportsman man : sportsmen) {men += man.toString() + "\n";}
        return "Team name=" + name + ", " +
                "\nsportsmen{" +
                men + "}";
    }
}
