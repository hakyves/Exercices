package exercise1;

public class School {
    private int schoolId;
    private String schoolName;

    public School() {
    }

    public School(int schoolId,String schoolName) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }
}
