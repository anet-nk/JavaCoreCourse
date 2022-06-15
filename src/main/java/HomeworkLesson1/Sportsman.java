package HomeworkLesson1;

public class Sportsman {
    private String name;
    private int swimDistance;
    private int runDistance;
    private int jumpHeight;

    public Sportsman(String name, int swimDistance, int runDistance, int jumpHeight) {
        this.name = name;
        this.swimDistance = swimDistance;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", swimDistance=" + swimDistance +
                ", runDistance=" + runDistance +
                ", jumpHeight=" + jumpHeight +
                '}';
    }
}
