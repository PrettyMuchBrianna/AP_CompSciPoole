/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
      Scanner sc = new Scanner (System.in);
      System.out.println("The story is a Dark Night");
      System.out.println("What path should we choose?");
      System.out.println("1. Explore the Woods");
      System.out.println("2. Stargaze from the Rooftop");
      System.out.println("3. Read a scary story");
      
      int answer=sc.nextInt();
      if (answer==1)
        {
            System.out.println("You begin to walk into the Billowing Willow forest. You are met with a for in the road leading to three other paths. Do you: ");
            System.out.println("1.Choose the path filled with vines");
            System.out.println("2.Choose the path filled with mushrooms");
            System.out.println("3.Choose the cave");
            int woods=sc.nextInt();
                if (woods==1){
                    System.out.println("")
                }
                else if (woods==2){
                    
                }
                else if (woods==3){
                    
                }
                else{
                    
                }
        }
      else if(answer==2)  
        {
            System.out.println("You walk up to your roof to view the full moon tonight. You sit alone on the rooftop, admiring the bright moon that shines in the gloomy night. Suddenly, you hear a howl in the distance. Do you:");
            System.out.println("1.Choose to stay on the roof");
            System.out.println("2.Go inside");
            System.out.println("3.Explore the woods and find the wolf howling");
            
        }
      else if(answer==3)
        {
            System.out.println("You sit down in your room with the lights off while preparing to read The Woman and the Scarf. As you open to the first page, your heart lurches and you hear your house go silent. Do you:");
            System.out.println("1.Stay in your room and lock the door");
            System.out.println("2.Explore your house");
            System.out.println("3.Climb out your window");
            
        }
      else{
         System.out.println("You did not make it womp womp");
      }
    
	}
}