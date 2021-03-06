package ProML.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAction = createDescriptorForAction();
  /*package*/ final ConceptDescriptor myConceptItemProcess = createDescriptorForItemProcess();
  /*package*/ final ConceptDescriptor myConceptItemSpecies = createDescriptorForItemSpecies();
  /*package*/ final ConceptDescriptor myConceptLocation = createDescriptorForLocation();
  /*package*/ final ConceptDescriptor myConceptProblem = createDescriptorForProblem();
  /*package*/ final ConceptDescriptor myConceptProcess = createDescriptorForProcess();
  /*package*/ final ConceptDescriptor myConceptSolution = createDescriptorForSolution();
  /*package*/ final ConceptDescriptor myConceptUser = createDescriptorForUser();
  /*package*/ final EnumerationDescriptor myEnumerationActionStatus = new EnumerationDescriptor_ActionStatus();
  /*package*/ final EnumerationDescriptor myEnumerationActionType = new EnumerationDescriptor_ActionType();
  /*package*/ final EnumerationDescriptor myEnumerationProcessStatus = new EnumerationDescriptor_ProcessStatus();
  /*package*/ final EnumerationDescriptor myEnumerationUserType = new EnumerationDescriptor_UserType();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAction, myConceptItemProcess, myConceptItemSpecies, myConceptLocation, myConceptProblem, myConceptProcess, myConceptSolution, myConceptUser);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Action:
        return myConceptAction;
      case LanguageConceptSwitch.ItemProcess:
        return myConceptItemProcess;
      case LanguageConceptSwitch.ItemSpecies:
        return myConceptItemSpecies;
      case LanguageConceptSwitch.Location:
        return myConceptLocation;
      case LanguageConceptSwitch.Problem:
        return myConceptProblem;
      case LanguageConceptSwitch.Process:
        return myConceptProcess;
      case LanguageConceptSwitch.Solution:
        return myConceptSolution;
      case LanguageConceptSwitch.User:
        return myConceptUser;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList(myEnumerationActionStatus, myEnumerationActionType, myEnumerationProcessStatus, myEnumerationUserType);
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ProML", "Action", 0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d43L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e8a1240a-f052-4011-8f7f-dd8a47d16649(ProML.structure)/2708398504493288771");
    b.version(2);
    b.property("description", 0x25962a1712858d46L).type(PrimitiveTypeId.STRING).origin("2708398504493288774").done();
    b.property("actionType", 0x25962a1712858d5fL).type(MetaIdFactory.dataTypeId(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d56L)).origin("2708398504493288799").done();
    b.property("actionStatus", 0x25962a1712858d62L).type(MetaIdFactory.dataTypeId(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d48L)).origin("2708398504493288802").done();
    b.property("startDate", 0x25962a1712858d82L).type(PrimitiveTypeId.STRING).origin("2708398504493288834").done();
    b.property("endDate", 0x25962a1712858d87L).type(PrimitiveTypeId.STRING).origin("2708398504493288839").done();
    b.associate("problem", 0x25962a17128dcceeL).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d2cL).optional(true).origin("2708398504493829358").done();
    b.associate("solution", 0x25962a17128f80c5L).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d27L).optional(true).origin("2708398504493940933").done();
    b.associate("process", 0x25962a17128f80c8L).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d34L).optional(false).origin("2708398504493940936").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForItemProcess() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ProML", "ItemProcess", 0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d31L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e8a1240a-f052-4011-8f7f-dd8a47d16649(ProML.structure)/2708398504493288753");
    b.version(2);
    b.property("description", 0x25962a1712858d32L).type(PrimitiveTypeId.STRING).origin("2708398504493288754").done();
    b.associate("itemSpecies", 0x25962a1712902f44L).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d3eL).optional(true).origin("2708398504493985604").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForItemSpecies() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ProML", "ItemSpecies", 0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d3eL);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e8a1240a-f052-4011-8f7f-dd8a47d16649(ProML.structure)/2708398504493288766");
    b.version(2);
    b.property("description", 0x25962a1712858d41L).type(PrimitiveTypeId.STRING).origin("2708398504493288769").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForLocation() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ProML", "Location", 0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d39L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e8a1240a-f052-4011-8f7f-dd8a47d16649(ProML.structure)/2708398504493288761");
    b.version(2);
    b.property("description", 0x25962a1712858d3cL).type(PrimitiveTypeId.STRING).origin("2708398504493288764").done();
    b.property("coordinates", 0x25962a1712858d7bL).type(PrimitiveTypeId.STRING).origin("2708398504493288827").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProblem() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ProML", "Problem", 0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d2cL);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e8a1240a-f052-4011-8f7f-dd8a47d16649(ProML.structure)/2708398504493288748");
    b.version(2);
    b.property("description", 0x25962a1712858d2fL).type(PrimitiveTypeId.STRING).origin("2708398504493288751").done();
    b.associate("solution", 0x25962a1712902f48L).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d27L).optional(true).origin("2708398504493985608").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProcess() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ProML", "Process", 0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d34L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e8a1240a-f052-4011-8f7f-dd8a47d16649(ProML.structure)/2708398504493288756");
    b.version(2);
    b.property("description", 0x25962a1712858d37L).type(PrimitiveTypeId.STRING).origin("2708398504493288759").done();
    b.property("startDate", 0x25962a171285b2fbL).type(PrimitiveTypeId.STRING).origin("2708398504493298427").done();
    b.property("endDate", 0x25962a171285b2feL).type(PrimitiveTypeId.STRING).origin("2708398504493298430").done();
    b.property("status", 0x25962a171285b302L).type(MetaIdFactory.dataTypeId(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a171285b307L)).origin("2708398504493298434").done();
    b.property("weight", 0x25962a171285b310L).type(PrimitiveTypeId.INTEGER).origin("2708398504493298448").done();
    b.associate("itemProcess", 0x322e7d8ff2e72a0aL).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d31L).optional(true).origin("3615965608034118154").done();
    b.aggregate("actionHistory", 0x25962a171285b316L).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d43L).optional(true).ordered(true).multiple(true).origin("2708398504493298454").done();
    b.aggregate("location", 0x25962a171285b319L).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d39L).optional(true).ordered(true).multiple(false).origin("2708398504493298457").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSolution() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ProML", "Solution", 0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d27L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e8a1240a-f052-4011-8f7f-dd8a47d16649(ProML.structure)/2708398504493288743");
    b.version(2);
    b.property("description", 0x25962a1712858d2aL).type(PrimitiveTypeId.STRING).origin("2708398504493288746").done();
    b.associate("problem", 0x25962a1712902f78L).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d2cL).optional(true).origin("2708398504493985656").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForUser() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ProML", "User", 0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712842ba8L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e8a1240a-f052-4011-8f7f-dd8a47d16649(ProML.structure)/2708398504493198248");
    b.version(2);
    b.property("username", 0x25962a1712842babL).type(PrimitiveTypeId.STRING).origin("2708398504493198251").done();
    b.property("userType", 0x25962a1712842badL).type(MetaIdFactory.dataTypeId(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712842bb0L)).origin("2708398504493198253").done();
    b.aggregate("solutions", 0x25962a1712883a51L).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d27L).optional(true).ordered(true).multiple(true).origin("2708398504493464145").done();
    b.aggregate("problem", 0x25962a1712883a53L).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d2cL).optional(true).ordered(true).multiple(true).origin("2708398504493464147").done();
    b.aggregate("itemProcess", 0x25962a1712883a56L).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d31L).optional(true).ordered(true).multiple(true).origin("2708398504493464150").done();
    b.aggregate("itemSpecies", 0x25962a1712883a5aL).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d3eL).optional(true).ordered(true).multiple(true).origin("2708398504493464154").done();
    b.aggregate("process", 0x25962a171289dbe7L).target(0x554e933e8e394a86L, 0x9d77357220a3da7cL, 0x25962a1712858d34L).optional(true).ordered(true).multiple(false).origin("2708398504493571047").done();
    return b.create();
  }
}
