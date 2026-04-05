package com.projeto.ecommerce;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Polo Caruaru", "1", "00000-000");
        Cliente cliente = new Cliente("Jackson", "jackson@email.com", endereco);

        Categoria eletronicos = new Categoria("Eletronicos", "Perifericos");
        Produto teclado = new Produto("Teclado Mecanico", 200.00, eletronicos);
        Produto mouse = new Produto("Mouse sem fio", 150.00, eletronicos);
        Produto fone = new Produto("Headset", 300.00, eletronicos);

        ItemPedido item1 = new ItemPedido(teclado, 1);
        ItemPedido item2 = new ItemPedido(mouse, 5);
        ItemPedido item3 = new ItemPedido(fone, 2);

        Pedido pedido = new Pedido(1, cliente);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        pedido.gerarRecibo();
    }
}
