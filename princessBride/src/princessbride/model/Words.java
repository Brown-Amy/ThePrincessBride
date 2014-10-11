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
public class Words implements Serializable {
    private String wordType;

    public Words() {
    }

    public String getWordType() {
        return wordType;
    }

    public void setWordType(String wordType) {
        this.wordType = wordType;
    }

    @Override
    public String toString() {
        return "Words{" + "wordType=" + wordType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.wordType);
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
        final Words other = (Words) obj;
        if (!Objects.equals(this.wordType, other.wordType)) {
            return false;
        }
        return true;
    }
    
    
}
