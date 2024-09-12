// package slip2;
// Write a java program to accept details of ‘n’ cricket player
//  (pid, pname, totalRuns, InningsPlayed, NotOuttimes). 
//  Calculate the average of all the players. Display the details 
//  of player having maximum average. (Use Array of Object)

import java.util.Scanner;
class cricket {
    int pid;
    String p_name;
    int totalRuns;
    int InningsPlayed;
    int NotOuttimes;

    public void accept() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Cricket Player info");
        pid = input.nextInt();
        p_name = input.next();
        totalRuns = input.nextInt();
        InningsPlayed = input.nextInt();
        NotOuttimes = input.nextInt();
    }

    public void cal_avg() {
        int Avrage = totalRuns / InningsPlayed;
        System.out.println("The Avrage of the player :=" + Avrage);
    }

    public void Display() {
        System.out.println("P_id is" + pid);
        System.out.println("player name is " + p_name);
        System.out.println("player total run is " + totalRuns);
        System.out.println("player InningsPlayed  is " + InningsPlayed);
        System.out.println("player NotOuttimes run is " + NotOuttimes);
    }

}

public class Q1 {
    public static void main(String[] args) {
        cricket c = new cricket();
        int a[] = new int[2];
        for (int i = 0; i < a.length; i++) {
            c.accept();
            c.cal_avg();
            c.Display();
        }
    }
}
