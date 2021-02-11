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
            return new GoalStep(0, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)1, (short)0, false, null, null, null, null, null, "manageMovement()", null, (short)0);
         }
         case 1: {
            // WaitAndChangeColor_1Step2
            return new GoalStep(1, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)2, (short)0, false, null, null, null, null, null, "ChangeColor()", null, (short)0);
         }
         case 2: {
            // Test_1Step1
            return new MentalStep(2, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)3, (short)0, false, null, ChaserAgent.__$mentalExecute0_rfield, null, null, null);
         }
         case 3: {
            // Test_1Step2
            return new GoalStep(3, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "manageMovement()", null, (short)0);
         }
         case 4: {
            // ChangeColor_1Step1
            return new GoalStep(4, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, "Wait(int)", null, (short)0);
         }
         case 5: {
            // ChangeColor_1Step2
            return new PrimitiveStep(5, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, new SetColor(), null, "setColor");
         }
         case 6: {
            // ChangeColor_1Step3
            return new GoalStep(6, __$stepFactory, __$behaviorParent, true, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "ChangeColor()", null, (short)0);
         }
         case 7: {
            // manageMovement_1Step1
            return new GoalStep(7, __$stepFactory, __$behaviorParent, true, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "move()", null, (short)0);
         }
         case 8: {
            // move_1Step1
            return new PrimitiveStep(8, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, new MoveUp(), null, "moveUp");
         }
         case 9: {
            // move_2Step1
            return new PrimitiveStep(9, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, new MoveDown(), null, "moveDown");
         }
         case 10: {
            // move_3Step1
            return new PrimitiveStep(10, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, new MoveLeft(), null, "moveLeft");
         }
         case 11: {
            // move_4Step1
            return new PrimitiveStep(11, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, new MoveRight(), null, "moveRight");
         }
         case 12: {
            // move_5Step1
            return new PrimitiveStep(12, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$argumentExecute0_rfield, null, null, null, new Stop(), null, "stop");
         }
         case 13: {
            // Wait_1Step1
            return new MentalStep(13, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, ChaserAgent.__$mentalExecute0_rfield, null, null, null);
         }
         case 14: {
            // Wait_1Step2
            return new WaitStep(14, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, ChaserAgent.__$successTest0_rfield, null, null);
         }
         case 15: {
            // ChaserAgent_RootCollectionBehaviorStep1
            return new MentalStep(15, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)3, (short)0, false, null, ChaserAgent.__$mentalExecute0_rfield, null, null, null);
         }
         case 16: {
            // ChaserAgent_RootCollectionBehaviorStep2
            return new GoalStep(16, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)1, (short)0, false, null, null, null, null, null, "WaitAndChangeColor()", null, (short)0);
         }
      default:
         throw new AblRuntimeError("Unexpected stepID " + __$stepID);
      }
   }
}
