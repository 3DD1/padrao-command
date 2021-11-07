public class PedidoCliente {
    private String nomeCliente;
    private int dataPedido;
    private String situacao;

    public PedidoCliente(String nomeCliente, int dataPedido) {
        this.nomeCliente = nomeCliente;
        this.dataPedido = dataPedido;
    }
    public String getSituacao(){
        return situacao;
    }
    public void abrirPedido(){
        this.situacao = "Pedido aberto";
    }
    public void fecharPedido(){
        this.situacao = "Pedido fechado";
    }



}
