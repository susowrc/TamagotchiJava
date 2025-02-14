package skins;

public class TamagochiFrogRender implements TamagochiSkinsInterface {

    public void renderEating() {
    	System.out.println("\r\n"
	    		+ "            _   _\r\n"
	    		+ "           (.)_(.)\r\n"
	    		+ "        _ (   _   ) _    Mmm...\r\n"
	    		+ "       / \\/`-----'\\/ \\\r\n"
	    		+ "     __\\ ( (     ) ) /__\r\n"
	    		+ "     )   /\\ \\._./ /\\   (\r\n"
	    		+ "      )_/ /|\\   /|\\ \\_(");    
    }

    public void renderPlaying() {
	    System.out.println("\r\n"
	    		+ "            _   _\r\n"
	    		+ "           (^)_(^)\r\n"
	    		+ "        _ (   _   ) _    Mmm...\r\n"
	    		+ "       / \\/`-----'\\/ \\\r\n"
	    		+ "     __\\ ( (     ) ) /__\r\n"
	    		+ "     )   /\\ \\._./ /\\   (\r\n"
	    		+ "      )_/ /|\\   /|\\ \\_(");
    }

    public void renderSleeping() {
    	System.out.println("\r\n"
	    		+ "            _   _\r\n"
	    		+ "           (-)_(-)\r\n"
	    		+ "        _ (   _   ) _    zzz\r\n"
	    		+ "       / \\/`-----'\\/ \\\r\n"
	    		+ "     __\\ ( (     ) ) /__\r\n"
	    		+ "     )   /\\ \\._./ /\\   (\r\n"
	    		+ "      )_/ /|\\   /|\\ \\_(");
    }

    public void renderDeath() {
    	System.out.println("\r\n"
	    		+ "            _   _\r\n"
	    		+ "           (x)_(x)\r\n"
	    		+ "        _ (   _   ) _    ouch\r\n"
	    		+ "       / \\/`-----'\\/ \\\r\n"
	    		+ "     __\\ ( (     ) ) /__\r\n"
	    		+ "     )   /\\ \\._./ /\\   (\r\n"
	    		+ "      )_/ /|\\   /|\\ \\_(");
    }

}
