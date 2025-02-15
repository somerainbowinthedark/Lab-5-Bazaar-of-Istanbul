public class Argyle {

    public static void main(String[] args) {
        String [][] fancy = new String [11][11];

        for(int p = 0; p < fancy.length; p++){
            for(int u = 0; u < fancy[p].length; u ++){
                
                fancy[p][u] = "🦇";

                if (u == p) {
                    fancy[p][u] = "☠️";
                }
                if (p + u == fancy.length - 1){
                    fancy[p][u] = "☠️";
                }
            }
        }
        for(int p = 0; p < fancy.length/2 + 1; p ++) {
            fancy[p][fancy.length/2 - p] = "☠️";
            fancy[p][fancy.length/2 + p] = "☠️";

            
           fancy[fancy.length - 1 - p][fancy.length/2 + p] = "☠️";
           fancy[fancy.length - 1 - p][fancy.length/2 - p] = "☠️";
        }
        print2d(fancy);
    }

    public static void print2d(String[][] array){

        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array[x].length; y++){
                System.out.print(array[x][y]); 
            }
            System.out.println(); 
        }
    }
}