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
public class RhymingWord implements Serializable{
    
    private String rhymePattern;

    public RhymingWord() {
    }
    

    public String getRhymePattern() {
        return rhymePattern;
    }

    public void setRhymePattern(String rhymePattern) {
        this.rhymePattern = rhymePattern;
    }

    @Override
    public String toString() {
        return "RhymingWord{" + "rhymePattern=" + rhymePattern + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.rhymePattern);
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
        final RhymingWord other = (RhymingWord) obj;
        if (!Objects.equals(this.rhymePattern, other.rhymePattern)) {
            return false;
        }
        return true;
    }
    
    
    
}
