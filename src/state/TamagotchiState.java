package state;

import main.Tamagotchi;
import skins.TamagochiSkinsInterface;

public interface TamagotchiState {

    public TamagotchiState play(Tamagotchi tamagotchi, TamagochiSkinsInterface tamagochiSkinsInterface);
    public TamagotchiState getFood(Tamagotchi tamagotchi, TamagochiSkinsInterface tamagochiSkinsInterface);
}
