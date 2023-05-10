package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    @Test
    void deveRetornarDesempenhoPlayer() {
        Player player = new Player();
        player.setAvaliacao("Obsidian");

        assertEquals("Obsidian", player.getAvaliacao());
    }

}