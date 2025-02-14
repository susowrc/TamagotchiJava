package state;

import main.Tamagotchi;
import skins.TamagochiSkinsInterface;
import utils.TamagotchiHelper;

public class HappyState implements TamagotchiState{

     private static int INCREASE_HUNGER = 10;
     private static int DECREASE_HUNGER = 10;

    @Override
    public TamagotchiState play(Tamagotchi tamagotchi, TamagochiSkinsInterface tamagochiSkinsInterface) {
        tamagotchi.increaseHunger(INCREASE_HUNGER);
        if (tamagotchi.isDeadByHunger()) {
            TamagotchiHelper.renderDeathByHunger(tamagotchi, tamagochiSkinsInterface);
            return new DeadState();
        }
        else{
            TamagotchiHelper.renderPlaying(tamagotchi, tamagochiSkinsInterface);
            return this;
        }
    }

    @Override
    public TamagotchiState getFood(Tamagotchi tamagotchi, TamagochiSkinsInterface tamagochiSkinsInterface) {
        tamagotchi.decreaseHunger(DECREASE_HUNGER);
        if (tamagotchi.isDeadByOverfed()) {
            TamagotchiHelper.renderDeathByOverfed(tamagotchi, tamagochiSkinsInterface);
            return new DeadState();
        }else{
            TamagotchiHelper.renderEating(tamagotchi, tamagochiSkinsInterface);
            return this;
        }
    }
}
