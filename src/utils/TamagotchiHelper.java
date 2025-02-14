package utils;
import main.Tamagotchi;
import skins.TamagochiSkinsInterface;

public class TamagotchiHelper {
        
    public static void showHunger(Tamagotchi tamagotchi){
        System.out.println("Hambre: " + tamagotchi.getHunger());
    }

    public static void renderDeathByHunger(Tamagotchi tamagochi, TamagochiSkinsInterface tamagochiSkinsInterface){
        System.out.println(tamagochi.getName() + " murio de hambre");
        tamagochiSkinsInterface.renderDeath();
        showHunger(tamagochi);
    }

    public static void renderDeathByOverfed(Tamagotchi tamagochi, TamagochiSkinsInterface tamagochiSkinsInterface){
        System.out.println(tamagochi.getName() + " murio de sobrepeso");
        tamagochiSkinsInterface.renderDeath();
        showHunger(tamagochi);
    }

    public static void renderPlaying(Tamagotchi tamagotchi, TamagochiSkinsInterface tamagochiSkinsInterface){
        System.out.println(tamagotchi.getName() + " está jugando!");
        tamagochiSkinsInterface.renderPlaying();
        System.out.println(tamagotchi.getName() + " ahora tiene hambre...");
        showHunger(tamagotchi);
    }

    public static void renderEating(Tamagotchi tamagochi, TamagochiSkinsInterface tamagochiSkinsInterface){
        System.out.println(tamagochi.getName() + " está comiendo!");
        tamagochiSkinsInterface.renderEating();
        System.out.println(tamagochi.getName() + " ahora está feliz!");
        showHunger(tamagochi);
    }

    public static boolean checkName(String name) {
        return name != null && !name.trim().isEmpty();
    }
}
