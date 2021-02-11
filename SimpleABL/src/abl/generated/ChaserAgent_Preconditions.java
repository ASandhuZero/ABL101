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
public class ChaserAgent_Preconditions {
   static public boolean precondition0(int __$behaviorID, Object[] __$args, Map __$variableTable, final BehavingEntity __$thisEntity) {
      switch (__$behaviorID) {
         case 2: {
            // ChangeColor_1
            int id;
            int botY;
            int botX;
               List wmeList0;
               ListIterator wmeIter0;
               wmeList0 = BehavingEntity.getBehavingEntity().lookupWME("BotWME");
               wmeIter0 = wmeList0.listIterator();
               while(wmeIter0.hasNext()) {
                  BotWME wme__0 = (BotWME)wmeIter0.next();
                  if (
                     BehavingEntity.constantTrue(botX = wme__0.getLocationX())
                     &&
                     BehavingEntity.constantTrue(botY = wme__0.getLocationY())
                     &&
                     BehavingEntity.constantTrue(id = wme__0.getId())
                  )

                  {
                     __$variableTable.put("id", new Integer(id));
                     __$variableTable.put("botY", new Integer(botY));
                     __$variableTable.put("botX", new Integer(botX));
                     return true;
                  }

               }


            return false;
         }
         case 4: {
            // move_1
            int playerX;
            int playerY;
            int id;
            int botY;
            int botX;
               List wmeList0;
               ListIterator wmeIter0;
               wmeList0 = BehavingEntity.getBehavingEntity().lookupWME("BotWME");
               wmeIter0 = wmeList0.listIterator();
               while(wmeIter0.hasNext()) {
                  BotWME wme__0 = (BotWME)wmeIter0.next();
                  if (
                     BehavingEntity.constantTrue(botX = wme__0.getLocationX())
                     &&
                     BehavingEntity.constantTrue(botY = wme__0.getLocationY())
                     &&
                     BehavingEntity.constantTrue(id = wme__0.getId())
                  )

                  {
                        List wmeList1;
                        ListIterator wmeIter1;
                        wmeList1 = BehavingEntity.getBehavingEntity().lookupWME("PlayerWME");
                        wmeIter1 = wmeList1.listIterator();
                        while(wmeIter1.hasNext()) {
                           PlayerWME wme__1 = (PlayerWME)wmeIter1.next();
                           if (
                              BehavingEntity.constantTrue(playerX = wme__1.getLocationX())
                              &&
                              BehavingEntity.constantTrue(playerY = wme__1.getLocationY())
                           )

                           {
                                 if (
                                    botY >(playerY + ((ChaserAgent)__$thisEntity).botSpeed)
                                 )

                                 {
                                    __$variableTable.put("playerX", new Integer(playerX));
                                    __$variableTable.put("id", new Integer(id));
                                    __$variableTable.put("botY", new Integer(botY));
                                    __$variableTable.put("playerY", new Integer(playerY));
                                    __$variableTable.put("botX", new Integer(botX));
                                    return true;
                                 }


                           }

                        }


                  }

               }


            return false;
         }
         case 5: {
            // move_2
            int playerX;
            int playerY;
            int id;
            int botY;
            int botX;
               List wmeList0;
               ListIterator wmeIter0;
               wmeList0 = BehavingEntity.getBehavingEntity().lookupWME("BotWME");
               wmeIter0 = wmeList0.listIterator();
               while(wmeIter0.hasNext()) {
                  BotWME wme__0 = (BotWME)wmeIter0.next();
                  if (
                     BehavingEntity.constantTrue(botX = wme__0.getLocationX())
                     &&
                     BehavingEntity.constantTrue(botY = wme__0.getLocationY())
                     &&
                     BehavingEntity.constantTrue(id = wme__0.getId())
                  )

                  {
                        List wmeList1;
                        ListIterator wmeIter1;
                        wmeList1 = BehavingEntity.getBehavingEntity().lookupWME("PlayerWME");
                        wmeIter1 = wmeList1.listIterator();
                        while(wmeIter1.hasNext()) {
                           PlayerWME wme__1 = (PlayerWME)wmeIter1.next();
                           if (
                              BehavingEntity.constantTrue(playerX = wme__1.getLocationX())
                              &&
                              BehavingEntity.constantTrue(playerY = wme__1.getLocationY())
                           )

                           {
                                 if (
                                    botY <(playerY - ((ChaserAgent)__$thisEntity).botSpeed)
                                 )

                                 {
                                    __$variableTable.put("playerX", new Integer(playerX));
                                    __$variableTable.put("id", new Integer(id));
                                    __$variableTable.put("botY", new Integer(botY));
                                    __$variableTable.put("playerY", new Integer(playerY));
                                    __$variableTable.put("botX", new Integer(botX));
                                    return true;
                                 }


                           }

                        }


                  }

               }


            return false;
         }
         case 6: {
            // move_3
            int playerX;
            int playerY;
            int id;
            int botY;
            int botX;
               List wmeList0;
               ListIterator wmeIter0;
               wmeList0 = BehavingEntity.getBehavingEntity().lookupWME("BotWME");
               wmeIter0 = wmeList0.listIterator();
               while(wmeIter0.hasNext()) {
                  BotWME wme__0 = (BotWME)wmeIter0.next();
                  if (
                     BehavingEntity.constantTrue(botX = wme__0.getLocationX())
                     &&
                     BehavingEntity.constantTrue(botY = wme__0.getLocationY())
                     &&
                     BehavingEntity.constantTrue(id = wme__0.getId())
                  )

                  {
                        List wmeList1;
                        ListIterator wmeIter1;
                        wmeList1 = BehavingEntity.getBehavingEntity().lookupWME("PlayerWME");
                        wmeIter1 = wmeList1.listIterator();
                        while(wmeIter1.hasNext()) {
                           PlayerWME wme__1 = (PlayerWME)wmeIter1.next();
                           if (
                              BehavingEntity.constantTrue(playerX = wme__1.getLocationX())
                              &&
                              BehavingEntity.constantTrue(playerY = wme__1.getLocationY())
                           )

                           {
                                 if (
                                    botX >(playerX + ((ChaserAgent)__$thisEntity).botSpeed)
                                 )

                                 {
                                    __$variableTable.put("playerX", new Integer(playerX));
                                    __$variableTable.put("id", new Integer(id));
                                    __$variableTable.put("botY", new Integer(botY));
                                    __$variableTable.put("playerY", new Integer(playerY));
                                    __$variableTable.put("botX", new Integer(botX));
                                    return true;
                                 }


                           }

                        }


                  }

               }


            return false;
         }
         case 7: {
            // move_4
            int playerX;
            int playerY;
            int id;
            int botY;
            int botX;
               List wmeList0;
               ListIterator wmeIter0;
               wmeList0 = BehavingEntity.getBehavingEntity().lookupWME("BotWME");
               wmeIter0 = wmeList0.listIterator();
               while(wmeIter0.hasNext()) {
                  BotWME wme__0 = (BotWME)wmeIter0.next();
                  if (
                     BehavingEntity.constantTrue(botX = wme__0.getLocationX())
                     &&
                     BehavingEntity.constantTrue(botY = wme__0.getLocationY())
                     &&
                     BehavingEntity.constantTrue(id = wme__0.getId())
                  )

                  {
                        List wmeList1;
                        ListIterator wmeIter1;
                        wmeList1 = BehavingEntity.getBehavingEntity().lookupWME("PlayerWME");
                        wmeIter1 = wmeList1.listIterator();
                        while(wmeIter1.hasNext()) {
                           PlayerWME wme__1 = (PlayerWME)wmeIter1.next();
                           if (
                              BehavingEntity.constantTrue(playerX = wme__1.getLocationX())
                              &&
                              BehavingEntity.constantTrue(playerY = wme__1.getLocationY())
                           )

                           {
                                 if (
                                    botX <(playerX - ((ChaserAgent)__$thisEntity).botSpeed)
                                 )

                                 {
                                    __$variableTable.put("playerX", new Integer(playerX));
                                    __$variableTable.put("id", new Integer(id));
                                    __$variableTable.put("botY", new Integer(botY));
                                    __$variableTable.put("playerY", new Integer(playerY));
                                    __$variableTable.put("botX", new Integer(botX));
                                    return true;
                                 }


                           }

                        }


                  }

               }


            return false;
         }
         case 8: {
            // move_5
            int playerX;
            int playerY;
            int id;
            int botY;
            int botX;
               List wmeList0;
               ListIterator wmeIter0;
               wmeList0 = BehavingEntity.getBehavingEntity().lookupWME("BotWME");
               wmeIter0 = wmeList0.listIterator();
               while(wmeIter0.hasNext()) {
                  BotWME wme__0 = (BotWME)wmeIter0.next();
                  if (
                     BehavingEntity.constantTrue(botX = wme__0.getLocationX())
                     &&
                     BehavingEntity.constantTrue(botY = wme__0.getLocationY())
                     &&
                     BehavingEntity.constantTrue(id = wme__0.getId())
                  )

                  {
                        List wmeList1;
                        ListIterator wmeIter1;
                        wmeList1 = BehavingEntity.getBehavingEntity().lookupWME("PlayerWME");
                        wmeIter1 = wmeList1.listIterator();
                        while(wmeIter1.hasNext()) {
                           PlayerWME wme__1 = (PlayerWME)wmeIter1.next();
                           if (
                              BehavingEntity.constantTrue(playerX = wme__1.getLocationX())
                              &&
                              BehavingEntity.constantTrue(playerY = wme__1.getLocationY())
                           )

                           {
                                 if (
                                    botX <(playerX - ((ChaserAgent)__$thisEntity).botSpeed)
                                 )

                                 {
                                    __$variableTable.put("playerX", new Integer(playerX));
                                    __$variableTable.put("id", new Integer(id));
                                    __$variableTable.put("botY", new Integer(botY));
                                    __$variableTable.put("playerY", new Integer(playerY));
                                    __$variableTable.put("botX", new Integer(botX));
                                    return true;
                                 }


                           }

                        }


                  }

               }


            return false;
         }
      default:
         throw new AblRuntimeError("Unexpected behaviorID " + __$behaviorID);
      }
   }
}
