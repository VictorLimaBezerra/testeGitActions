import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {


    @Test
    public void somaDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(15, 90);
        System.out.println(soma);
        Assertions.assertEquals(105,soma);
    }

    @Test
    public void subtraiDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int subitrai = calculadora.subtracao(90,15);
        System.out.println(subitrai);
        Assertions.assertEquals(75,subitrai);
    }

    @Test
    public void verificaPar(){
        Calculadora calculadora = new Calculadora();
        boolean verifica = calculadora.verificaSeEPar(10);
        Assertions.assertTrue(verifica);
    }

}
