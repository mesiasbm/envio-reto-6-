/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retovi_mesias;

import model_pkg.Conexion;
import views_pkg.FrameHospitals;

/**
 *
 * @author FAMILIA
 */
public class RetoVI_Mesias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Conexion inst_connect = new Conexion();
        FrameHospitals inst_frame = new FrameHospitals();
        inst_connect.getConnection();
        inst_frame.setVisible(true);
    }    
}
