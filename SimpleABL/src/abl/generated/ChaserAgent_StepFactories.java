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
public class ChaserAgent_StepFactories {
   static public Step stepFactory0(int __$stepID, Behavior __$behaviorParent, final Object[] __$behaviorFrame) {
      final Method __$stepFactory = ChaserAgent.__$stepFactory0_rfield;
      switch (__$stepID) {
         case -3: {
            // default wait step
            return new WaitStep(-3, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null);
         }
         case -2: {
            // default fail step
            return new FailStep(-2, __$stepFactory, __$behaviorParent, false, false, false, (short)-32768, (short)0, false, null, null);
         }
         case -1: {
            // default succeed step
            return new SucceedStep(-1, __$stepFactory, __$behaviorParent, false, false, (short)-32768, (short)0, false, null, null);
         }
         case 0: {
            // WaitAndChangeColor_1Step1
            return new MentalStep(0, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)3, (short)0, false, null, ChaserAgent.__$mentalExecute0_rfield, null, null, null);
         }
         case 1: {
            // WaitAndChangeColor_1Step2
            return new GoalStep(1, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "manageMovement()", null, (short)0);
         }
         case 2: {
            // WaitAndChangeColor_1Step3
            return new GoalStep(2, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "ChangeColor()", null, (short)0);
         }
         case 3: {
            // ChangeColor_1Step1
            return new PrimitiveStep(3, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, new SetColor(), null, "setColor");
         }
         case 4: {
            // manageFiring_1Step1
            return new GoalStep(4, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, "Wait(int)", null, (short)0);
         }
         case 5: {
            // manageFiring_1Step2
            return new GoalStep(5, __$stepFactory, __$behaviorParent, true, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "fire()", null, (short)0);
         }
         case 6: {
            // fire_1Step1
            return new PrimitiveStep(6, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, new SetColor(), null, "setColor");
         }
         case 7: {
            // fire_1Step2
            return new PrimitiveStep(7, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, new Fire(), null, "fire");
         }
         case 8: {
            // fire_1Step3
            return new GoalStep(8, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, "Wait(int)", null, (short)0);
         }
         case 9: {
            // manageMovement_1Step1
            return new GoalStep(9, __$stepFactory, __$behaviorParent, true, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "moveTo()", null, (short)0);
         }
         case 10: {
            // moveTo_1Step1
            return new PrimitiveStep(10, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, new MoveTo(), null, "moveTo");
         }
         case 11: {
            // Wait_1Step1
            return new MentalStep(11, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$mentalExecute0_rfield, null, null, null);
         }
         case 12: {
            // Wait_1Step2
            return new WaitStep(12, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, ChaserAgent.__$successTest0_rfield, null, null);
         }
         case 13: {
            // ChaserAgent_RootCollectionBehaviorStep1
            return new MentalStep(13, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)3, (short)0, false, null, ChaserAgent.__$mentalExecute0_rfield, null, null, null);
         }
         case 14: {
            // ChaserAgent_RootCollectionBehaviorStep2
            return new GoalStep(14, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)1, (short)0, false, null, null, null, null, null, "WaitAndChangeColor()", null, (short)0);
         }
      default:
         throw new AblRuntimeError("Unexpected stepID " + __$stepID);
      }
   }
}
