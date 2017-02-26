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
public class boy {
    private String name;
    private int min_attractiveness;
    private int budget;
    private String type;
    private boolean status=true;
    private String girlfriend;

    public boy(String name, int min_attractiveness, int budget) {
        this.name = name;
        this.min_attractiveness = min_attractiveness;
        this.budget = budget;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getGirlfriend() {
        return girlfriend;
    }

    public void setGirlfriend(String girlfriend) {
        this.girlfriend = girlfriend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMin_attractiveness() {
        return min_attractiveness;
    }

    public void setMin_attractiveness(int min_attractiveness) {
        this.min_attractiveness = min_attractiveness;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
