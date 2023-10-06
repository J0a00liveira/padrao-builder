import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemBuilderTest {

    @Test
    void deveRetornarExcecaoParaPersonagemSemNivel() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setNome("Marcao")
                    .setHabilidade("lecionar")
                    .setNivel(0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nivel inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemSemNome() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setNivel(1)
                    .setHabilidade("saltar")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarPersonagemValido() {
        PersonagemBuilder personagemBuilder = new PersonagemBuilder();
        Personagem personagem = personagemBuilder
                .setNivel(10)
                .setNome("Personagem 1")
                .setHabilidade("atirar")
                .build();

        assertNotNull(personagem);
    }
}