import java.util.*;
public class TesteEmpregado {
    public static void main(String[] args){
        empregado e1 = new empregado();
        empregado e2 = new empregado();
        empregado e3 = new empregado();
        e1.setTipo(1);
        e2.setTipo(2);
        e3.setTipo(3);
        e1.setSalario(2000);
        e2.setSalario(1500);
        e2.setComissao(0.5);
        e3.setSalario(1500);
        e3.setBonus(700);
        List <empregado> empregados = Arrays.asList(e1, e2, e3);
        for (empregado e : empregados)
            System.out.println(e.calcularalario());
    }

    
}
