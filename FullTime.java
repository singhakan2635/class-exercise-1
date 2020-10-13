package INFO5100.Exercise1;

public class FullTime extends Student
{
    public FullTime(int studentId, String enrollmentType, String name, int examscore, int[] quiz) {
        super(studentId, enrollmentType,name,quiz);
        setExamScore(examscore);
    }
}
