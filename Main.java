import packages.PrintStatements;
import packages.variable1;
import packages.varSubtract;
import packages.VarMultiply;

public class Main {
    public static void main(String args[]){
        PrintStatements pr1 = new PrintStatements();
        variable1 var1 = new variable1();
        varSubtract vs1 = new varSubtract();
        VarMultiply vm1 = new VarMultiply();


        pr1.Show();
        System.out.println(var1.Add(2,6));
        System.out.println(vs1.Sub(7,3));
        System.out.println(vm1.Mul(9,76));


    }
}
