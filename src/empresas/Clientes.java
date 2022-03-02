
package empresas;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manoel Olivio de Medeiros
 */
public class Clientes implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++ ){
            System.out.println("Nome;Cidade;Uf;Pais");
            System.out.println("João;São Paulo;SP;Brasil");
            System.out.println("Silveira;Natal;RN;Brasil");
            
               try {
                    FileWriter arq = new FileWriter("c:\\pasta\\clientes.txt", true);
                     arq.write("\"Nome;Cidade;Uf;Pais\"\n");
                     arq.write("\"Silveira;Natal;RN;Brasil\"\n");
                   arq.close();
             } catch (IOException ex) {
                
           }
            
        }
    }
    
}
