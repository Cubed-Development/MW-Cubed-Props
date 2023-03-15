// Date: 2/19/2019 2:43:52 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.paneedah.mwcp.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class OutdoorChair extends ModelBase
{
  //fields
    ModelRenderer chair1;
    ModelRenderer chair2;
    ModelRenderer chair3;
    ModelRenderer chair4;
    ModelRenderer chair5;
    ModelRenderer chair6;
    ModelRenderer chair7;
    ModelRenderer chair8;
    ModelRenderer chair9;
    ModelRenderer chair12;
    ModelRenderer chair13;
    ModelRenderer chair14;
  
  public OutdoorChair()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      chair1 = new ModelRenderer(this, 0, 0);
      chair1.addBox(0F, 0F, 0F, 12, 3, 12);
      chair1.setRotationPoint(-6F, 13F, -6F);
      chair1.setTextureSize(128, 128);
      chair1.mirror = true;
      setRotation(chair1, 0F, 0F, 0F);
      chair2 = new ModelRenderer(this, 0, 50);
      chair2.addBox(0F, 0F, 0F, 1, 3, 12);
      chair2.setRotationPoint(-7F, 14F, -6F);
      chair2.setTextureSize(128, 128);
      chair2.mirror = true;
      setRotation(chair2, 0F, 0F, 0F);
      chair3 = new ModelRenderer(this, 0, 50);
      chair3.addBox(0F, 0F, 0F, 1, 3, 12);
      chair3.setRotationPoint(6F, 14F, -6F);
      chair3.setTextureSize(128, 128);
      chair3.mirror = true;
      setRotation(chair3, 0F, 0F, 0F);
      chair4 = new ModelRenderer(this, 0, 50);
      chair4.addBox(0F, 0F, 0F, 2, 11, 2);
      chair4.setRotationPoint(5F, 14F, -6.3F);
      chair4.setTextureSize(128, 128);
      chair4.mirror = true;
      setRotation(chair4, 0F, 0F, -0.1115358F);
      chair5 = new ModelRenderer(this, 0, 50);
      chair5.addBox(-2F, 0F, 0F, 2, 11, 2);
      chair5.setRotationPoint(-5F, 14F, -6.3F);
      chair5.setTextureSize(128, 128);
      chair5.mirror = true;
      setRotation(chair5, 0F, 0F, 0.111544F);
      chair6 = new ModelRenderer(this, 0, 50);
      chair6.addBox(0F, 0F, 0F, 2, 11, 2);
      chair6.setRotationPoint(5.1F, 14F, 4.2F);
      chair6.setTextureSize(128, 128);
      chair6.mirror = true;
      setRotation(chair6, 0.2230717F, 0F, 0F);
      chair7 = new ModelRenderer(this, 0, 50);
      chair7.addBox(0F, 0F, 0F, 2, 11, 2);
      chair7.setRotationPoint(-6.9F, 14F, 4.2F);
      chair7.setTextureSize(128, 128);
      chair7.mirror = true;
      setRotation(chair7, 0.2230717F, 0F, 0F);
      chair8 = new ModelRenderer(this, 0, 0);
      chair8.addBox(0F, 0F, 0F, 12, 12, 2);
      chair8.setRotationPoint(-6F, 16F, 6F);
      chair8.setTextureSize(128, 128);
      chair8.mirror = true;
      setRotation(chair8, 2.825574F, 0F, 0F);
      chair9 = new ModelRenderer(this, 0, 50);
      chair9.addBox(0F, 0F, 0F, 4, 1, 2);
      chair9.setRotationPoint(6F, 14F, -6.3F);
      chair9.setTextureSize(128, 128);
      chair9.mirror = true;
      setRotation(chair9, 0F, 0F, -1.449966F);
      chair12 = new ModelRenderer(this, 0, 50);
      chair12.addBox(-4F, 0F, 0F, 4, 1, 2);
      chair12.setRotationPoint(-6F, 14F, -6.3F);
      chair12.setTextureSize(128, 128);
      chair12.mirror = true;
      setRotation(chair12, 0F, 0F, 1.449967F);
      chair13 = new ModelRenderer(this, 0, 50);
      chair13.addBox(3.3F, -0.9F, -0.1F, 1, 2, 13);
      chair13.setRotationPoint(6F, 14F, -6.3F);
      chair13.setTextureSize(128, 128);
      chair13.mirror = true;
      setRotation(chair13, 0F, 0F, -1.449966F);
      chair14 = new ModelRenderer(this, 0, 50);
      chair14.addBox(-4.4F, 0.1F, -0.1F, 1, 2, 13);
      chair14.setRotationPoint(-5F, 14F, -6.3F);
      chair14.setTextureSize(128, 128);
      chair14.mirror = true;
      setRotation(chair14, 0F, 0F, 1.449967F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    chair1.render(f5);
    chair2.render(f5);
    chair3.render(f5);
    chair4.render(f5);
    chair5.render(f5);
    chair6.render(f5);
    chair7.render(f5);
    chair8.render(f5);
    chair9.render(f5);
    chair12.render(f5);
    chair13.render(f5);
    chair14.render(f5);
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
