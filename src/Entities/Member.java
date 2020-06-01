package Entities;

public class Member extends Person{
    private int pointsGained;

    public int getPointsGained() {
        return pointsGained;
    }
    public void setPointsGained(int pointsGained) {
        this.pointsGained = pointsGained;
    }

    public Member(String name, String dateOfBirth, int id, int pointsGained) {
        super(name, dateOfBirth, id);
        this.pointsGained = pointsGained;
    }
}
