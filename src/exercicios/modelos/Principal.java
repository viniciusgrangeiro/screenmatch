package exercicios;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto banana = new Produto();
        Produto pao = new Produto();
        Produto agua = new Produto();

        banana.setNome("Banana");
        banana.setPreco(0.50);
        banana.setQuantidade(12);

        pao.setNome("Pao");
        pao.setPreco(0.30);
        pao.setQuantidade(80);

        agua.setNome("Agua");
        agua.setPreco(2.00);
        agua.setQuantidade(10);

        listaProdutos.add(banana);
        listaProdutos.add(pao);
        listaProdutos.add(agua);


        System.out.println(listaProdutos.size());
        System.out.println(listaProdutos.get(1));
        System.out.println(listaProdutos.getFirst());
        System.out.println(listaProdutos.getLast());

        System.out.println(banana);


    }
}
