public class Vertical {
    public static void main(String[] args) {
        String [][] lines = new String[11][11];

        for(int p = 0; p < lines.length; p++){
            for(int u = 0; u < lines[p].length; u++){
                if(u % 2 == 0){
                lines[p][u] = "🚀";
            } else
                lines[p][u] = "⭐";
            }
        }
        print2d(lines);
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

