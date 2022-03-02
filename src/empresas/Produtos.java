
package empresas;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Manoel Olivio de Medeiros
 */
public class Produtos implements Runnable{

    @Override
    public void run() {
        
        //Gravar em auquivo
       
        for (int p = 1; p < 100; p++){
            System.out.println(p);
            try {
                FileWriter arq = new FileWriter("c:\\pasta\\produtos.txt"); 
                arq.write(p+"\n");
              arq.close();
          } catch (Exception e) {
        }
       }
    }
 }
    

