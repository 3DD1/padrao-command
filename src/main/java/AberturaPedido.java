public class AberturaPedido implements Pedido{

    private PedidoCliente pedidoCliente;

    public AberturaPedido(PedidoCliente pedidoCliente){
        this.pedidoCliente = pedidoCliente;
    }
    
    public void confirmaPedido(){
        this.pedidoCliente.abrirPedido();
    }
    public void cancelarPedido(){
        this.pedidoCliente.fecharPedido();
    }

}
