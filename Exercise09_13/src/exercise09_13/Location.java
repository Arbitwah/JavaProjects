/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise09_13;
public class Location {
    public int row;
    public int column;
    public double maxValue;
    
   Location(double[][] a){
        maxValue = a[0][0];
        row = 0;
        column = 0;
       
        for(int i = 0;i<a.length;i++){

            for(int k =0;k<a[i].length;k++){
                if(a[i][k]>maxValue){
                    maxValue = a[i][k];
                    row = i;
                    column=k;
                }
            }
        }
    }
}
