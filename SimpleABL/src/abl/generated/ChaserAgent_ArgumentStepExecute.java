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
         case 4: {
            // ChangeColor_1Step1
            final Object[] args = new Object[1];
            args[0] = new Integer(10);
            return args;
         }
         case 5: {
            // ChangeColor_1Step2
            final Object[] args = new Object[4];
            args[0] = new Integer(0);
            args[1] = new Integer(0);
            args[2] = new Integer(0);
            args[3] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[0]).i);
            return args;
         }
         case 8: {
            // move_1Step1
            final Object[] args = new Object[1];
            args[0] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[2]).i);
            return args;
         }
         case 9: {
            // move_2Step1
            final Object[] args = new Object[1];
            args[0] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[2]).i);
            return args;
         }
         case 10: {
            // move_3Step1
            final Object[] args = new Object[1];
            args[0] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[2]).i);
            return args;
         }
         case 11: {
            // move_4Step1
            final Object[] args = new Object[1];
            args[0] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[2]).i);
            return args;
         }
         case 12: {
            // move_5Step1
            final Object[] args = new Object[1];
            args[0] = new Integer(((__ValueTypes.IntVar)__$behaviorFrame[2]).i);
            return args;
         }
      default:
         throw new AblRuntimeError("Unexpected stepID " + __$stepID);
      }
   }
}
