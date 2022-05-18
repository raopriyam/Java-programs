import packages.PrintStatements;
import packages.variable1;
import packages.varSubtract;
import packages.VarMultiply;
import packages.variable2;
import packages.datatype1;
import packages.datatype2;
import packages.datatp3;
import packages.char1;
import packages.string1;
import packages.printChars;
import packages.PrintElements;


public class Main {
    public static void main(String args[]){
        PrintStatements pr1 = new PrintStatements();
        variable1 var1 = new variable1();
        varSubtract vs1 = new varSubtract();
        VarMultiply vm1 = new VarMultiply();
        variable2 var2 = new variable2();
        datatype1 dt1 = new datatype1();
        datatype2 dt2 = new datatype2();
        datatp3 dt3 = new datatp3();
        char1 ch1 = new char1();
        string1 s1 = new string1();
        printChars prc1 = new printChars();
        PrintElements pe1 = new PrintElements();


        pr1.Show();
        System.out.println(var1.Add(2,6));
        System.out.println(vs1.Sub(7,3));
        System.out.println(vm1.Mul(9,76));
        var2.Show();
        dt1.show();
        dt2.Result();
        dt3.show();
        System.out.println(ch1.displayChar());
        System.out.println(s1.strShow());
        prc1.PrintChars();
        pe1.printElements( new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
    }
}
