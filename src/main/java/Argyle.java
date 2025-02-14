public class Argyle {
    public static void main(String[] args) {
        String [][] arg = new String[11][11];

        for(int p = 0; p < arg.length; p++){
            for(int u = 0; u < arg[p].length; u++){
                arg[p][u] = "🕷️";
                if(p == u){
                    arg[p][u] = "🦇";
                }
                if(p + u == arg.length - 1){
                    arg[p][u] = "🦇";
                }
        }
    }
     for(int p = 0; p < arg.length/2 + 1; p++) {
            arg[p][arg.length/2 + p] = "🕷️";
            arg[p][arg.length/2 - p] = "🕷️";

           arg[arg.length - 1 - p][arg.length/2 + p] = "🕷️";
           arg[arg.length - 1 - p][arg.length/2 - p] = "🕷️";    
     }
        print2d(arg);
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
