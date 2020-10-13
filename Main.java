package INFO5100.Exercise1;

import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        Session session = new Session();

        session.s[0] = new FullTime(1,"Full Time","Akanksha",78,randomNum());
        session.s[1] = new PartTime(2,"Part Time","Appu Raj",randomNum());
        session.s[2] = new FullTime(3,"Full Time","Chanchal Sharma",88,randomNum());
        session.s[3] = new FullTime(4,"Full TIme","Avinash Singh",78,randomNum());
        session.s[4] = new PartTime(5,"Part Time","Pushkar Raj",randomNum());
        session.s[5] = new FullTime(6,"Full Time","Anjali Singh",88,randomNum());
        session.s[6] = new FullTime(7,"Full TIme","Somya Suman",78,randomNum());
        session.s[7] = new FullTime(8,"Full Time","Charles David",88,randomNum());
        session.s[8] = new FullTime(9,"Full TIme","Prisha Singh",78,randomNum());
        session.s[9] = new PartTime(10,"Part Time","Punam Kumari",randomNum());
        session.s[10] = new FullTime(11,"Full Time","Ashok Kumar",88,randomNum());
        session.s[11] = new FullTime(12,"Full TIme","Shyam Kishor",78,randomNum());
        session.s[12] = new PartTime(13,"Part Time","Nidhi Singh",randomNum());
        session.s[13] = new PartTime(14,"Part Time","Indu Kumari",randomNum());
        session.s[14] = new PartTime(15,"Part Time","Harshit Ranjan",randomNum());
        session.s[15] = new FullTime(16,"Full Time","Shreya Ranjan",88,randomNum());
        session.s[16] = new FullTime(17,"Full TIme","Nisha Singh",78,randomNum());
        session.s[17] = new FullTime(18,"Full Time","Suyash Singh",88,randomNum());
        session.s[18] = new FullTime(19,"Full TIme","Adwita Singh",78,randomNum());
        session.s[19] = new PartTime(20,"Part Time","Ayush Cheng",randomNum());

        session.CalAverageQuiz();
        session.PrintExamscore();
        session.printPartime();
        session.Printscore();


    }

    private static int[] randomNum()
    {
        int[] masks = new int[15];
        Random random = new Random();
        for (int i=0;i<masks.length;i++)
        {
            masks[i] = random.nextInt(51)+50;
            System.out.println(masks);
        }
        return masks;

    }
}
