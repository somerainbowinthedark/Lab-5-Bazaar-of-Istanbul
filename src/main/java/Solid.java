public class Solid{
    public static void main(String[] args) {
        String [][] basic = new String[11][11];

        for(int p = 0; p < basic.length; p++){
            for(int u = 0; u < basic[p].length; u++){
            basic[p][u] = "🦈";
            }
        }
        print2d(basic);
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