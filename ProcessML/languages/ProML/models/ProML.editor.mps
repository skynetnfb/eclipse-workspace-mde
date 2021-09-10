<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:9312cc3d-3f81-456c-9f89-4cf8f11899bf(ProML.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="7cns" ref="r:e8a1240a-f052-4011-8f7f-dd8a47d16649(ProML.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186403694788" name="jetbrains.mps.lang.editor.structure.ColorStyleClassItem" flags="ln" index="VaVBg">
        <property id="1186403713874" name="color" index="Vb096" />
      </concept>
      <concept id="1186404549998" name="jetbrains.mps.lang.editor.structure.ForegroundColorStyleClassItem" flags="ln" index="VechU" />
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1233758997495" name="jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem" flags="ln" index="11L4FC" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1236262245656" name="jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem" flags="ln" index="3mYdg7">
        <property id="1238091709220" name="labelName" index="1413C4" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="2mmaxsi$3Zl">
    <ref role="1XX52x" to="7cns:2mmaxsixoP3" resolve="Action" />
    <node concept="3EZMnI" id="2mmaxsi$417" role="2wV5jI">
      <node concept="l2Vlx" id="2mmaxsi$418" role="2iSdaV" />
      <node concept="3F0ifn" id="2mmaxsi$419" role="3EZMnx">
        <property role="3F0ifm" value="action" />
        <node concept="VechU" id="38IvoZMV3A_" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="3F0A7n" id="2mmaxsi$41a" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="2mmaxsi$41b" role="3EZMnx">
        <property role="3F0ifm" value="problem" />
        <node concept="VechU" id="38IvoZMV3AH" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="1iCGBv" id="2mmaxsi$41c" role="3EZMnx">
        <ref role="1NtTu8" to="7cns:2mmaxsizsNI" resolve="problem" />
        <node concept="1sVBvm" id="2mmaxsi$41f" role="1sWHZn">
          <node concept="3F0A7n" id="2mmaxsi$41h" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2mmaxsi$41i" role="3EZMnx">
        <property role="3F0ifm" value="solution" />
        <node concept="VechU" id="38IvoZMV3AJ" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="1iCGBv" id="2mmaxsi$41j" role="3EZMnx">
        <ref role="1NtTu8" to="7cns:2mmaxsizS35" resolve="solution" />
        <node concept="1sVBvm" id="2mmaxsi$41m" role="1sWHZn">
          <node concept="3F0A7n" id="2mmaxsi$41o" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2mmaxsi$41p" role="3EZMnx">
        <property role="3F0ifm" value="process" />
        <node concept="VechU" id="38IvoZMV3AN" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="1iCGBv" id="2mmaxsi$41q" role="3EZMnx">
        <ref role="1NtTu8" to="7cns:2mmaxsizS38" resolve="process" />
        <node concept="1sVBvm" id="2mmaxsi$41t" role="1sWHZn">
          <node concept="3F0A7n" id="2mmaxsi$41v" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2mmaxsi$41w" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="2mmaxsi$41x" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="2mmaxsi$41y" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="2mmaxsi$41z" role="3EZMnx">
        <node concept="l2Vlx" id="2mmaxsi$41$" role="2iSdaV" />
        <node concept="lj46D" id="2mmaxsi$41_" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="2mmaxsi$41A" role="3EZMnx">
          <property role="3F0ifm" value="description" />
          <node concept="VechU" id="38IvoZMV3AB" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="2mmaxsi$41B" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2mmaxsi$41C" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2mmaxsi$41D" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixoP6" resolve="description" />
          <node concept="ljvvj" id="2mmaxsi$41E" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2mmaxsi$41F" role="3EZMnx">
          <property role="3F0ifm" value="action type" />
          <node concept="VechU" id="38IvoZMV3AD" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="2mmaxsi$41G" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2mmaxsi$41H" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2mmaxsi$41I" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixoPv" resolve="actionType" />
          <node concept="ljvvj" id="2mmaxsi$41J" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2mmaxsi$41K" role="3EZMnx">
          <property role="3F0ifm" value="action status" />
          <node concept="VechU" id="38IvoZMV3AF" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="2mmaxsi$41L" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2mmaxsi$41M" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2mmaxsi$41N" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixoPy" resolve="actionStatus" />
          <node concept="ljvvj" id="2mmaxsi$41O" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2mmaxsi$41P" role="3EZMnx">
          <property role="3F0ifm" value="start date" />
          <node concept="VechU" id="38IvoZMV3AQ" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="2mmaxsi$41Q" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2mmaxsi$41R" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2mmaxsi$41S" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixoQ2" resolve="startDate" />
          <node concept="ljvvj" id="2mmaxsi$41T" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2mmaxsi$41U" role="3EZMnx">
          <property role="3F0ifm" value="end date" />
          <node concept="VechU" id="38IvoZMV3AS" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="2mmaxsi$41V" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2mmaxsi$41W" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2mmaxsi$41X" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixoQ7" resolve="endDate" />
          <node concept="ljvvj" id="2mmaxsi$41Y" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2mmaxsi$41Z" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="2mmaxsi$420" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2mmaxsi$42M">
    <ref role="1XX52x" to="7cns:2mmaxsixoOL" resolve="ItemProcess" />
    <node concept="3EZMnI" id="2mmaxsi$42O" role="2wV5jI">
      <node concept="l2Vlx" id="2mmaxsi$42P" role="2iSdaV" />
      <node concept="3F0ifn" id="2mmaxsi$42Q" role="3EZMnx">
        <property role="3F0ifm" value="item process" />
        <node concept="VechU" id="38IvoZMV3AU" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="2mmaxsi$42R" role="3EZMnx">
        <property role="3F0ifm" value="item species" />
        <node concept="VechU" id="38IvoZMV3AW" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="1iCGBv" id="2mmaxsi$42S" role="3EZMnx">
        <ref role="1NtTu8" to="7cns:2mmaxsi$2X4" resolve="itemSpecies" />
        <node concept="1sVBvm" id="2mmaxsi$42V" role="1sWHZn">
          <node concept="3F0A7n" id="2mmaxsi$42X" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2mmaxsi$42Y" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="2mmaxsi$42Z" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="2mmaxsi$430" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="2mmaxsi$431" role="3EZMnx">
        <node concept="l2Vlx" id="2mmaxsi$432" role="2iSdaV" />
        <node concept="lj46D" id="2mmaxsi$433" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="2mmaxsi$434" role="3EZMnx">
          <property role="3F0ifm" value="description" />
          <node concept="VechU" id="38IvoZMV3AY" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="2mmaxsi$435" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2mmaxsi$436" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2mmaxsi$437" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixoOM" resolve="description" />
          <node concept="ljvvj" id="2mmaxsi$438" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2mmaxsi$439" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="2mmaxsi$43a" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2mmaxsi$43v">
    <ref role="1XX52x" to="7cns:2mmaxsixoOY" resolve="ItemSpecies" />
    <node concept="3EZMnI" id="2mmaxsi$43x" role="2wV5jI">
      <node concept="l2Vlx" id="2mmaxsi$43y" role="2iSdaV" />
      <node concept="3F0ifn" id="2mmaxsi$43z" role="3EZMnx">
        <property role="3F0ifm" value="item species" />
      </node>
      <node concept="3F0A7n" id="2mmaxsi$43$" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="2mmaxsi$43_" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="2mmaxsi$43A" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="2mmaxsi$43B" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="2mmaxsi$43C" role="3EZMnx">
        <node concept="l2Vlx" id="2mmaxsi$43D" role="2iSdaV" />
        <node concept="lj46D" id="2mmaxsi$43E" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="2mmaxsi$43F" role="3EZMnx">
          <property role="3F0ifm" value="description" />
        </node>
        <node concept="3F0ifn" id="2mmaxsi$43G" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2mmaxsi$43H" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2mmaxsi$43I" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixoP1" resolve="description" />
          <node concept="ljvvj" id="2mmaxsi$43J" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2mmaxsi$43K" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="2mmaxsi$43L" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2mmaxsi$443">
    <ref role="1XX52x" to="7cns:2mmaxsixoOT" resolve="Location" />
    <node concept="3EZMnI" id="2mmaxsi$445" role="2wV5jI">
      <node concept="l2Vlx" id="2mmaxsi$446" role="2iSdaV" />
      <node concept="3F0ifn" id="2mmaxsi$447" role="3EZMnx">
        <property role="3F0ifm" value="location" />
      </node>
      <node concept="3F0A7n" id="2mmaxsi$448" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="2mmaxsi$449" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="2mmaxsi$44a" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="2mmaxsi$44b" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="2mmaxsi$44c" role="3EZMnx">
        <node concept="l2Vlx" id="2mmaxsi$44d" role="2iSdaV" />
        <node concept="lj46D" id="2mmaxsi$44e" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="2mmaxsi$44f" role="3EZMnx">
          <property role="3F0ifm" value="description" />
        </node>
        <node concept="3F0ifn" id="2mmaxsi$44g" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2mmaxsi$44h" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2mmaxsi$44i" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixoOW" resolve="description" />
          <node concept="ljvvj" id="2mmaxsi$44j" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2mmaxsi$44k" role="3EZMnx">
          <property role="3F0ifm" value="coordinates" />
        </node>
        <node concept="3F0ifn" id="2mmaxsi$44l" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2mmaxsi$44m" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2mmaxsi$44n" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixoPV" resolve="coordinates" />
          <node concept="ljvvj" id="2mmaxsi$44o" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2mmaxsi$44p" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="2mmaxsi$44q" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="38IvoZMTM_1">
    <ref role="1XX52x" to="7cns:2mmaxsixoOB" resolve="Solution" />
    <node concept="3EZMnI" id="38IvoZMTM_3" role="2wV5jI">
      <node concept="l2Vlx" id="38IvoZMTM_4" role="2iSdaV" />
      <node concept="3F0ifn" id="38IvoZMTM_5" role="3EZMnx">
        <property role="3F0ifm" value="solution" />
      </node>
      <node concept="3F0A7n" id="38IvoZMTM_6" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="38IvoZMTM_7" role="3EZMnx">
        <property role="3F0ifm" value="problem" />
      </node>
      <node concept="1iCGBv" id="38IvoZMTM_8" role="3EZMnx">
        <ref role="1NtTu8" to="7cns:2mmaxsi$2XS" resolve="problem" />
        <node concept="1sVBvm" id="38IvoZMTM_b" role="1sWHZn">
          <node concept="3F0A7n" id="38IvoZMTM_d" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="38IvoZMTM_e" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="38IvoZMTM_f" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="38IvoZMTM_g" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="38IvoZMTM_h" role="3EZMnx">
        <node concept="l2Vlx" id="38IvoZMTM_i" role="2iSdaV" />
        <node concept="lj46D" id="38IvoZMTM_j" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTM_k" role="3EZMnx">
          <property role="3F0ifm" value="description" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTM_l" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTM_m" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="38IvoZMTM_n" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixoOE" resolve="description" />
          <node concept="ljvvj" id="38IvoZMTM_o" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="38IvoZMTM_p" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="38IvoZMTM_q" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="38IvoZMTM_K">
    <ref role="1XX52x" to="7cns:2mmaxsix2IC" resolve="User" />
    <node concept="3EZMnI" id="38IvoZMTM_M" role="2wV5jI">
      <node concept="l2Vlx" id="38IvoZMTM_N" role="2iSdaV" />
      <node concept="3F0ifn" id="38IvoZMTM_O" role="3EZMnx">
        <property role="3F0ifm" value="user" />
      </node>
      <node concept="3F0A7n" id="38IvoZMTM_P" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="38IvoZMTM_Q" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="38IvoZMTM_R" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="38IvoZMTM_S" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="38IvoZMTM_T" role="3EZMnx">
        <node concept="l2Vlx" id="38IvoZMTM_U" role="2iSdaV" />
        <node concept="lj46D" id="38IvoZMTM_V" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTM_W" role="3EZMnx">
          <property role="3F0ifm" value="username" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTM_X" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTM_Y" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="38IvoZMTM_Z" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsix2IF" resolve="username" />
          <node concept="ljvvj" id="38IvoZMTMA0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTMA1" role="3EZMnx">
          <property role="3F0ifm" value="user type" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTMA2" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTMA3" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="38IvoZMTMA4" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsix2IH" resolve="userType" />
          <node concept="ljvvj" id="38IvoZMTMA5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTMA6" role="3EZMnx">
          <node concept="ljvvj" id="38IvoZMTMA7" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTMA8" role="3EZMnx">
          <property role="3F0ifm" value="solutions" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTMA9" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTMAa" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTMAb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="38IvoZMTMAc" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsiy3Dh" resolve="solutions" />
          <node concept="l2Vlx" id="38IvoZMTMAd" role="2czzBx" />
          <node concept="pj6Ft" id="38IvoZMTMAe" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="38IvoZMTMAf" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTMAg" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTMAh" role="3EZMnx">
          <node concept="ljvvj" id="38IvoZMTMAi" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTMAj" role="3EZMnx">
          <property role="3F0ifm" value="problem" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTMAk" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTMAl" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTMAm" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="38IvoZMTMAn" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsiy3Dj" resolve="problem" />
          <node concept="l2Vlx" id="38IvoZMTMAo" role="2czzBx" />
          <node concept="pj6Ft" id="38IvoZMTMAp" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="38IvoZMTMAq" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTMAr" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTMAs" role="3EZMnx">
          <node concept="ljvvj" id="38IvoZMTMAt" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTMAu" role="3EZMnx">
          <property role="3F0ifm" value="item process" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTMAv" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTMAw" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTMAx" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="38IvoZMTMAy" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsiy3Dm" resolve="itemProcess" />
          <node concept="l2Vlx" id="38IvoZMTMAz" role="2czzBx" />
          <node concept="pj6Ft" id="38IvoZMTMA$" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="38IvoZMTMA_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTMAA" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTMAB" role="3EZMnx">
          <node concept="ljvvj" id="38IvoZMTMAC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTMAD" role="3EZMnx">
          <property role="3F0ifm" value="item species" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTMAE" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTMAF" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTMAG" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="38IvoZMTMAH" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsiy3Dq" resolve="itemSpecies" />
          <node concept="l2Vlx" id="38IvoZMTMAI" role="2czzBx" />
          <node concept="pj6Ft" id="38IvoZMTMAJ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="38IvoZMTMAK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTMAL" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTMAM" role="3EZMnx">
          <node concept="ljvvj" id="38IvoZMTMAN" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTMAO" role="3EZMnx">
          <property role="3F0ifm" value="process" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTMAP" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTMAQ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTMAR" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F1sOY" id="38IvoZMTMAS" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsiytJB" resolve="process" />
          <node concept="lj46D" id="38IvoZMTMAT" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTMAU" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="38IvoZMTMAV" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="38IvoZMTMAW" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="38IvoZMTMCy">
    <ref role="1XX52x" to="7cns:2mmaxsixoOG" resolve="Problem" />
    <node concept="3EZMnI" id="38IvoZMTMC$" role="2wV5jI">
      <node concept="l2Vlx" id="38IvoZMTMC_" role="2iSdaV" />
      <node concept="3F0ifn" id="38IvoZMTMCA" role="3EZMnx">
        <property role="3F0ifm" value="problem" />
      </node>
      <node concept="3F0A7n" id="38IvoZMTMCB" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="38IvoZMTMCC" role="3EZMnx">
        <property role="3F0ifm" value="solution" />
      </node>
      <node concept="1iCGBv" id="38IvoZMTMCD" role="3EZMnx">
        <ref role="1NtTu8" to="7cns:2mmaxsi$2X8" resolve="solution" />
        <node concept="1sVBvm" id="38IvoZMTMCG" role="1sWHZn">
          <node concept="3F0A7n" id="38IvoZMTMCI" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="38IvoZMTMCJ" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="38IvoZMTMCK" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="38IvoZMTMCL" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="38IvoZMTMCM" role="3EZMnx">
        <node concept="l2Vlx" id="38IvoZMTMCN" role="2iSdaV" />
        <node concept="lj46D" id="38IvoZMTMCO" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTMCP" role="3EZMnx">
          <property role="3F0ifm" value="description" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTMCQ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTMCR" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="38IvoZMTMCS" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixoOJ" resolve="description" />
          <node concept="ljvvj" id="38IvoZMTMCT" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="38IvoZMTMCU" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="38IvoZMTMCV" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="38IvoZMTRxm">
    <ref role="1XX52x" to="7cns:2mmaxsixoOO" resolve="Process" />
    <node concept="3EZMnI" id="38IvoZMTRxo" role="2wV5jI">
      <node concept="l2Vlx" id="38IvoZMTRxp" role="2iSdaV" />
      <node concept="3F0ifn" id="38IvoZMTRxq" role="3EZMnx">
        <property role="3F0ifm" value="process" />
        <node concept="VechU" id="38IvoZMUwHf" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="3F0A7n" id="38IvoZMTRxr" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="38IvoZMTRxs" role="3EZMnx">
        <property role="3F0ifm" value="item process" />
        <node concept="VechU" id="38IvoZMUwHr" role="3F10Kt">
          <property role="Vb096" value="g1_qVrt/darkMagenta" />
        </node>
      </node>
      <node concept="1iCGBv" id="38IvoZMTRxt" role="3EZMnx">
        <ref role="1NtTu8" to="7cns:38IvoZMTMCa" resolve="itemProcess" />
        <node concept="1sVBvm" id="38IvoZMTRxw" role="1sWHZn">
          <node concept="3F0A7n" id="38IvoZMTRxy" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="38IvoZMTRxz" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="38IvoZMTRx$" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="38IvoZMTRx_" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="38IvoZMTRxA" role="3EZMnx">
        <node concept="l2Vlx" id="38IvoZMTRxB" role="2iSdaV" />
        <node concept="lj46D" id="38IvoZMTRxC" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="38IvoZMTRxD" role="3EZMnx">
          <property role="3F0ifm" value="description" />
          <node concept="VechU" id="38IvoZMUwHh" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRxE" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTRxF" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="38IvoZMTRxG" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixoOR" resolve="description" />
          <node concept="ljvvj" id="38IvoZMTRxH" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRxI" role="3EZMnx">
          <property role="3F0ifm" value="start date" />
          <node concept="VechU" id="38IvoZMUwHj" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRxJ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTRxK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="38IvoZMTRxL" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixrbV" resolve="startDate" />
          <node concept="ljvvj" id="38IvoZMTRxM" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRxN" role="3EZMnx">
          <property role="3F0ifm" value="end date" />
          <node concept="VechU" id="38IvoZMUwHl" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRxO" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTRxP" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="38IvoZMTRxQ" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixrbY" resolve="endDate" />
          <node concept="ljvvj" id="38IvoZMTRxR" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRxS" role="3EZMnx">
          <property role="3F0ifm" value="status" />
          <node concept="VechU" id="38IvoZMUwHn" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRxT" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTRxU" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="38IvoZMTRxV" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixrc2" resolve="status" />
          <node concept="ljvvj" id="38IvoZMTRxW" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRxX" role="3EZMnx">
          <property role="3F0ifm" value="weight" />
          <node concept="VechU" id="38IvoZMUwHp" role="3F10Kt">
            <property role="Vb096" value="g1_qRwE/darkGreen" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRxY" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTRxZ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="38IvoZMTRy0" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixrcg" resolve="weight" />
          <node concept="ljvvj" id="38IvoZMTRy1" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRy2" role="3EZMnx">
          <node concept="ljvvj" id="38IvoZMTRy3" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRy4" role="3EZMnx">
          <property role="3F0ifm" value="action history" />
          <node concept="VechU" id="38IvoZMUwHt" role="3F10Kt">
            <property role="Vb096" value="g1_qVrt/darkMagenta" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRy5" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTRy6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTRy7" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="38IvoZMTRy8" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixrcm" resolve="actionHistory" />
          <node concept="l2Vlx" id="38IvoZMTRy9" role="2czzBx" />
          <node concept="pj6Ft" id="38IvoZMTRya" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="38IvoZMTRyb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTRyc" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRyd" role="3EZMnx">
          <node concept="ljvvj" id="38IvoZMTRye" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRyf" role="3EZMnx">
          <property role="3F0ifm" value="location" />
          <node concept="VechU" id="38IvoZMUwHv" role="3F10Kt">
            <property role="Vb096" value="g1_qVrt/darkMagenta" />
          </node>
        </node>
        <node concept="3F0ifn" id="38IvoZMTRyg" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="38IvoZMTRyh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTRyi" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F1sOY" id="38IvoZMTRyj" role="3EZMnx">
          <ref role="1NtTu8" to="7cns:2mmaxsixrcp" resolve="location" />
          <node concept="lj46D" id="38IvoZMTRyk" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="38IvoZMTRyl" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="38IvoZMTRym" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="38IvoZMTRyn" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
</model>

