package INFO5100.Exercise1;

public class Student
{
    int[] quiz = new int[15];
    int StudentId;
    String name;
    String EnrollmentType;
    int examScore;

    public void setExamScore(int examScore) {
        this.examScore = examScore;
    }

    public void Addquiz(int[] scores)
    {
        for (int i=0;i<scores.length;i++)
        {
            quiz[i] = scores[i];
        }
    }

    public Student(int studentId, String enrollmentType, String name,int[] quiz) {
        this.StudentId = studentId;
        this.EnrollmentType = enrollmentType;
        this.name = name;
        this.quiz = quiz;
    }
}
