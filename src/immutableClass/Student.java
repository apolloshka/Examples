package immutableClass;

public final class Student {
    private final String name;
    private final int[] scores;

    Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores.clone();
    }

    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores.clone();
    }
}
