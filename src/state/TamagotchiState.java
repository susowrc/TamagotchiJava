package state;

import main.Tamagotchi;
import skins.TamagotchiSkinsInterface;

public interface TamagotchiState {

    public TamagotchiState play(Tamagotchi tamagotchi, TamagotchiSkinsInterface tamagotchiSkinsInterface);
    public TamagotchiState getFood(Tamagotchi tamagotchi, TamagotchiSkinsInterface tamagotchiSkinsInterface);
}
