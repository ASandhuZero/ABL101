package abl.generated;

import abl.runtime.*;
import wm.WME;
import java.util.*;
import java.lang.reflect.Method;
import abl.learning.*;
import abl.wmes.*;
import abl.actions.*;
import abl.sensors.*;
public class ChaserAgent_ArgumentStepExecute {
   static public Object[] argumentExecute0(int __$stepID, final Object[] __$behaviorFrame, final BehavingEntity __$thisEntity) {
      switch (__$stepID) {
         case 0: {
            // manageFiring_1Step1
            final Object[] args = new Object[1];
            args[0] = new Integer(2000);
            return args;
         }
         case 2: {
            // fire_1Step1
            final Object[] args = new Object[4];
            args[0] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[3]).i);
            args[1] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[2]).i);
            args[2] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[0]).i);
            args[3] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[1]).i);
            return args;
         }
         case 4: {
            // WaitAndChangeColor_1Step1
            final Object[] args = new Object[1];
            args[0] = new Integer(500);
            return args;
         }
      default:
         throw new AblRuntimeError("Unexpected stepID " + __$stepID);
      }
   }
}
