/**
 *
 * @author Mendelski
 */
package test;

import static br.edu.senai.util.ValidadorCPF.isCPF;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;



public class TestUtils {


    @Test 
    public void testCpf() {
        String CPF = "1104840905";
        assertEquals(true, isCPF(CPF));
        
//        CPF = "00000000000";
        
    }
}
