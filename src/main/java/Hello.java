public class Hello {
    public static void main(String[] args) {

        String [ ][ ] symbols = new String [11][11]
        
        for(int i = 0; i < symbols.length; i++) {
            for(int j = 0; j < symbols[i].length ; j++){
                symbols[i][j] = “O";
                }
            }
        symbols[0][0] = “”;
        symbols[10][10] = “”;
        
        
            print2DArray(symbols);
        }
        
        public static void print2DArray(String[ ][ ] array){
        for(int i = 0; i < symbols.length; i++) {
            for(int j = 0; j < symbols[i].length ; j++){
                System.out.println(array[i][j]);
                    }
        System.out.println(x:””);
            }
        
        }
            
        
}