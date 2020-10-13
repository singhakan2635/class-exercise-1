package INFO5100.Exercise1;

import java.util.ArrayList;
import java.util.Arrays;

public class Session
{
    Student[] s = new Student[20];

    public void CalAverageQuiz()
    {
        for (int i=0;i<s.length;i++)
        {
            int sum=0;
            for (int j =0;j<s[i].quiz.length;j++)
            {
                sum += s[i].quiz[j];
            }
            float average = (float)sum/15;
            System.out.println("Average Quiz Score for Student "+s[i].StudentId+" is :" + average);
        }
    }
    public void Printscore() {
        for (int j = 0; j < s.length;j++)
        {
            System.out.print("Ascending order of quizes for the Student "+s[j].StudentId+ " is: ");
            Arrays.sort(s[j].quiz);
            for (int i=0;i<s[j].quiz.length;i++)
            {
                System.out.print(s[j].quiz[i]+" ,");
            }
            System.out.println();
        }
    }
    public void printPartime()
    {
        System.out.print("The Part-time students are :");
        for (int i=0;i<s.length;i++)
        {
            if (s[i].EnrollmentType =="Part Time")
            {
                System.out.print(s[i].name+" ");
            }
        }
        System.out.println();
    }
    public void PrintExamscore()
    {
        System.out.print("The exam score of the Full time students are :");
        for (int i=0;i<s.length;i++)
        {
            if (s[i].EnrollmentType=="Full Time")
            {
                System.out.println(s[i].examScore +" ");
            }
        }
        System.out.println();
    }



}
