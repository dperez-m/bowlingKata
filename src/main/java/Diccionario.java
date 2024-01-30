import java.util.AbstractMap;
import java.util.Map;

public  class Diccionario {

        private static final Map<Character,Integer> SYMBOL_MAP = Map.ofEntries(
        new AbstractMap.SimpleEntry<>('X',10),
        new AbstractMap.SimpleEntry<>('/',10),
        new AbstractMap.SimpleEntry<>('-',0),
        new AbstractMap.SimpleEntry<>('1',1),
        new AbstractMap.SimpleEntry<>('2',2),
        new AbstractMap.SimpleEntry<>('3',3),
        new AbstractMap.SimpleEntry<>('4',4),
        new AbstractMap.SimpleEntry<>('5',5),
        new AbstractMap.SimpleEntry<>('6',6),
        new AbstractMap.SimpleEntry<>('7',7),
        new AbstractMap.SimpleEntry<>('8',8),
        new AbstractMap.SimpleEntry<>('9',9)
    );

    public static int charValue(char value){
        return  SYMBOL_MAP.getOrDefault(value, 0);
    }

}
