package com.static7s.relearning_to_mod.block;


import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class CustomMaterial extends Material {

    public static final CustomMaterial blastglass = (new CustomMaterial(MapColor.airColor)).setTranslucent().setRequiresTool();

    private boolean isTranslucent;
    private boolean requiresNoTool;
    private boolean canBurn;
    private boolean replaceable;
    private int mobilityFlag;
    private MapColor materialMapColor;
    private boolean isAdventureModeExempt;

    public CustomMaterial(MapColor par1MapColor)
    {
        super(par1MapColor);
    }

    /**
     * Returns if blocks of these materials are liquids.
     */
    public boolean isLiquid()
    {
        return false;
    }

    public boolean isSolid()
    {
        return true;
    }

    /**
     * Will prevent grass from growing on dirt underneath and kill any grass below it if it returns true
     */
    public boolean getCanBlockGrass()
    {
        return true;
    }

    /**
     * Returns if this material is considered solid or not
     */
    public boolean blocksMovement()
    {
        return true;
    }

    /**
     * Marks the material as translucent
     */
    private CustomMaterial setTranslucent()
    {
        this.isTranslucent = true;
        return this;
    }

    /**
     * Makes blocks with this material require the correct tool to be harvested.
     */
    protected CustomMaterial setRequiresTool()
    {
        this.requiresNoTool = false;
        return this;
    }

    /**
     * Set the canBurn bool to True and return the current object.
     */
    protected CustomMaterial setBurning()
    {
        this.canBurn = true;
        return this;
    }

    /**
     * Returns if the block can burn or not.
     */
    public boolean getCanBurn()
    {
        return this.canBurn;
    }

    /**
     * Sets {@link #replaceable} to true.
     */
    public CustomMaterial setReplaceable()
    {
        this.replaceable = true;
        return this;
    }

    /**
     * Returns whether the material can be replaced by other blocks when placed - eg snow, vines and tall grass.
     */
    public boolean isReplaceable()
    {
        return this.replaceable;
    }

    /**
     * Indicate if the material is opaque
     */
    public boolean isOpaque()
    {
        return this.isTranslucent ? false : this.blocksMovement();
    }

    /**
     * Returns true if the material can be harvested without a tool (or with the wrong tool)
     */
    public boolean isToolNotRequired()
    {
        return this.requiresNoTool;
    }

    /**
     * Returns the mobility information of the material, 0 = free, 1 = can't push but can move over, 2 = total
     * immobility and stop pistons.
     */
    public int getMaterialMobility()
    {
        return this.mobilityFlag;
    }

    /**
     * This type of material can't be pushed, but pistons can move over it.
     */
    protected CustomMaterial setNoPushMobility()
    {
        this.mobilityFlag = 1;
        return this;
    }

    /**
     * This type of material can't be pushed, and pistons are blocked to move.
     */
    protected CustomMaterial setImmovableMobility()
    {
        this.mobilityFlag = 2;
        return this;
    }

    /**
     * @see #isAdventureModeExempt()
     */
    protected CustomMaterial setAdventureModeExempt()
    {
        this.isAdventureModeExempt = true;
        return this;
    }

    /**
     * Returns true if blocks with this material can always be mined in adventure mode.
     */
    public boolean isAdventureModeExempt()
    {
        return this.isAdventureModeExempt;
    }

    public MapColor getMaterialMapColor()
    {
        return this.materialMapColor;
    }
}

