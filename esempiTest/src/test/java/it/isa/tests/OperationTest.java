package it.isa.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class OperationTest {
    
    @Test
    public void testSum() {
        Operations op = new Operations();
        float result = op.sumInt(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void testGetOperations() {
        Operations op = new Operations(2);
        int result = op.getCount();
        assertEquals(2, result);
    }

    @Test
    public void testServerInterfaceOperation() {
        ServerInterface si = mock(ServerInterface.class);
        Operations op = new Operations(si);

        //quando verrà chiamato si.getstatus restituisce 2
        when(si.getStatus()).thenReturn(2);

        assertEquals(2, op.getServerStatus());

        verify(si).getStatus();

        when(si.getURL(anyString(), anyString())).thenReturn("www.unife.it");

        assertEquals("www.unife.it", op.getURL("esame", "italia"));
        assertEquals("www.unife.it", op.getURL("lezioni", "italia"));
    }

    /*
    @Property
    public void alwaysHoldSumInt(int a, int b) {
        Operations op = new Operations();

        int result = op.sumInt(a, b);
        if(a>0 && b>0){
            assertTrue(result > a);
        }
    }
    */

    @Property
    public void alwaysHoldDivisione(int a, int b) {
        Operations op = new Operations();
        float res = op.divisione(a, b);

        if(a > b && b>=0 && a>=0){
            assertTrue(res>1);
        }
        
    }
}
