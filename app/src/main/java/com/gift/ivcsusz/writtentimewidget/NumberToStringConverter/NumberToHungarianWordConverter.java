package com.gift.ivcsusz.writtentimewidget.NumberToStringConverter;

import java.util.HashMap;

public class NumberToHungarianWordConverter {

    private HashMap<Integer, String> tenths = new HashMap<>();
    private HashMap<Integer, String> ones = new HashMap<>();
    private HashMap<Integer, String> decimals = new HashMap<>();

    public NumberToHungarianWordConverter(){
        tenths.put(0,"");
        tenths.put(1, "Tizen");
        tenths.put(2, "Huszon");
        tenths.put(3, "Harminc");
        tenths.put(4, "Negyven");
        tenths.put(5, "Ötven");

        ones.put(0, "Nulla");
        ones.put(1, "Egy");
        ones.put(2, "Kettő");
        ones.put(3, "Három");
        ones.put(4, "Négy");
        ones.put(5, "Öt");
        ones.put(6, "Hat");
        ones.put(7, "Hét");
        ones.put(8, "Nyolc");
        ones.put(9, "Kilenc");

        decimals.put(10, "Tíz");
        decimals.put(20, "Húsz");
        decimals.put(30, "Harminc");
        decimals.put(40, "Negyven");
        decimals.put(50, "Ötven");
    }

    public String convert(Integer number){
        if (decimals.containsKey(number)){
            return decimals.get(number);
        }
        else if (tenths.containsKey(number/10)){
            StringBuilder builder = new StringBuilder(tenths.get(number/10));
            if (ones.containsKey(number%10)){
                builder.append(ones.get(number%10));
                return builder.toString();
            }
            return builder.toString();
        }
        return "undefined";
    }
}
