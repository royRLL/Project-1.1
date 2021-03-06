import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ColEdge1 {
    int u;
    int v;
}

class customArray1 {
    int breakIndex;
    int number;


    public customArray1(int breakpoint, int n) {
        breakIndex = breakpoint;
        number = n;
    }

    @Override
    public String toString() {
        return breakIndex + "," + number;
    }
}


public class ChromaticSolver {

    public final static boolean DEBUG = true;

    public final static String COMMENT = "//";
    public int vertices1;
    public int edges1;


    /**
     * this method makes an adjacency matrix based on the file the user uploads.
     * @param inputfile is the path for the graph the user wants to upload
     * @return an adjacency matrix based on the file
     */
    public static int[][] readCreateMatrix(String inputfile) {


        boolean seen[] = null;

        //! n is the number of vertices in the graph
        int n = -1;

        //! m is the number of edges in the graph
        int m = -1;

        //! e will contain the edges of the graph
        ColEdge1 e[] = null;

        try {
            FileReader fr = new FileReader(inputfile);
            BufferedReader br = new BufferedReader(fr);

            String record = new String();

            //! THe first few lines of the file are allowed to be comments, staring with a // symbol.
            //! These comments are only allowed at the top of the file.

            //! -----------------------------------------
            while ((record = br.readLine()) != null) {
                if (record.startsWith("//")) continue;
                break; // Saw a line that did not start with a comment -- time to start reading the data in!
            }

            if (record.startsWith("VERTICES = ")) {
                n = Integer.parseInt(record.substring(11));
                if (DEBUG) System.out.println(COMMENT + " Number of vertices = " + n);
            }

            seen = new boolean[n + 1];

            record = br.readLine();

            if (record.startsWith("EDGES = ")) {
                m = Integer.parseInt(record.substring(8));
                if (DEBUG) System.out.println(COMMENT + " Expected number of edges = " + m);
            }

            e = new ColEdge1[m];

            for (int d = 0; d < m; d++) {
                if (DEBUG) System.out.println(COMMENT + " Reading edge " + (d + 1));
                record = br.readLine();
                String data[] = record.split(" ");
                if (data.length != 2) {
                    System.out.println("Error! Malformed edge line: " + record);
                    System.exit(0);
                }
                e[d] = new ColEdge1();

                e[d].u = Integer.parseInt(data[0]);
                e[d].v = Integer.parseInt(data[1]);

                seen[e[d].u] = true;
                seen[e[d].v] = true;

                if (DEBUG) System.out.println(COMMENT + " Edge: " + e[d].u + " " + e[d].v);

            }

            String surplus = br.readLine();
            if (surplus != null) {
                if (surplus.length() >= 2) if (DEBUG)
                    System.out.println(COMMENT + " Warning: there appeared to be data in your file after the last edge: '" + surplus + "'");
            }

        } catch (IOException ex) {
            // catch possible io errors from readLine()
            System.out.println("Error! Problem reading file " + inputfile);
            System.exit(0);
        }

        for (int x = 1; x <= n; x++) {
            if (seen[x] == false) {
                if (DEBUG)
                    System.out.println(COMMENT + " Warning: vertex " + x + " didn't appear in any edge : it will be considered a disconnected vertex on its own.");
            }
        }

        int vertices = n;
        int edges = m;


        int[][] matrix = new int[vertices + 1][vertices + 1]; // creating adjacency matrix based on the amount of vertices.
        for (int i = 0; i < e.length; i++) {

            int firstNumber = e[i].u; // the matrix is created based on the pairs from the graphs provided
            int secondNumber = e[i].v;

            matrix[firstNumber][secondNumber] = 1;
            matrix[secondNumber][firstNumber] = 1;
        }
        return matrix;
    }

    /**
     * getter for the amount of vertices
     * @param adjMat the adjacency matrix
     * @return the length of it, or the amount of vertices.
     */

    public static int getVertices(int[][] adjMat){
        return adjMat.length;
    }


}
