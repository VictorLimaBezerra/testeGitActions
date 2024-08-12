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
    public void multiplicaDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int multiplica = calculadora.multiplicacao(5,20);
        System.out.println(multiplica);
        Assertions.assertEquals(100,multiplica);
    }

    @Test
    public void divideDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.divisao(20,5);
        System.out.println(divisao);
        System.out.println("teste de gitActions");
        Assertions.assertEquals(4,divisao);
    }

    @Test
    public void verificaPar(){
        Calculadora calculadora = new Calculadora();
        boolean verifica = calculadora.verificaSeEPar(10);
        Assertions.assertTrue(verifica);
    }

}
