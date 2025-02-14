package state;

import main.Tamagotchi;
import skins.TamagochiSkinsInterface;

public class DeadState implements TamagotchiState{

    @Override
    public TamagotchiState play(Tamagotchi tamagotchi, TamagochiSkinsInterface tamagochiSkinsInterface) {
        return this;
    }

    @Override
    public TamagotchiState getFood(Tamagotchi tamagotchi, TamagochiSkinsInterface tamagochiSkinsInterface) {
       return this;
    }

}
