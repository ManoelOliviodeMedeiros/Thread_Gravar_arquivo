
package empresas;

/**
 *
 * @author Manoel Olivio de Medeiros
 */
public class ExecutaThread {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Estanciar as Clases Clientes e Produtos
        Clientes cli = new Clientes();
        Produtos prod = new Produtos();
        // criar Thread
        Thread tcli;
        Thread tprod;
        tcli= new Thread(cli);
        tprod = new Thread(prod);
        // executar a Thread e Gravar em arquivos
        tcli.start();
        tprod.start();
       
    }
    
}
