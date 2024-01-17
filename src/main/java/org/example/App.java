package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        СalcSM calc = new СalcSM();
        Scanner sc = new Scanner(System.in);
        Integer cmd;
        while ( (cmd = sc.nextInt()) != 0){
            if(cmd==1){
                calc.action(СalcSM.CMD.INPUT);
            } else if (cmd == 2) {
                calc.action(СalcSM.CMD.CANCEL);
            }else if(cmd == 3){
                calc.action((СalcSM.CMD.BEGIN));
            }
        }
    }
}
