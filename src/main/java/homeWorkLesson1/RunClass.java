package homeWorkLesson1;

public class RunClass {
    public static void main(String[] args) {
        Sportsman[] sportsmen = new Sportsman[] {
                new Sportsman("Дима", 500, 700, 2),
                new Sportsman("Оля", 300, 900, 1),
                new Sportsman("Олег", 500, 800, 2),
                new Sportsman("Борис", 400, 900, 3)};
        Team team1 = new Team("Победа", sportsmen);
        Course course1 = new Course(400, 800, 2);

        System.out.println(team1);
        System.out.println(course1.goCourse(team1));
        System.out.println(course1.showSportsmenPassedDistance(team1));
    }
}
