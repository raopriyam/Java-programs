import hashmp.hash.*;


public class isUnique {
    public boolean Brute_force(String a) {
        int i;
        int j;

        for (i = 0; i < a.length(); i++) {
            for(j=i+1;j<a.length();j++){
                if(a.charAt(j) == a.charAt(i))
                    return false;
            }
        }
        return true;
    }
    public static void main(String args[]){


        isUnique iu = new isUnique();
        System.out.println("brute force");
        System.out.println(iu.Brute_force("priyam"));
        System.out.println(iu.Brute_force("priyrm"));
        System.out.println(iu.Brute_force("raoRAO"));
        System.out.println(iu.Brute_force("longerl"));

        System.out.println("Hashmap");
        System.out.println(hashmp.hash.hashmap1("priyam"));
        System.out.println(hashmp.hash.hashmap1("priyrm"));
        System.out.println(hashmp.hash.hashmap1("raoRAO"));
        System.out.println(hashmp.hash.hashmap1("longerl"));



    }
}