public class Forward extends Player{
    
   
     public Forward(String n, int s, int p){
        skill = s;
        name = n;
        points = p;
    }
    
    
       //this situation is for the forward to try and score goals based on potential
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
           skill-=7;
           points++;
           return name + "goes down the ice and finds the back of the net to get the game winner!";
           
       }
    }
}


    