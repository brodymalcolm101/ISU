public class Forward extends Player{
    
   
       
    public String offence(Player p) {
       if(p.Potential().equals("ECHL")){
           health=-2;
           return name + "tries to go down the ice to score but falls trying";
       }
       else if(p.Potential().equals("AHL")){
           health=-2;
           return name + "flies down the left side of the ice and shoots right off of the post!";
       }
       else{ 
           skill-=5;
           points++;
           return name + "goes down the ice and finds the back of the net to get the game winner!";
           
       }
    }
}


    