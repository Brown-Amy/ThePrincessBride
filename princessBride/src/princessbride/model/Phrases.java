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
 * @author alexanderknudson
 */
public class Phrases implements Serializable{
    
    private String phrase;

    public Phrases() {
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    @Override
    public String toString() {
        return "Phrases{" + "phrase=" + phrase + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.phrase);
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
        final Phrases other = (Phrases) obj;
        if (!Objects.equals(this.phrase, other.phrase)) {
            return false;
        }
        return true;
    }
    
    

}
    

