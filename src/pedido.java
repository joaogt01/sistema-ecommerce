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
        
    }