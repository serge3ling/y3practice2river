/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package y3practice2river;

/**
 *
 * @author alex3
 */
public class River {
    int id;
    int length;
    int depth;
    String name;
    int discharge;
    String continent;
    int basin;
    String imgPath;
    
    public River(int id, int length, int depth, String name, int discharge,
            String continent, int basin, String imgPath) {
        this.id = id;
        this.length = length;
        this.depth = depth;
        this.name = name;
        this.discharge = discharge;
        this.continent = continent;
        this.basin = basin;
        this.imgPath = imgPath;
    }
    
    public long yearDischarge(){
        return 31536000 * discharge / 1000;
    };
}
