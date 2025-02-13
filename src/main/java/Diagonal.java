public class Diagonal {
    public static void main(String[] args) {
        String [][] dashes = new String[11][11];

        for(int p = 0; p < dashes.length; p++){
            for(int u = 0; u < dashes[p].length; u++){
                if(p % 2 == 0 && u % 2 == 0){
                dashes[p][u] = "🦎";

                } else if (p % 2 == 1 && u % 2 == 1) {
                    dashes[p][u] = "🦎";
            } else
                dashes[p][u] = ":🐍";
            }
        }
        print2d(dashes);
    }
public static void print2d(String[][] array){

    for(int p = 0; p < array.length; p++){
        for(int u = 0; u < array[p].length; u++){
            System.out.print(array[p][u]);
            }
            System.out.println();
        }    
    }
}
