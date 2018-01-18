
public class Player {
    
    //player class must need to start off with important variables needed for the program
    // name obviously, health for the fitness of athelete, skill of athlete and points is a total thing needed to add up to win the program
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
    
    //all player classes will need to get the name of the player
    public String getName(){
        return name;
    }
    
    public int getSkill(){
    return skill;
}
    public int getHealth(){
        return health;
    }
    
    public int getPoints(){
        return points;
    }
    //all getters needed ^
    
    //potential is to show if the user should try to play a game. will only win if in the NHL
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
     
     
     //increasing your skill will not only increase your skill but at the same time lower your energy to make it more challenging
      public void upSkill() {
        skill++;
        health=-2;
    }
      
      //same with increasing health it will drop skill
       public void upHealth() {
        health=+10;
        skill=-5;
    }
       
       //your toString will be nessisary for if you want to check out all of your players simulataniously to see who to use
     public String toString(Player p){
     return "The players name is " + name + " with a skill of " + skill + "with a potential of " + p.Potential();
        
    }
     
     
}
