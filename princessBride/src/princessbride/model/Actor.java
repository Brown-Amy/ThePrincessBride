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
public class Actor implements Serializable {
    private String actorName;

    public Actor() {
    }
    
    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    @Override
    public String toString() {
        return "Actor{" + "actorName=" + actorName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.actorName);
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.actorName, other.actorName)) {
            return false;
        }
        return true;
    }
    
    
    
}
