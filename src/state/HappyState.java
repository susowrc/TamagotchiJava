package state;

import main.Tamagotchi;
import skins.TamagotchiSkinsInterface;
import utils.TamagotchiHelper;

public class HappyState implements TamagotchiState{

     private static int INCREASE_HUNGER = 10;
     private static int DECREASE_HUNGER = 10;

    @Override
    public TamagotchiState play(Tamagotchi tamagotchi, TamagotchiSkinsInterface tamagotchiSkinsInterface) {
        tamagotchi.increaseHunger(INCREASE_HUNGER);
        if (tamagotchi.isDeadByHunger()) {
            TamagotchiHelper.renderDeathByHunger(tamagotchi, tamagotchiSkinsInterface);
            return new DeadState();
        }
        else{
            TamagotchiHelper.renderPlaying(tamagotchi, tamagotchiSkinsInterface);
            return this;
        }
    }

    @Override
    public TamagotchiState getFood(Tamagotchi tamagotchi, TamagotchiSkinsInterface tamagotchiSkinsInterface) {
        tamagotchi.decreaseHunger(DECREASE_HUNGER);
        if (tamagotchi.isDeadByOverfed()) {
            TamagotchiHelper.renderDeathByOverfed(tamagotchi, tamagotchiSkinsInterface);
            return new DeadState();
        }else{
            TamagotchiHelper.renderEating(tamagotchi, tamagotchiSkinsInterface);
            return this;
        }
    }
}
