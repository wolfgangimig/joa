/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetMaterial.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPresetMaterial {
  msoPresetMaterialMixed(-2),
  msoMaterialMatte(1),
  msoMaterialPlastic(2),
  msoMaterialMetal(3),
  msoMaterialWireFrame(4),
  msoMaterialMatte2(5),
  msoMaterialPlastic2(6),
  msoMaterialMetal2(7),
  msoMaterialWarmMatte(8),
  msoMaterialTranslucentPowder(9),
  msoMaterialPowder(10),
  msoMaterialDarkEdge(11),
  msoMaterialSoftEdge(12),
  msoMaterialClear(13),
  msoMaterialFlat(14),
  msoMaterialSoftMetal(15);

  public final int value;
  private MsoPresetMaterial(int value) { this.value = value; }
  public static  MsoPresetMaterial valueOf(int value) {
    switch(value) {
    case -2: return msoPresetMaterialMixed;
    case 1: return msoMaterialMatte;
    case 2: return msoMaterialPlastic;
    case 3: return msoMaterialMetal;
    case 4: return msoMaterialWireFrame;
    case 5: return msoMaterialMatte2;
    case 6: return msoMaterialPlastic2;
    case 7: return msoMaterialMetal2;
    case 8: return msoMaterialWarmMatte;
    case 9: return msoMaterialTranslucentPowder;
    case 10: return msoMaterialPowder;
    case 11: return msoMaterialDarkEdge;
    case 12: return msoMaterialSoftEdge;
    case 13: return msoMaterialClear;
    case 14: return msoMaterialFlat;
    case 15: return msoMaterialSoftMetal;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPresetMaterial.class);
    }
  }
}
