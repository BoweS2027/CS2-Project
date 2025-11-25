 import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("You just enter the park and you are met at a stoplight. Do you wait for the light to turn green?");
       System.out.println("answer yes or no");
       Scanner scan = new Scanner(System.in);
       String c1 = scan.nextLine();
      String command = "";

      command = getCommand("ANSWER YES OR NO");

      if(c1=="no"){
         System.out.println("you crossed the street and now you see an icecream truck Do you get icecream?");
         String c2 = scan.nextLine();
         if(c2=="yes"){
         System.out.println("Do you get chocolate icecream");
         String c3 = scan.nextLine();
         if(c3=="no"){
            System.out.println("you enjoy your icecream and now you see a tree. Do you climb it?");
            String c4 = scan.nextLine();
            if(c4=="no"){
            System.out.println("you see a breakdancer. Do you tip him?");
            String c5 = scan.nextLine();
               if(c5=="yes"){
               System.out.println("you see a pigeon. Do you feed it?");
               String c6 = scan.nextLine();
                  if(c6=="no"){
                  System.out.println("you exit the park");
            
                  }
                  else{
                  System.out.println("The pigeon eats you instead of the food");
               }
               }
               else{
               System.out.println("The break dancer breaks your neck because he specilizes in breaking");
               }
            }
            else{
            System.out.println("You fall of the tree and die");
            }
         }
         else{
            System.out.println("you mix up your ice cream for dog poop and you die of sickness");
         }
       }
         else{
         System.out.println("you die from overheating");
         }
      }
      else{
         System.out.println("you were hit by a crazy biker and died");
      }
    } // END OF METHOD

        /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       scan.close();
       return command;
    } // END OF METHOD
 } // END OF CLASS
