public class Main {
    public static void main(String[] args) {

        Ship s = Ship.DR;
        Ship t = Ship.FIGHTER;
    
        Main.whatami(s);
        Main.whatami(t);
      }
    
      public static void whatami(Ship ship) {
        switch (ship) {
          case DR:
            System.out.println("I'm a Dread");
            break;
          case FIGHTER:
            System.out.println("I'm a Fighter");
            break;
          default:
            throw new RuntimeException();
        }
    
      }
    
}