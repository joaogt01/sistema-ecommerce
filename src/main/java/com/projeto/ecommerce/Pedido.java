package com.projeto.ecommerce;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private ArrayList<ItemPedido> itens;

    public Pedido(int numero, Cliente cliente){
        this.numero = numero;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemPedido item : itens){
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void gerarRecibo(){
        if (itens.isEmpty()){
            System.out.println("Seu carrinho está vazio!");
            return;
        }

        System.out.println("===== RECIBO =====");
        System.out.println(cliente.exibirResumo());
        for (ItemPedido item : itens){
            System.out.println("Item | Subtotal : R$ " + item.calcularSubtotal());
        }

        System.out.println("------------------");
        System.out.println("TOTAL: R$ " + calcularTotal());
    }
}