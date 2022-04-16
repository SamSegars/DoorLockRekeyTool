import java.util.Arrays;
public class kwikset {
    public static void kwikset(double [] pinArray){
    int[] pins = new int[5];
    for (int i = 0; i < 5; i++) {
        if (pinArray[i] >= .169 || pinArray[i] <= .175){pins[i] = 1;
        } else if (pinArray[i] >= .192 || pinArray[i] <= .198){pins[i] = 2;
        } else if (pinArray[i] >= .215 || pinArray[i] <= .221){ pins[i] = 3;
        } else if (pinArray[i] >= .238 || pinArray[i] <= .244){pins[i] = 4;
        } else if (pinArray[i] >= .261 || pinArray[i] <= .267){pins[i] = 5;
        } else if (pinArray[i] >= .284 || pinArray[i] <= .290){pins[i] = 6;
        } else {System.out.println("oops");}
    }
    System.out.println(Arrays.toString(pins));
    
    }
    
}