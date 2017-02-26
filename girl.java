/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author darsheel
 */
public class girl {
    private String name;
    private int attractiveness;
    private int maintainance;
    private int intelligence;
    private String type;
    private String boyfriend;
    private boolean status;

    public girl(String name, int attractiveness, int maintainance) {
        this.name = name;
        this.attractiveness = attractiveness;
        this.maintainance = maintainance;
    }

    public String getBoyfriend() {
        return boyfriend;
    }

    public void setBoyfriend(String boyfriend) {
        this.boyfriend = boyfriend;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttractiveness() {
        return attractiveness;
    }

    public void setAttractiveness(int attractiveness) {
        this.attractiveness = attractiveness;
    }

    public int getMaintainance() {
        return maintainance;
    }

    public void setMaintainance(int maintainance) {
        this.maintainance = maintainance;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    
}
