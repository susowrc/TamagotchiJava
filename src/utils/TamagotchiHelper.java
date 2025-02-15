package utils;
import main.Tamagotchi;
import skins.TamagotchiSkinsInterface;

public class TamagotchiHelper {
        
    public static void showHunger(Tamagotchi tamagotchi){
        System.out.println("Hambre: " + tamagotchi.getHunger());
    }

    public static void renderDeathByHunger(Tamagotchi tamagotchi, TamagotchiSkinsInterface tamagotchiSkinsInterface){
        System.out.println(tamagotchi.getName() + " murio de hambre");
        tamagotchiSkinsInterface.renderDeath();
        showHunger(tamagotchi);
    }

    public static void renderDeathByOverfed(Tamagotchi tamagotchi, TamagotchiSkinsInterface tamagotchiSkinsInterface){
        System.out.println(tamagotchi.getName() + " murio de sobrepeso");
        tamagotchiSkinsInterface.renderDeath();
        showHunger(tamagotchi);
    }

    public static void renderPlaying(Tamagotchi tamagotchi, TamagotchiSkinsInterface tamagotchiSkinsInterface){
        System.out.println(tamagotchi.getName() + " está jugando!");
        tamagotchiSkinsInterface.renderPlaying();
        System.out.println(tamagotchi.getName() + " ahora tiene hambre...");
        showHunger(tamagotchi);
    }

    public static void renderEating(Tamagotchi tamagotchi, TamagotchiSkinsInterface tamagotchiSkinsInterface){
        System.out.println(tamagotchi.getName() + " está comiendo!");
        tamagotchiSkinsInterface.renderEating();
        System.out.println(tamagotchi.getName() + " ahora está feliz!");
        showHunger(tamagotchi);
    }

    public static boolean checkName(String name) {
        return name != null && !name.trim().isEmpty();
    }
}
