import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppRestauranteTest {
        AppRestaurante app;
        PedidoCliente pedido;

        @BeforeEach
        void setUp(){
            app = new AppRestaurante();
            pedido = new PedidoCliente("Julieta", 2021);

        }

        @Test
        void deveAbrirPedido(){
            Pedido abertura = new AberturaPedido(pedido);
            app.realizarPedido(abertura);

            assertEquals("Pedido aberto", pedido.getSituacao());
        }

        @Test
        void deveFecharPedido(){
            Pedido fechar = new FecharPedido(pedido);
            app.realizarPedido(fechar);

            assertEquals("Pedido fechado", pedido.getSituacao());
        }

        @Test
        void  deveCancelarFechamentoPedido(){
            Pedido aberturaPedido = new AberturaPedido(pedido);
            Pedido fechadoPedido = new FecharPedido(pedido);

            app.realizarPedido(aberturaPedido);
            app.realizarPedido(fechadoPedido);

            app.confirmaUltimoPedido();

            assertEquals("Pedido aberto", pedido.getSituacao());
        }


}