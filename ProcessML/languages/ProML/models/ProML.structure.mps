<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:e8a1240a-f052-4011-8f7f-dd8a47d16649(ProML.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="9" />
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="3348158742936976480" name="jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration" flags="ng" index="25R33">
        <property id="1421157252384165432" name="memberId" index="3tVfz5" />
        <property id="672037151186491528" name="presentation" index="1L1pqM" />
      </concept>
      <concept id="3348158742936976479" name="jetbrains.mps.lang.structure.structure.EnumerationDeclaration" flags="ng" index="25R3W">
        <reference id="1075010451642646892" name="defaultMember" index="1H5jkz" />
        <child id="3348158742936976577" name="members" index="25R1y" />
      </concept>
      <concept id="1082978164218" name="jetbrains.mps.lang.structure.structure.DataTypeDeclaration" flags="ng" index="AxPO6">
        <property id="7791109065626895363" name="datatypeId" index="3F6X1D" />
      </concept>
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="2mmaxsix2IC">
    <property role="EcuMT" value="2708398504493198248" />
    <property role="TrG5h" value="User" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2mmaxsix2ID" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2mmaxsix2IF" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493198251" />
      <property role="TrG5h" value="username" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2mmaxsix2IH" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493198253" />
      <property role="TrG5h" value="userType" />
      <ref role="AX2Wp" node="2mmaxsix2IK" resolve="UserType" />
    </node>
    <node concept="1TJgyj" id="2mmaxsiy3Dh" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493464145" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="solutions" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2mmaxsixoOB" resolve="Solution" />
    </node>
    <node concept="1TJgyj" id="2mmaxsiy3Dj" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493464147" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="problem" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2mmaxsixoOG" resolve="Problem" />
    </node>
    <node concept="1TJgyj" id="2mmaxsiy3Dm" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493464150" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="itemProcess" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2mmaxsixoOL" resolve="ItemProcess" />
    </node>
    <node concept="1TJgyj" id="2mmaxsiy3Dq" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493464154" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="itemSpecies" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2mmaxsixoOY" resolve="ItemSpecies" />
    </node>
    <node concept="1TJgyj" id="2mmaxsiytJB" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493571047" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="process" />
      <ref role="20lvS9" node="2mmaxsixoOO" resolve="Process" />
    </node>
  </node>
  <node concept="25R3W" id="2mmaxsix2IK">
    <property role="3F6X1D" value="2708398504493198256" />
    <property role="TrG5h" value="UserType" />
    <ref role="1H5jkz" node="2mmaxsix2IM" resolve="BASIC" />
    <node concept="25R33" id="2mmaxsix2IL" role="25R1y">
      <property role="3tVfz5" value="2708398504493198257" />
      <property role="TrG5h" value="ADMIN" />
      <property role="1L1pqM" value="ADMIN" />
    </node>
    <node concept="25R33" id="2mmaxsix2IM" role="25R1y">
      <property role="3tVfz5" value="2708398504493198258" />
      <property role="TrG5h" value="BASIC" />
      <property role="1L1pqM" value="BASIC" />
    </node>
  </node>
  <node concept="1TIwiD" id="2mmaxsixoOB">
    <property role="EcuMT" value="2708398504493288743" />
    <property role="TrG5h" value="Solution" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2mmaxsixoOC" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixoOE" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493288746" />
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="2mmaxsi$2XS" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493985656" />
      <property role="20kJfa" value="problem" />
      <ref role="20lvS9" node="2mmaxsixoOG" resolve="Problem" />
    </node>
  </node>
  <node concept="1TIwiD" id="2mmaxsixoOG">
    <property role="EcuMT" value="2708398504493288748" />
    <property role="TrG5h" value="Problem" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2mmaxsixoOH" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixoOJ" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493288751" />
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="2mmaxsi$2X8" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493985608" />
      <property role="20kJfa" value="solution" />
      <ref role="20lvS9" node="2mmaxsixoOB" resolve="Solution" />
    </node>
  </node>
  <node concept="1TIwiD" id="2mmaxsixoOL">
    <property role="EcuMT" value="2708398504493288753" />
    <property role="TrG5h" value="ItemProcess" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="2mmaxsixoOM" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493288754" />
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="2mmaxsi$2X4" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493985604" />
      <property role="20kJfa" value="itemSpecies" />
      <ref role="20lvS9" node="2mmaxsixoOY" resolve="ItemSpecies" />
    </node>
    <node concept="PrWs8" id="38IvoZMTRxk" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="2mmaxsixoOO">
    <property role="EcuMT" value="2708398504493288756" />
    <property role="TrG5h" value="Process" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2mmaxsixoOP" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixoOR" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493288759" />
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixrbV" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493298427" />
      <property role="TrG5h" value="startDate" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixrbY" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493298430" />
      <property role="TrG5h" value="endDate" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixrc2" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493298434" />
      <property role="TrG5h" value="status" />
      <ref role="AX2Wp" node="2mmaxsixrc7" resolve="ProcessStatus" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixrcg" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493298448" />
      <property role="TrG5h" value="weight" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyj" id="2mmaxsixrcm" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493298454" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="actionHistory" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2mmaxsixoP3" resolve="Action" />
    </node>
    <node concept="1TJgyj" id="2mmaxsixrcp" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493298457" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="location" />
      <ref role="20lvS9" node="2mmaxsixoOT" resolve="Location" />
    </node>
    <node concept="1TJgyj" id="38IvoZMTMCa" role="1TKVEi">
      <property role="IQ2ns" value="3615965608034118154" />
      <property role="20kJfa" value="itemProcess" />
      <ref role="20lvS9" node="2mmaxsixoOL" resolve="ItemProcess" />
    </node>
  </node>
  <node concept="1TIwiD" id="2mmaxsixoOT">
    <property role="EcuMT" value="2708398504493288761" />
    <property role="TrG5h" value="Location" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2mmaxsixoOU" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixoOW" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493288764" />
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixoPV" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493288827" />
      <property role="TrG5h" value="coordinates" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="2mmaxsixoOY">
    <property role="EcuMT" value="2708398504493288766" />
    <property role="TrG5h" value="ItemSpecies" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2mmaxsixoOZ" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixoP1" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493288769" />
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="2mmaxsixoP3">
    <property role="EcuMT" value="2708398504493288771" />
    <property role="TrG5h" value="Action" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2mmaxsixoP4" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixoP6" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493288774" />
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixoPv" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493288799" />
      <property role="TrG5h" value="actionType" />
      <ref role="AX2Wp" node="2mmaxsixoPm" resolve="ActionType" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixoPy" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493288802" />
      <property role="TrG5h" value="actionStatus" />
      <ref role="AX2Wp" node="2mmaxsixoP8" resolve="ActionStatus" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixoQ2" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493288834" />
      <property role="TrG5h" value="startDate" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2mmaxsixoQ7" role="1TKVEl">
      <property role="IQ2nx" value="2708398504493288839" />
      <property role="TrG5h" value="endDate" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="2mmaxsizsNI" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493829358" />
      <property role="20kJfa" value="problem" />
      <ref role="20lvS9" node="2mmaxsixoOG" resolve="Problem" />
    </node>
    <node concept="1TJgyj" id="2mmaxsizS35" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493940933" />
      <property role="20kJfa" value="solution" />
      <ref role="20lvS9" node="2mmaxsixoOB" resolve="Solution" />
    </node>
    <node concept="1TJgyj" id="2mmaxsizS38" role="1TKVEi">
      <property role="IQ2ns" value="2708398504493940936" />
      <property role="20kJfa" value="process" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="2mmaxsixoOO" resolve="Process" />
    </node>
  </node>
  <node concept="25R3W" id="2mmaxsixoP8">
    <property role="3F6X1D" value="2708398504493288776" />
    <property role="TrG5h" value="ActionStatus" />
    <ref role="1H5jkz" node="2mmaxsixoP9" resolve="TODO" />
    <node concept="25R33" id="2mmaxsixoP9" role="25R1y">
      <property role="3tVfz5" value="2708398504493288777" />
      <property role="TrG5h" value="TODO" />
      <property role="1L1pqM" value="TODO" />
    </node>
    <node concept="25R33" id="2mmaxsixoPa" role="25R1y">
      <property role="3tVfz5" value="2708398504493288778" />
      <property role="TrG5h" value="PROGRESS" />
      <property role="1L1pqM" value="PROGRESS" />
    </node>
    <node concept="25R33" id="2mmaxsixoPd" role="25R1y">
      <property role="3tVfz5" value="2708398504493288781" />
      <property role="TrG5h" value="FAILED" />
      <property role="1L1pqM" value="FAILED" />
    </node>
    <node concept="25R33" id="2mmaxsixoPh" role="25R1y">
      <property role="3tVfz5" value="2708398504493288785" />
      <property role="TrG5h" value="COMPLETED" />
      <property role="1L1pqM" value="COMPLETED" />
    </node>
  </node>
  <node concept="25R3W" id="2mmaxsixoPm">
    <property role="3F6X1D" value="2708398504493288790" />
    <property role="TrG5h" value="ActionType" />
    <ref role="1H5jkz" node="2mmaxsixoPr" resolve="CUSTOM" />
    <node concept="25R33" id="2mmaxsixoPn" role="25R1y">
      <property role="3tVfz5" value="2708398504493288791" />
      <property role="TrG5h" value="PROBLEM" />
      <property role="1L1pqM" value="PROBLEM" />
    </node>
    <node concept="25R33" id="2mmaxsixoPo" role="25R1y">
      <property role="3tVfz5" value="2708398504493288792" />
      <property role="TrG5h" value="SOLUTION" />
      <property role="1L1pqM" value="SOLUTION" />
    </node>
    <node concept="25R33" id="2mmaxsixoPr" role="25R1y">
      <property role="3tVfz5" value="2708398504493288795" />
      <property role="TrG5h" value="CUSTOM" />
      <property role="1L1pqM" value="CUSTOM" />
    </node>
  </node>
  <node concept="25R3W" id="2mmaxsixrc7">
    <property role="3F6X1D" value="2708398504493298439" />
    <property role="TrG5h" value="ProcessStatus" />
    <node concept="25R33" id="2mmaxsixrc8" role="25R1y">
      <property role="3tVfz5" value="2708398504493298440" />
      <property role="TrG5h" value="DRAFT" />
      <property role="1L1pqM" value="DRAFT" />
    </node>
    <node concept="25R33" id="2mmaxsixrc9" role="25R1y">
      <property role="3tVfz5" value="2708398504493298441" />
      <property role="TrG5h" value="PROGRESS" />
      <property role="1L1pqM" value="PROGRESS" />
    </node>
    <node concept="25R33" id="2mmaxsixrcc" role="25R1y">
      <property role="3tVfz5" value="2708398504493298444" />
      <property role="TrG5h" value="COMPLETED" />
      <property role="1L1pqM" value="COMPLETED" />
    </node>
  </node>
</model>

