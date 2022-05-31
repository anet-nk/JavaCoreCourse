package homeWorkLesson1;

public class Course {
    private int swimDistance;
    private int runDistance;
    private int jumpHeight;

    public Course(int swimDistance, int runDistance, int jumpHeight) {
        this.swimDistance = swimDistance;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public String goCourse(Team team) {
        String result = "Результаты прохождения полосы препятствий командой " + team.getName() + ":\n";
        for(Sportsman man : team.getSportsmen()) {
            result += man.getName() + ":\n"
                    + passSwimDistance(man.getSwimDistance())
                    + passRunDistance(man.getRunDistance())
                    + passJumpHeight(man.getJumpHeight());
        }
        return result;
    }

    public String showSportsmenPassedDistance(Team team) {
        String winner = "Участники команды, прошедшие полосу препятствий:\n";
        for(Sportsman man : team.getSportsmen()) {
            if (man.getSwimDistance() >= swimDistance && man.getRunDistance() >= runDistance && man.getJumpHeight() >= jumpHeight)
                winner += man.toString() + '\n';
        }
        return winner;
    }

    public String passSwimDistance(int value) {
        return value >= swimDistance ? "Проплыл дистанцию = " + swimDistance + " м\n" : "Не проплыл дистанцию = " + swimDistance + " м\n";
    }

    public String passRunDistance(int value) {
        return value >= runDistance ? "Пробежал дистанцию = " + runDistance + " м\n" : "Не пробежал дистанцию = " + runDistance + " м\n";
    }

    public String passJumpHeight(int value) {
        return value >= jumpHeight ? "Перепрыгнул препятствие = " + jumpHeight + " м\n" : "Не перепрыгнул препятствие = " + jumpHeight + " м\n";
    }
}
