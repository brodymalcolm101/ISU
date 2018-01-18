
public class Goalie extends Player{
    
    
    //each child class has different situations applied to them 
    // in this case its for saving goals and trying to get a shutout
      public String offence(Player p) {
       if(p.Potential().equals("ECHL")){
           health=-2;
           return name + "sees a guy slapshot it from centre ice, and it gets right by you somehow";
       }
       else if(p.Potential().equals("AHL")){
           health=-2;
           return name + "is on a 2 on 0 and is ready to stop the one player thats about to shoot but the player passes it for a one timer goal";
       }
       else{ 
           skill-=7;
           points++;
           return name + "is against the other teams best player who has a breakaway. " + name + " dives out for a flying pokecheck making a huge save for the shutout" ;
           
       }
    }
    
}
