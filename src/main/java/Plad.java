public class Plad {
    public static void main(String[] args) {
        String [][] flannel = new String[11][11];

        for(int p = 0; p < flannel.length; p++){
            for(int u = 0; u < flannel[p].length; u++){
                if(p % 2 == 0 && u % 2 == 0){
                flannel[p][u] = "🦖";
            } else
                flannel[p][u] = "🦕";
            }
        }
        print2d(flannel);
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
