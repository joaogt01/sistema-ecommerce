import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<ItemPedido> itens;
    private boolean fechado;
    private LocalDateTime dataCriacao;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.fechado = false;
        //this.dataCriacao = LocalDateTime.now();  
    }

    public void adicionarItem(ItemPedido item){
        if (fechado) {
            System.out.println("Pedido já está fechado!");
            return;
        }
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemPedido item : itens){
            total += item.getSubtotal();
        }
        return total;
    }

    public void finalizarPedido(){
        this.fechado = true;
    }

    public void gerarRecibo(){
        if (itens.isEmpty()){
            System.out.println("Seu carrinho está vazio!");
            return;
        }

        System.out.println("===== RECIBO =====");
        System.out.println("Cliente: " + client.getNome());
        for (ItemPedido item : itens){
            Systrem.out.println(Item.GetProduto().getNome() + " | Quantidade: " + item.getQuantidade() + " | Subtotal : R$ " + item.getSubtotal());
        }

        System.out.println("------------------");
        System.out.println("TOTAL: R$ " + CALCULARtOTAL());
        Sytem.out.println("Status: " + (fechado ? "Fechado" : "Aberto"));
    }
}