/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author amybrown
 */
public class RockPaperScissors implements Serializable{
    
    private int score;
    private int scoreFezzik;
    private int scorePlayer;
    private int choice;
    private String description;

    public RockPaperScissors() {
    }
    

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScoreFezzik() {
        return scoreFezzik;
    }

    public void setScoreFezzik(int scoreFezzik) {
        this.scoreFezzik = scoreFezzik;
    }

    public int getScorePlayer() {
        return scorePlayer;
    }

    public void setScorePlayer(int scorePlayer) {
        this.scorePlayer = scorePlayer;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RockPaperScissors{" + "score=" + score + ", scoreFezzik=" + scoreFezzik + ", scorePlayer=" + scorePlayer + ", choice=" + choice + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.score;
        hash = 37 * hash + this.scoreFezzik;
        hash = 37 * hash + this.scorePlayer;
        hash = 37 * hash + this.choice;
        hash = 37 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RockPaperScissors other = (RockPaperScissors) obj;
        if (this.score != other.score) {
            return false;
        }
        if (this.scoreFezzik != other.scoreFezzik) {
            return false;
        }
        if (this.scorePlayer != other.scorePlayer) {
            return false;
        }
        if (this.choice != other.choice) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
}
