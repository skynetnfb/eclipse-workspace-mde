<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:3349b3b1-22c1-4433-a9c3-68c71d0b5807(ProML.cooltivar)">
  <persistence version="9" />
  <languages>
    <use id="554e933e-8e39-4a86-9d77-357220a3da7c" name="ProML" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports />
  <registry>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="554e933e-8e39-4a86-9d77-357220a3da7c" name="ProML">
      <concept id="2708398504493198248" name="ProML.structure.User" flags="ng" index="R4w6Z">
        <property id="2708398504493198253" name="userType" index="R4w6U" />
        <property id="2708398504493198251" name="username" index="R4w6W" />
        <child id="2708398504493464150" name="itemProcess" index="R7x11" />
        <child id="2708398504493464147" name="problem" index="R7x14" />
        <child id="2708398504493464145" name="solutions" index="R7x16" />
        <child id="2708398504493464154" name="itemSpecies" index="R7x1d" />
        <child id="2708398504493571047" name="process" index="R7Z7K" />
      </concept>
      <concept id="2708398504493288756" name="ProML.structure.Process" flags="ng" index="R4Usz">
        <property id="2708398504493298430" name="endDate" index="R4TzD" />
        <property id="2708398504493298427" name="startDate" index="R4TzG" />
        <property id="2708398504493298448" name="weight" index="R4T$7" />
        <property id="2708398504493298434" name="status" index="R4T$l" />
        <property id="2708398504493288759" name="description" index="R4Usw" />
        <child id="2708398504493298454" name="actionHistory" index="R4T$1" />
        <child id="2708398504493298457" name="location" index="R4T$e" />
      </concept>
      <concept id="2708398504493288753" name="ProML.structure.ItemProcess" flags="ng" index="R4UsA">
        <property id="2708398504493288754" name="description" index="R4Us_" />
        <reference id="2708398504493985604" name="itemSpecies" index="R1wlj" />
      </concept>
      <concept id="2708398504493288766" name="ProML.structure.ItemSpecies" flags="ng" index="R4UsD">
        <property id="2708398504493288769" name="description" index="R4Utm" />
      </concept>
      <concept id="2708398504493288761" name="ProML.structure.Location" flags="ng" index="R4UsI">
        <property id="2708398504493288764" name="description" index="R4UsF" />
        <property id="2708398504493288827" name="coordinates" index="R4UtG" />
      </concept>
      <concept id="2708398504493288743" name="ProML.structure.Solution" flags="ng" index="R4UsK">
        <property id="2708398504493288746" name="description" index="R4UsX" />
        <reference id="2708398504493985656" name="problem" index="R1wlJ" />
      </concept>
      <concept id="2708398504493288748" name="ProML.structure.Problem" flags="ng" index="R4UsV">
        <property id="2708398504493288751" name="description" index="R4UsS" />
        <reference id="2708398504493985608" name="solution" index="R1wlv" />
      </concept>
      <concept id="2708398504493288771" name="ProML.structure.Action" flags="ng" index="R4Utk">
        <property id="2708398504493288799" name="actionType" index="R4Ut8" />
        <property id="2708398504493288774" name="description" index="R4Uth" />
        <property id="2708398504493288802" name="actionStatus" index="R4UtP" />
        <property id="2708398504493288839" name="endDate" index="R4Uug" />
        <property id="2708398504493288834" name="startDate" index="R4Uul" />
        <reference id="2708398504493940936" name="process" index="R6qFv" />
        <reference id="2708398504493829358" name="problem" index="R6YrT" />
      </concept>
    </language>
  </registry>
  <node concept="R4w6Z" id="2mmaxsiytJl">
    <property role="TrG5h" value="admin" />
    <property role="R4w6W" value="admin1" />
    <property role="R4w6U" value="2mmaxsix2IL/ADMIN" />
    <node concept="R4UsK" id="2mmaxsiytJm" role="R7x16">
      <property role="TrG5h" value="trattamento afidi" />
      <property role="R4UsX" value="trattamento insetticida" />
      <ref role="R1wlJ" node="2mmaxsiytJo" resolve="Afidi" />
    </node>
    <node concept="R4UsV" id="2mmaxsiytJo" role="R7x14">
      <property role="TrG5h" value="Afidi" />
      <property role="R4UsS" value="comparsa di afidi afidi" />
      <ref role="R1wlv" node="2mmaxsiytJm" resolve="trattamento afidi" />
    </node>
    <node concept="R4UsA" id="2mmaxsiytJu" role="R7x11">
      <property role="R4Us_" value="Fagioli rossi" />
      <ref role="R1wlj" node="2mmaxsiytJy" resolve="fagioli" />
    </node>
    <node concept="R4UsD" id="2mmaxsiytJy" role="R7x1d">
      <property role="TrG5h" value="fagioli" />
      <property role="R4Utm" value="fagioli" />
    </node>
  </node>
  <node concept="R4w6Z" id="2mmaxsiySx9">
    <property role="TrG5h" value="coltivatore" />
    <property role="R4w6W" value="colt1" />
    <node concept="R4Usz" id="2mmaxsiySxa" role="R7Z7K">
      <property role="TrG5h" value="fagioli" />
      <property role="R4Usw" value="coltivazione fagioli" />
      <property role="R4TzG" value="01-01-2021" />
      <property role="R4TzD" value="01-01-2022" />
      <property role="R4T$l" value="2mmaxsixrc8/DRAFT" />
      <property role="R4T$7" value="100" />
      <node concept="R4Utk" id="2mmaxsiySxg" role="R4T$1">
        <property role="TrG5h" value="irrigazione" />
        <property role="R4Uth" value="irrigazione giornaliera" />
        <property role="R4UtP" value="2mmaxsixoPh/COMPLETED" />
        <property role="R4Uul" value="01-01-2021" />
        <property role="R4Uug" value="01-01-2021" />
        <ref role="R6YrT" node="2mmaxsiytJo" resolve="Afidi" />
        <ref role="R6qFv" node="2mmaxsiySxa" resolve="fagioli" />
      </node>
      <node concept="R4Utk" id="2mmaxsi$2X1" role="R4T$1">
        <property role="TrG5h" value="report" />
        <property role="R4Uth" value="descrizione" />
        <property role="R4UtP" value="2mmaxsixoPa/PROGRESS" />
        <property role="R4Uul" value="01-01-2020" />
        <property role="R4Uug" value="01-01-2021" />
        <ref role="R6qFv" node="2mmaxsiySxa" resolve="fagioli" />
      </node>
      <node concept="R4Utk" id="38IvoZMUwGn" role="R4T$1">
        <property role="TrG5h" value="trattamento" />
        <property role="R4Uth" value="trattamento afidi con insetticida" />
        <property role="R4Ut8" value="2mmaxsixoPo/SOLUTION" />
        <property role="R4UtP" value="2mmaxsixoPa/PROGRESS" />
        <property role="R4Uul" value="01-01-2020" />
        <property role="R4Uug" value="01-01-2021" />
        <ref role="R6qFv" node="2mmaxsiySxa" resolve="fagioli" />
      </node>
      <node concept="R4UsI" id="2mmaxsiySxi" role="R4T$e">
        <property role="TrG5h" value="orto piccolo" />
        <property role="R4UsF" value="terreno argilloso" />
        <property role="R4UtG" value="10,000-12,000" />
      </node>
    </node>
  </node>
</model>

