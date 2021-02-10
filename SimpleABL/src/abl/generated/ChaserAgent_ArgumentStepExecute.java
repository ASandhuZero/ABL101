package abl.generated;

import abl.runtime.*;
import wm.WME;
import wm.WorkingMemorySet;
import wm.WMEIndex;
import wm.TrackedWorkingMemory;
import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import abl.learning.*;
import abl.wmes.*;
import abl.actions.*;
import abl.sensors.*;
public class ChaserAgent_ArgumentStepExecute {
   static public Object[] argumentExecute0(int __$stepID, final Object[] __$behaviorFrame, final BehavingEntity __$thisEntity) {
      switch (__$stepID) {
         case 3: {
            // ChangeColor_1Step1
            final Object[] args = new Object[4];
            args[0] = new Integer(0);
            args[1] = new Integer(0);
            args[2] = new Integer(0);
            args[3] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[0]).i);
            return args;
         }
         case 4: {
            // manageFiring_1Step1
            final Object[] args = new Object[1];
            args[0] = new Integer(2000);
            return args;
         }
         case 6: {
            // fire_1Step1
            final Object[] args = new Object[4];
            args[0] = new Integer(0);
            args[1] = new Integer(24);
            args[2] = new Integer(144);
            args[3] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[2]).i);
            return args;
         }
         case 7: {
            // fire_1Step2
            final Object[] args = new Object[4];
            args[0] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[4]).i);
            args[1] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[3]).i);
            args[2] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[0]).i);
            args[3] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[1]).i);
            return args;
         }
         case 8: {
            // fire_1Step3
            final Object[] args = new Object[1];
            args[0] = new Integer(500);
            return args;
         }
         case 10: {
            // moveTo_1Step1
            final Object[] args = new Object[3];
            args[0] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[0]).i);
            args[1] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[1]).i);
            args[2] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[2]).i);
            return args;
         }
      default:
         throw new AblRuntimeError("Unexpected stepID " + __$stepID);
      }
   }
}
