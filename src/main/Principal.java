package main;

import datos.AlmacenBeneficios;
import datos.AlmacenBeneficiosEstudiantes;
import datos.AlmacenCarreras;
import datos.AlmacenEstudiantes;
import datos.AlmacenPagosMensuales;
import javax.swing.*;

/** Clase principal. */
public class Principal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AlmacenCarreras repoCarreras = new AlmacenCarreras();
            AlmacenBeneficios repoBeneficios = new AlmacenBeneficios();
            AlmacenEstudiantes repoEstudiantes = new AlmacenEstudiantes();
            AlmacenBeneficiosEstudiantes repoBE = new AlmacenBeneficiosEstudiantes();
            AlmacenPagosMensuales repoPagos = new AlmacenPagosMensuales();

            mainFrame frame = new mainFrame(repoCarreras, repoBeneficios, repoEstudiantes, repoBE, repoPagos);
            frame.setVisible(true);
        });
    }
}
