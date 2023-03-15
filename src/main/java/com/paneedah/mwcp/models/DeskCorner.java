// Date: 2/16/2019 7:13:19 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.paneedah.mwcp.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DeskCorner extends ModelBase
{
  //fields
    ModelRenderer desk1;
    ModelRenderer desk2;
    ModelRenderer desk3;
    ModelRenderer desk4;
  
  public DeskCorner()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      desk1 = new ModelRenderer(this, 0, 0);
      desk1.addBox(0F, 0F, 0F, 15, 15, 1);
      desk1.setRotationPoint(-7F, 8F, 6.5F);
      desk1.setTextureSize(64, 32);
      desk1.mirror = true;
      setRotation(desk1, 0F, 0F, 0F);
      desk2 = new ModelRenderer(this, 0, 0);
      desk2.addBox(0F, 0F, 0F, 15, 4, 14);
      desk2.setRotationPoint(-7F, 8F, -7F);
      desk2.setTextureSize(64, 32);
      desk2.mirror = true;
      setRotation(desk2, 0F, 0F, 0F);
      desk3 = new ModelRenderer(this, 0, 0);
      desk3.addBox(0F, 0F, 0F, 1, 15, 14);
      desk3.setRotationPoint(-7.5F, 8F, -7F);
      desk3.setTextureSize(64, 32);
      desk3.mirror = true;
      setRotation(desk3, 0F, 0F, 0F);
      desk4 = new ModelRenderer(this, 0, 0);
      desk4.addBox(0F, 0F, 0F, 2, 16, 2);
      desk4.setRotationPoint(-7.6F, 8.05F, 5.6F);
      desk4.setTextureSize(64, 32);
      desk4.mirror = true;
      setRotation(desk4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    desk1.render(f5);
    desk2.render(f5);
    desk3.render(f5);
    desk4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
