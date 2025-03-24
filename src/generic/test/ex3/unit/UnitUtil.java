package generic.test.ex3.unit;

public class UnitUtil {

    public static <T extends BioUnit> T maxHp (T param1, T param2){
        //T maxHp = param1.getHp() >= param2.getHp() ? param1 : param2;
        //return maxHp;

        if(param1.getHp() > param2.getHp()){
            return param1;
        } else {
            return param2;
        }
    }
}
