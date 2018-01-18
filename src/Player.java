
public class Player {
    public String name;
    public int skill;
    public int health;
    public int points;
    
     public Player(){
        skill = 0;
        health = 0;
        name = "";
        points = 0;
    }
    
    public Player(String n, int s, int p){
        skill = s;
        name = n;
        points = p;
    }
    
    public String getName(){
        return name;
    }
    
    public int getSkill(){
    return skill;
}
    
    public int getPoints(){
        return points;
    }
    
     public String Potential() {
          if(skill < 3){
              
           return "ECHL";
       }
       else if(skill > 3 || skill < 7){
           
           return "AHL";
       }
       else{
           
           return "NHL";
       }
    }
     
      public void upSkill() {
        skill++;
        health=-2;
    }
      
       public void upHealth() {
        health=+10;
        skill=-2;
    }
       
     public String toString(Player p){
     return "The forwards name is " + name + " with a skill of " + skill + "with a potential of " + p.Potential();
        
    }
     
     
}
