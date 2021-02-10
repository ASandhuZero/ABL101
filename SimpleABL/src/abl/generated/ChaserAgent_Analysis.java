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
            _$analysisStepIDs.add("manageMovement()"); // stepID 1
            _$analysisStepIDs.add("ChangeColor()"); // stepID 2
            return _$analysisStepIDs;
         }
         case 1: {
            // ChangeColor_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 2: {
            // manageFiring_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            _$analysisStepIDs.add("Wait(int)"); // stepID 4
            _$analysisStepIDs.add("fire()"); // stepID 5
            return _$analysisStepIDs;
         }
         case 3: {
            // fire_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            _$analysisStepIDs.add("Wait(int)"); // stepID 8
            return _$analysisStepIDs;
         }
         case 4: {
            // manageMovement_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            _$analysisStepIDs.add("moveTo()"); // stepID 9
            return _$analysisStepIDs;
         }
         case 5: {
            // moveTo_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 6: {
            // Wait_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 7: {
            // ChaserAgent_RootCollectionBehavior
            List<String> _$analysisStepIDs = new ArrayList<String>();
            _$analysisStepIDs.add("WaitAndChangeColor()"); // stepID 14
            return _$analysisStepIDs;
         }
         case 8: {
            // __$defaultMemoryExecuteBehavior_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
      default:
         throw new AblRuntimeError("Unexpected behaviorID " + __$behaviorID);
      }
   }
}
