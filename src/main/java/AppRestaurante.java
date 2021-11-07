import java.util.ArrayList;
import java.util.List;

public class AppRestaurante {

    private List<Pedido> pedidos = new ArrayList<Pedido>();

    public void realizarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        pedido.confirmaPedido();
    }

    public void confirmaUltimoPedido(){
        if (pedidos.size() != 0){
            Pedido pedido = this.pedidos.get(this.pedidos.size() -1);
            pedido.cancelarPedido();
            this.pedidos.remove(this.pedidos.size() -1);
        }
    }
}
