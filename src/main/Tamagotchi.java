package main;

import skins.TamagotchiFrogRender;
import skins.TamagotchiOriginalRenderer;
import skins.TamagotchiSkinsInterface;
import state.HappyState;
import state.TamagotchiState;

public class Tamagotchi {

    private static final int MAX_HUNGER = 100;
    private static final int MIN_HUNGER = 0;

    private String name;
    private int hunger;
    private TamagotchiState currentState;
    private TamagotchiSkinsInterface tamagotchiSkin;

    Game gp = new Game();

    //CREATE INSTANCE
    private static Tamagotchi instance;

    //MAKE THE CONSTRUCTOR PRIVATE - SINGLETON - 
    private Tamagotchi(String name, int skin){
        this.name = name;
        hunger = 50;
        currentState = new HappyState();
        switch (skin) {
            case 1 -> tamagotchiSkin = new TamagotchiOriginalRenderer();
            case 2 -> tamagotchiSkin = new TamagotchiFrogRender();
            default -> tamagotchiSkin = new TamagotchiOriginalRenderer();
        }
    }

    //GET INSTANCE OF THE TAMAGOTCHI CLASS
    public static Tamagotchi createTamagotchi(String name, int skin){
        if(instance == null) {
            instance = new Tamagotchi(name, skin);
        }
        return instance;
    }

    // ACTIONS
    public void play(){
        this.currentState = this.currentState.play(this);
        gp.playSFX(3);
        
    }

    public void eat(){
        this.currentState = this.currentState.getFood(this);
        gp.playSFX(4);
    }

    //CHANGE HUNGER VALUES

    public void increaseHunger(int amout){
        this.hunger = Math.max(MIN_HUNGER, this.hunger - amout);
    }

    public void decreaseHunger(int amout){
        this.hunger = Math.min(MAX_HUNGER, this.hunger + amout);
    }

    //CHECK IF TAMAGOTCHI IS DEAD BY HUNGER OR OVERFED

    public boolean isDeadByHunger(){
        return this.hunger == MIN_HUNGER;
    }

    public boolean isDeadByOverfed(){
        return this.hunger == MAX_HUNGER;
    }


    //SETTERS Y GETTERS
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    
    public int getHunger() {
        return hunger;
    }

    public String getName() {
        return name;
    }

    public TamagotchiState getCurrentState() {
        return currentState;
    }

    public TamagotchiSkinsInterface getTamagotchiSkin() {
        return tamagotchiSkin;
    }

}
