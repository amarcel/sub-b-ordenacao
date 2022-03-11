import br.cesupa.subb_ordenacao.Ordenacao;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTeste {
    
    public OrdenacaoTeste() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    // SELECTION SORT:

    @Test
    public void testarNumerosIguaisSelectionSort() {
        int[] vetor = {4,3,3,3,3};
        int[] retorno = Ordenacao.selectionSort(vetor);
        assertArrayEquals(new int[] {3,3,3,3,4}, retorno);
    }
    
    @Test
    public void testarNumerosPositivosSelectionSort() {
        int[] vetor = {2, 9, 0, 4, 1, 8, 6, 7, 3, 5};
        int[] retorno = Ordenacao.selectionSort(vetor);
        assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8,9}, retorno);
    }
    
    @Test
    public void testarNumerosNegativosSelectionSort() {
        int[] vetor = {-7, -3, -1, -13, -5};
        int[] retorno = Ordenacao.selectionSort(vetor);
        assertArrayEquals(new int[] {-13, -7, -5, -3, -1}, retorno);
    }
    
    // BUBBLE SORT:
    
    @Test
    public void testarNumerosIguaisBubbleSort() {
        int[] vetor = {3,3,3,3,3};
        int[] retorno = Ordenacao.bubbleSort(vetor);
        assertArrayEquals(new int[] {3,3,3,3,3}, retorno);
    }
    
    @Test
    public void testarNumerosPositivosBubbleSort() {
        int[] vetor = {2, 9, 0, 4, 1, 8, 6, 7, 3, 5};
        int[] retorno = Ordenacao.bubbleSort(vetor);
        assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8,9}, retorno);
    }
    
    @Test
    public void testarNumerosNegativosBubbleSort() {
        int[] vetor = {-7, -3, -1, -13, -5};
        int[] retorno = Ordenacao.bubbleSort(vetor);
        assertArrayEquals(new int[] {-13, -7, -5, -3, -1}, retorno);
    }
    
    // INSERTION SORT:
    
    @Test
    public void testarNumerosIguaisInsertionSort() {
        int[] vetor = {3,3,3,3,3};
        int[] retorno = Ordenacao.insertionSort(vetor);
        assertArrayEquals(new int[] {3,3,3,3,3}, retorno);
    }
    
    @Test
    public void testarNumerosPositivosInsertionSort() {
        int[] vetor = {2, 9, 0, 4, 1, 8, 6, 7, 3, 5};
        int[] retorno = Ordenacao.insertionSort(vetor);
        assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8,9}, retorno);
    }
    
    @Test
    public void testarNumerosNegativosInsertionSort() {
        int[] vetor = {-7, -3, -1, -13, -5};
        int[] retorno = Ordenacao.insertionSort(vetor);
        assertArrayEquals(new int[] {-13, -7, -5, -3, -1}, retorno);
    }
    
    // MERGE SORT:
 
    @Test
    public void testarNumerosIguaisMergeSort() {
        int[] vetor = {3,3,3,3,3};
        int[] retorno = Ordenacao.mergeSort(vetor, vetor.length);
        assertArrayEquals(new int[] {3,3,3,3,3}, retorno);
    }
    
    @Test
    public void testarNumerosPositivosMergeSort() {
        int[] vetor = {2, 9, 0, 4, 1, 8, 6, 7, 3, 5};
        int[] retorno = Ordenacao.mergeSort(vetor, vetor.length);
        assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8,9}, retorno);
    }
    
    @Test
    public void testarNumerosNegativosMergeSort() {
        int[] vetor = {-7, -3, -1, -13, -5};
        int[] retorno = Ordenacao.mergeSort(vetor, vetor.length);
        assertArrayEquals(new int[] {-13, -7, -5, -3, -1}, retorno);
    }
    
    // QUICK SORT:
 
    @Test
    public void testarNumerosIguaisQuickSort() {
        int[] vetor = {3,3,3,3,3};
        int[] retorno = Ordenacao.quickSort(vetor, 0, vetor.length-1);
        assertArrayEquals(new int[] {3,3,3,3,3}, retorno);
    }
    
    @Test
    public void testarNumerosPositivosQuickSort() {
        int[] vetor = {2, 9, 0, 4, 1, 8, 6, 7, 3, 5};
        int[] retorno = Ordenacao.quickSort(vetor, 0, vetor.length-1);
        assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8,9}, retorno);
    }
    
    @Test
    public void testarNumerosNegativosQuickSort() {
        int[] vetor = {-7, -3, -1, -13, -5};
        int[] retorno = Ordenacao.quickSort(vetor, 0, vetor.length-1);
        assertArrayEquals(new int[] {-13, -7, -5, -3, -1}, retorno);
    }
    
}
