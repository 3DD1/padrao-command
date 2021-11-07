public class FecharPedido implements Pedido{

    private PedidoCliente pedidoCliente;

    public FecharPedido(PedidoCliente pedidoCliente){
        this.pedidoCliente = pedidoCliente;
    }

    public void confirmaPedido(){
        this.pedidoCliente.abrirPedido();
    }
    public void cancelarPedido(){
        this.pedidoCliente.fecharPedido();
    }
}
