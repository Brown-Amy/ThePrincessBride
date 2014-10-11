/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride;

import princessbride.model.Actor;
import princessbride.model.FireSwamp;
import princessbride.model.Item;
import princessbride.model.MadLib;
import princessbride.model.Maze;
import princessbride.model.Phrases;
import princessbride.model.Player;
import princessbride.model.SwampLocation;
import princessbride.model.Words;
/**
 *
 * @author alexanderknudson
 */
public class PrincessBride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setPlayerName("Jim");
        playerOne.setBestTime(7.68);        
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //-------------------------------
        
        Actor actorOne = new Actor();
        
        actorOne.setActorName("Buttercup");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        //-------------------------------
        
        Item itemOne = new Item();
        
        itemOne.setType("rope");
        itemOne.setDescription("a strong coil of rope");
        itemOne.setSpecialAbility("Can be used to rescue someone in peril");
        itemOne.setRequiredAmount(3);
        itemOne.setActualAmount(2);
                
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        //---------------------------------
        
        MadLib madLibOne = new MadLib();
        madLibOne.setDescription("You must complete this Mad Lib if you want to save the Princess");

        String madLibInfo = madLibOne.toString();
        System.out.println(madLibInfo);
        
        //----------------------------------
        
        Phrases phrasesOne = new Phrases();
        phrasesOne.setPhrase("Look behind you! It's a ");

        String phrasesInfo = phrasesOne.toString();
        System.out.println(phrasesInfo);
        
        //-----------------------------------
        
        Words wordsOne = new Words();
        wordsOne.setWordType("noun");
        
        String wordsInfo = wordsOne.toString();
        System.out.println(wordsInfo);
        
        //------------------------------------
           
        FireSwamp fireSwampOne = new FireSwamp();
        fireSwampOne.setDescription("Eerie and full of dangers. Hopefully you have what you need to survive!");
        
        String fireSwampInfo = fireSwampOne.toString();
        System.out.println(fireSwampInfo);
        //------------------------------------
        
        Maze mazeOne = new Maze();
        mazeOne.setDescription("You realize it will be difficult to find your way...");
        mazeOne.setRowCount(5);
        mazeOne.setColumnCount(7);
        
        String mazeOneInfo = mazeOne.toString();
        System.out.println(mazeOne);
        
        //------------------------------------
        
        SwampLocation swampLocationOne = new SwampLocation();
        swampLocationOne.setRow(3);
        swampLocationOne.setColumn(2);
        swampLocationOne.setBlocked(true);
        
        String swampLocationInfo = swampLocationOne.toString();
        System.out.println(swampLocationInfo);
        
        //-------------------------------------
        
    }
    
}
