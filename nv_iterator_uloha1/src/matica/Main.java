package matica;

public class Main {

    public static void main(String[] args) {
        Matrix m = new Matrix(3,4);

        MatrixIterator it = m.createRowIterator();

        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }

        System.out.println();

        it = m.createColumnIterator();

        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }
}
