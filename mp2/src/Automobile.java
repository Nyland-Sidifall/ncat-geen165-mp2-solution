/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class Automobile extends Vehicle{
    private boolean hybrid;
    private int maxPassengers;
    private float trunkSpace;

    /**
     * @return the hybrid
     */
    public boolean isHybrid() {
        return hybrid;
    }

    /**
     * @param hybrid the hybrid to set
     */
    public void setHybrid(boolean hybrid) {
        this.hybrid = hybrid;
    }

    /**
     * @return the maxPassengers
     */
    public int getMaxPassengers() {
        return maxPassengers;
    }

    /**
     * @param maxPassengers the maxPassengers to set
     */
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    /**
     * @return the trunkSpace
     */
    public float getTrunkSpace() {
        return trunkSpace;
    }

    /**
     * @param trunkSpace the trunkSpace to set
     */
    public void setTrunkSpace(float trunkSpace) {
        this.trunkSpace = trunkSpace;
    }
}
