import java.util.Arrays;
public class kwikset {
    public static void kwikset(double [] pinArray){
    int[] pins = new int[5];
    for (int i = 0; i < 5; i++) {
        if (pinArray[i] == .172){
             pins[i] = 1;
        } else if (pinArray[i] == .195){
            pins[i] = 2;
        } else if (pinArray[i] == .218){ pins[i] = 3;
        } else if (pinArray[i] == .241){pins[i] = 4;
        } else if (pinArray[i] == .264){pins[i] = 5;
        } else if (pinArray[i] == .287){pins[i] = 6;
        } else {System.out.println("oops");}
    }
    System.out.println(Arrays.toString(pins));
    
    }
    
}