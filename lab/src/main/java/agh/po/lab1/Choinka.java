public class Choinka {
    public static void main(String[] args){
        for(int i=0; i<Integer.parseInt(args[0]); i++){
            String choinka = "*";
            for(int j=1; j<i+1; j++){
                choinka+="*";
            }
            System.out.println(choinka);
        }
    }
}
