import java.util.Arrays;
public class schlage {
    public static void schlage(double [] pinArray){
            int[] pins = new int[6];
    for (int i = 0; i < 6; i++) {
        if (pinArray[i] >= .165 && pinArray[i] <= .167){pins[i] = 0;
        } else if (pinArray[i] >= .180 && pinArray[i] <= .182){pins[i] = 1;
        } else if (pinArray[i] >= .195 && pinArray[i] <= .197){ pins[i] = 2;
        } else if (pinArray[i] >= .210 && pinArray[i] <= .212){pins[i] = 3;
        } else if (pinArray[i] >= .225 && pinArray[i] <= .227){pins[i] = 4;
        } else if (pinArray[i] >= .240 && pinArray[i] <= .242){pins[i] = 5;
        } else if (pinArray[i] >= .255 && pinArray[i] <= .257){pins[i] = 6;
        } else if (pinArray[i] >= .270 && pinArray[i] <= .272){pins[i] = 7;
        } else if (pinArray[i] >= .285 && pinArray[i] <= .287){pins[i] = 8;
        } else if (pinArray[i] >= .300 && pinArray[i] <= .302){pins[i] = 9;
        } else {System.out.println("Pin " + (i + 1) + " could not be calculated");}
    }
    System.out.println(Arrays.toString(pins));
    
    }
}