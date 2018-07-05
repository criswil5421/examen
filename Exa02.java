public class Exa02{ 
    public static void main(String[] args) {
        String nom[] = {"Hola", "Juan", "Carlos"};
        reader(nom);

        nom=delete("Juan", nom);
        reader(nom);  
    }

    public static int find(String b, String v[]){
            for (int i=0;i<v.length;i++ ) {
                if (b.equals( v[i]) ){  
                    return i;
                }
            }
            return -1;
    }   
    public static String[] delete(String b, String v[]){
    	System.out.println("delete");
        String[] eli = new String[v.length-1];
        int a = 0;
        for (int i=0;i<v.length;i++ ) {
            if (b.equals( v[i]) ){
            }else{
                eli[a] = v[i];
                a++;
            }
        }
        return eli;
    }

    public static void reader(String v[]){
        for (int i=0;i<v.length ;i++ ) {
            System.out.println("v["+i+"]="+v[i]);
        }
    }
}