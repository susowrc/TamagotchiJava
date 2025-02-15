package utils;
import main.Tamagotchi;

public class TamagotchiHelper {
        
    public static void showHunger(Tamagotchi tamagotchi){
        System.out.println("Hambre: " + tamagotchi.getHunger());
    }

    public static void renderDeathByHunger(Tamagotchi tamagotchi){
        System.out.println(tamagotchi.getName() + " murio de hambre");
        tamagotchi.getTamagotchiSkin().renderDeath();
        showHunger(tamagotchi);
    }

    public static void renderDeathByOverfed(Tamagotchi tamagotchi){
        System.out.println(tamagotchi.getName() + " murio de sobrepeso");
        tamagotchi.getTamagotchiSkin().renderDeath();
        showHunger(tamagotchi);
    }

    public static void renderPlaying(Tamagotchi tamagotchi){
        System.out.println(tamagotchi.getName() + " está jugando!");
        tamagotchi.getTamagotchiSkin().renderPlaying();
        System.out.println(tamagotchi.getName() + " ahora tiene hambre...");
        showHunger(tamagotchi);
    }

    public static void renderEating(Tamagotchi tamagotchi){
        System.out.println(tamagotchi.getName() + " está comiendo!");
        tamagotchi.getTamagotchiSkin().renderEating();
        System.out.println(tamagotchi.getName() + " ahora está feliz!");
        showHunger(tamagotchi);
    }

    public static boolean checkName(String name) {
        return name != null && !name.trim().isEmpty();
    }
}
