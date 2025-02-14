package skins;

public class TamagochiOriginalRenderer implements TamagochiSkinsInterface {

		public void renderEating() {
            System.out.println("  /\\_/\\  ");
            System.out.println(" ( o.o )  Mmm...");
            System.out.println("  > ^ <  ");
        }
    
        public void renderPlaying() {
            System.out.println("  /\\_/\\  ");
            System.out.println(" ( ^.^ )   ");
            System.out.println("  > ^ < ");
        }
    
        public void renderSleeping() {
            System.out.println("  /\\_/\\  ");
            System.out.println(" ( -.- ) zzz");
            System.out.println("  > ^ < ");
        }

        public void renderDeath() {
            System.out.println("  /\\_/\\  ");
            System.out.println(" ( x.x ) ");
            System.out.println("  > ^ < ");
        }
}
