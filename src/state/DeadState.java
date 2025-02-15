package state;

import main.Tamagotchi;
import skins.TamagotchiSkinsInterface;

public class DeadState implements TamagotchiState{

    @Override
    public TamagotchiState play(Tamagotchi tamagotchi, TamagotchiSkinsInterface tamagotchiSkinsInterface) {
        return this;
    }

    @Override
    public TamagotchiState getFood(Tamagotchi tamagotchi, TamagotchiSkinsInterface tamagotchiSkinsInterface) {
       return this;
    }

}
