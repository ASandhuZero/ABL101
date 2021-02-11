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
public class ChaserAgent_Analysis {
   static public List<String> analysis0(int __$behaviorID) {
      switch (__$behaviorID) {
         case 0: {
            // WaitAndChangeColor_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            _$analysisStepIDs.add("manageMovement()"); // stepID 0
            _$analysisStepIDs.add("ChangeColor()"); // stepID 1
            return _$analysisStepIDs;
         }
         case 1: {
            // Test_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            _$analysisStepIDs.add("manageMovement()"); // stepID 3
            return _$analysisStepIDs;
         }
         case 2: {
            // ChangeColor_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            _$analysisStepIDs.add("Wait(int)"); // stepID 4
            _$analysisStepIDs.add("ChangeColor()"); // stepID 6
            return _$analysisStepIDs;
         }
         case 3: {
            // manageMovement_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            _$analysisStepIDs.add("move()"); // stepID 7
            return _$analysisStepIDs;
         }
         case 4: {
            // move_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 5: {
            // move_2
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 6: {
            // move_3
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 7: {
            // move_4
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 8: {
            // move_5
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 9: {
            // Wait_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 10: {
            // ChaserAgent_RootCollectionBehavior
            List<String> _$analysisStepIDs = new ArrayList<String>();
            _$analysisStepIDs.add("WaitAndChangeColor()"); // stepID 16
            return _$analysisStepIDs;
         }
         case 11: {
            // __$defaultMemoryExecuteBehavior_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
      default:
         throw new AblRuntimeError("Unexpected behaviorID " + __$behaviorID);
      }
   }
}
