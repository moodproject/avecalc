package calculator;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class Exam implements Serializable {

    public String name;
    public int cfu;
    public int vote;
    public boolean laude;
    public boolean maked;

    public Exam() {
        name = "Unknow";
        cfu = -1;
        vote = -1;
        laude = false;
        maked = false;
    }

    public static Exam getInstance(String name, String cfu, String vote) {
        Exam e = new Exam();
        e.setName(name);
        e.setCfu(Integer.parseInt(cfu));
        if (vote.trim().endsWith("laude")) {
            e.setVote(30);
            e.setLode(true);
            e.setMaked(true);
        } else if (vote.indexOf("-") == -1) {
            e.setVote(Integer.parseInt(vote));
            e.setMaked(true);
        } else {
            e.setMaked(false);
        }
        return e;
    }

    public int getCfu() {
        return cfu;
    }

    public void setCfu(int cfu) {
        if (cfu <= 0) {
            throw new IllegalArgumentException("Cfu must to be a positive number");
        }
        this.cfu = cfu;
    }

    public boolean isLode() {
        return laude;
    }

    public void setLode(boolean lode) {
        if (vote != 30 && lode) {
            throw new IllegalArgumentException(
                    "The vote must to be equals to 30 to receive a laude");
        }
        this.laude = lode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        if (vote < 0 && vote > 30) {
            throw new IllegalArgumentException(
                    "vote must to be a number < 30 and > 0");
        }
        this.vote = vote;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return "[" + name + ", " + cfu + ", " + vote + (laude ? " cum laude" : "") + "]";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Exam)) {
            return false;
        }

        Exam e = (Exam) obj;

        if (e.name.equals(name) && e.cfu == cfu && e.vote == vote
                && e.laude == laude && e.maked == maked) {
            return true;
        }

        return false;
    }

    public boolean isMaked() {
        return maked;
    }

    public void setMaked(boolean maked) {
        this.maked = maked;
    }
}
