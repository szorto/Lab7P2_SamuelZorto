package lab7p2_samuelzorto;

import javax.swing.JProgressBar;

public class hiloBarra extends Thread {

    private JProgressBar barra;
    private boolean vive;
    private double tamanio;

    public hiloBarra() {
    }

    public hiloBarra(JProgressBar barra, boolean vive) {
        this.barra = barra;
        this.vive = vive;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public void run() {
        double a = 100000000 / tamanio;
        while (true) {
            if (vive) {
                barra.setValue((int) (barra.getValue() + a));

                if (barra.getValue() == 100000000) {
                    vive = false;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }

}
