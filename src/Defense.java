
public class Defense extends Player{

    
    
    // this situation is for the defenceman to try to stop forwards from scoring 
    public String defence(Player p) {
         if(p.Potential().equals("ECHL")){
           health=-2;
           return name + "Goes to hit a guy and hits him too hard resulting in a penalty";
       }
       else if(p.Potential().equals("AHL")){
           health=-2;
           return name + "Is stuck on a 2 on 1 and stops the first guy with a poke check but the other man gets around " + name + " and scores";
       }
       else{ 
           points ++;
           skill-=7;
           return name + "sees a forward trying to get a breakaway but " + name +  " hits him open ice to stop the play!";
           
       }
    }

   
}
