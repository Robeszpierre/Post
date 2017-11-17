package post;


public class Post {
    private static Boolean finished=false;
    
     public static void main(String[] args) {
        new Post().start();
        
    }

    private void start() {
        while(!finished){
            Menu.displayRegistrationMenu();
        }
    }

    public static void finished(){
        finished=true;
    }
   
    
}
