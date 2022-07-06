package main;

import java.util.Objects;

public class Calculadora {
    //Entrada
    private String numFuente;
    private String fuente1;
    private String fuente2;
    private String fuente3;
    private String fuente4;
    private String numResistecia;
    private String resistencia1;
    private String resistencia2;
    private String resistencia3;
    private String resistencia4;
    private String resistencia5;
    private String resistencia6;
    private boolean existeIntesidad;
    private String intesidad;

    //Salida
    private String voltajeTotal;
    private String resistenciaTotal;
    private String intesidadTotal;
    private String potenciaTotal;
    private String resVolTotal1;
    private String resVolTotal2;
    private String resVolTotal3;
    private String resVolTotal4;
    private String resVolTotal5;
    private String resVolTotal6;
    private String resPotTotal1;
    private String resPotTotal2;
    private String resPotTotal3;
    private String resPotTotal4;
    private String resPotTotal5;
    private String resPotTotal6;
    
    private String circuitoTotal;

    public String getNumFuente() {
        return numFuente;
    }

    public void setNumFuente(String numFuente) {
        this.numFuente = numFuente;
    }

    public String getFuente1() {
        return fuente1;
    }

    public void setFuente1(String fuente1) {
        this.fuente1 = fuente1;
    }

    public String getFuente2() {
        return fuente2;
    }

    public void setFuente2(String fuente2) {
        this.fuente2 = fuente2;
    }

    public String getFuente3() {
        return fuente3;
    }

    public void setFuente3(String fuente3) {
        this.fuente3 = fuente3;
    }

    public String getFuente4() {
        return fuente4;
    }

    public void setFuente4(String fuente4) {
        this.fuente4 = fuente4;
    }

    public String getNumResistecia() {
        return numResistecia;
    }

    public void setNumResistecia(String numResistecia) {
        this.numResistecia = numResistecia;
    }

    public String getResistencia1() {
        return resistencia1;
    }

    public void setResistencia1(String resistencia1) {
        this.resistencia1 = resistencia1;
    }

    public String getResistencia2() {
        return resistencia2;
    }

    public void setResistencia2(String resistencia2) {
        this.resistencia2 = resistencia2;
    }

    public String getResistencia3() {
        return resistencia3;
    }

    public void setResistencia3(String resistencia3) {
        this.resistencia3 = resistencia3;
    }

    public String getResistencia4() {
        return resistencia4;
    }

    public void setResistencia4(String resistencia4) {
        this.resistencia4 = resistencia4;
    }

    public String getResistencia5() {
        return resistencia5;
    }

    public void setResistencia5(String resistencia5) {
        this.resistencia5 = resistencia5;
    }

    public String getResistencia6() {
        return resistencia6;
    }

    public void setResistencia6(String resistencia6) {
        this.resistencia6 = resistencia6;
    }

    public boolean getExisteIntesidad() {
        return existeIntesidad;
    }

    public void setExisteIntesidad(boolean existeIntesidad) {
        this.existeIntesidad = existeIntesidad;
    }

    public String getIntesidad() {
        return intesidad;
    }

    public void setIntesidad(String intesidad) {
        this.intesidad = intesidad;
    }

    public String getVoltajeTotal() {
        return voltajeTotal;
    }

    public void setVoltajeTotal(String voltajeTotal) {
        this.voltajeTotal = voltajeTotal;
    }

    public String getResistenciaTotal() {
        return resistenciaTotal;
    }

    public void setResistenciaTotal(String resistenciaTotal) {
        this.resistenciaTotal = resistenciaTotal;
    }

    public String getIntesidadTotal() {
        return intesidadTotal;
    }

    public void setIntesidadTotal(String intesidadTotal) {
        this.intesidadTotal = intesidadTotal;
    }

    public String getPotenciaTotal() {
        return potenciaTotal;
    }

    public void setPotenciaTotal(String potenciaTotal) {
        this.potenciaTotal = potenciaTotal;
    }

    public String getResVolTotal1() {
        return resVolTotal1;
    }

    public void setResVolTotal1(String resVolTotal1) {
        this.resVolTotal1 = resVolTotal1;
    }

    public String getResVolTotal2() {
        return resVolTotal2;
    }

    public void setResVolTotal2(String resVolTotal2) {
        this.resVolTotal2 = resVolTotal2;
    }

    public String getResVolTotal3() {
        return resVolTotal3;
    }

    public void setResVolTotal3(String resVolTotal3) {
        this.resVolTotal3 = resVolTotal3;
    }

    public String getResVolTotal4() {
        return resVolTotal4;
    }

    public void setResVolTotal4(String resVolTotal4) {
        this.resVolTotal4 = resVolTotal4;
    }

    public String getResVolTotal5() {
        return resVolTotal5;
    }

    public void setResVolTotal5(String resVolTotal5) {
        this.resVolTotal5 = resVolTotal5;
    }

    public String getResVolTotal6() {
        return resVolTotal6;
    }

    public void setResVolTotal6(String resVolTotal6) {
        this.resVolTotal6 = resVolTotal6;
    }

    public String getResPotTotal1() {
        return resPotTotal1;
    }

    public void setResPotTotal1(String resPotTotal1) {
        this.resPotTotal1 = resPotTotal1;
    }

    public String getResPotTotal2() {
        return resPotTotal2;
    }

    public void setResPotTotal2(String resPotTotal2) {
        this.resPotTotal2 = resPotTotal2;
    }

    public String getResPotTotal3() {
        return resPotTotal3;
    }

    public void setResPotTotal3(String resPotTotal3) {
        this.resPotTotal3 = resPotTotal3;
    }

    public String getResPotTotal4() {
        return resPotTotal4;
    }

    public void setResPotTotal4(String resPotTotal4) {
        this.resPotTotal4 = resPotTotal4;
    }

    public String getResPotTotal5() {
        return resPotTotal5;
    }

    public void setResPotTotal5(String resPotTotal5) {
        this.resPotTotal5 = resPotTotal5;
    }

    public String getResPotTotal6() {
        return resPotTotal6;
    }

    public void setResPotTotal6(String resPotTotal6) {
        this.resPotTotal6 = resPotTotal6;
    }
    
    public String getcircuitoTotal() {
        return circuitoTotal;
    }

    public void setcircuitoTotal(String circuitoTotal) {
        this.circuitoTotal = circuitoTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.circuitoTotal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Calculadora other = (Calculadora) obj;
        if (!Objects.equals(this.circuitoTotal, other.circuitoTotal)) {
            return false;
        }
        return true;
    }
 
    public Calculadora(){

    }
    
    //Constructor con numFuente, fuente1, fuente2, fuente3, fuente4, numResistecia, resistencia1, resistencia2, resistencia3, resistencia4, resistencia5, resistencia6, existeIntesidad, intesidad
    public Calculadora(String numFuente, String fuente1, String fuente2, String fuente3, String fuente4, String numResistecia, String resistencia1, String resistencia2, String resistencia3, String resistencia4, String resistencia5, String resistencia6, boolean existeIntesidad, String intesidad) {
        this.numFuente = numFuente;
        this.fuente1 = fuente1;
        this.fuente2 = fuente2;
        this.fuente3 = fuente3;
        this.fuente4 = fuente4;
        this.numResistecia = numResistecia;
        this.resistencia1 = resistencia1;
        this.resistencia2 = resistencia2;
        this.resistencia3 = resistencia3;
        this.resistencia4 = resistencia4;
        this.resistencia5 = resistencia5;
        this.resistencia6 = resistencia6;
        this.existeIntesidad = existeIntesidad;
        this.intesidad = intesidad;
    }

    public void calcular(){
        circuitoTotal = "";

        switch(numFuente){
            case "1":
                voltajeTotal = String.valueOf(Float.parseFloat(fuente1));
                circuitoTotal += "Voltaje total: " + voltajeTotal + " V \n";

                switch(numResistecia){
                    case "1":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                        }
                    break;

                    case "2":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";
                            
                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                        }
                    break;

                    case "3":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                        }
                        break;

                    case "4":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3) + Float.parseFloat(resistencia4));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                        }
                        break;

                    case "5":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3) + Float.parseFloat(resistencia4) + Float.parseFloat(resistencia5));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                        }
                        break;

                    case "6":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3) + Float.parseFloat(resistencia4) + Float.parseFloat(resistencia5) + Float.parseFloat(resistencia6));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            resVolTotal6 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia6));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 6: " + resVolTotal6 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal6 = String.valueOf(Float.parseFloat(resistencia6) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 6: " + resPotTotal6 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            resVolTotal6 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia6));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 6: " + resVolTotal6 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal6 = String.valueOf(Float.parseFloat(resistencia6) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 6: " + resPotTotal6 + " W \n";
                        }
                        break;
                    }
            break;

            case "2":
                voltajeTotal = String.valueOf(Float.parseFloat(fuente1) + Float.parseFloat(fuente2));
                circuitoTotal += "Voltaje total: " + voltajeTotal + " V \n";

                switch(numResistecia){
                    case "1":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                        }
                    break;

                    case "2":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";
                            
                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";
                            
                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                        }
                    break;

                    case "3":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                        }
                    break;

                    case "4":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3) + Float.parseFloat(resistencia4));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                        }
                    break;

                    case "5":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3) + Float.parseFloat(resistencia4) + Float.parseFloat(resistencia5));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                        }
                    break;

                    case "6":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3) + Float.parseFloat(resistencia4) + Float.parseFloat(resistencia5) + Float.parseFloat(resistencia6));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            resVolTotal6 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia6));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 6: " + resVolTotal6 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal6 = String.valueOf(Float.parseFloat(resistencia6) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 6: " + resPotTotal6 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            resVolTotal6 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia6));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 6: " + resVolTotal6 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal6 = String.valueOf(Float.parseFloat(resistencia6) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 6: " + resPotTotal6 + " W \n";
                        }
                    break;
                }
            break;

            case "3":
                voltajeTotal = String.valueOf(Float.parseFloat(fuente1) + Float.parseFloat(fuente2) + Float.parseFloat(fuente3));
                circuitoTotal += "Voltaje total: " + voltajeTotal + " V \n";

                switch(numResistecia){
                    case"1":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                        }
                    break;

                    case "2":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";
                            
                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";
                            
                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                        }
                    break;

                    case "3":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                        }
                    break;

                    case "4":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3) + Float.parseFloat(resistencia4));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                        }
                    break;

                    case "5":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3) + Float.parseFloat(resistencia4) + Float.parseFloat(resistencia5));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                        }
                    break;

                    case "6":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3) + Float.parseFloat(resistencia4) + Float.parseFloat(resistencia5) + Float.parseFloat(resistencia6));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            resVolTotal6 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia6));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 6: " + resVolTotal6 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal6 = String.valueOf(Float.parseFloat(resistencia6) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 6: " + resPotTotal6 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            resVolTotal6 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia6));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 6: " + resVolTotal6 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal6 = String.valueOf(Float.parseFloat(resistencia6) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 6: " + resPotTotal6 + " W \n";
                        }
                    break;
                }
                break;

            case "4":
                voltajeTotal = String.valueOf(Float.parseFloat(fuente1) + Float.parseFloat(fuente2) + Float.parseFloat(fuente3) + Float.parseFloat(fuente4));
                circuitoTotal += "Voltaje total: " + voltajeTotal + " V \n";

                switch(numResistecia){
                    case "1":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                        }
                    break;

                    case "2":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";
                            
                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";
                            
                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                        }
                    break;

                    case "3":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                        }
                    break;

                    case "4":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3) + Float.parseFloat(resistencia4));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                        }
                    break;

                    case "5":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3) + Float.parseFloat(resistencia4) + Float.parseFloat(resistencia5));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                        }
                    break;

                    case "6":
                        resistenciaTotal = String.valueOf(Float.parseFloat(resistencia1) + Float.parseFloat(resistencia2) + Float.parseFloat(resistencia3) + Float.parseFloat(resistencia4) + Float.parseFloat(resistencia5) + Float.parseFloat(resistencia6));
                        circuitoTotal += "Resistencia total: " + resistenciaTotal + " Ω \n";

                        if(existeIntesidad){
                            intesidadTotal = String.valueOf(Float.parseFloat(intesidad));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            resVolTotal6 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia6));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 6: " + resVolTotal6 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal6 = String.valueOf(Float.parseFloat(resistencia6) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 6: " + resPotTotal6 + " W \n";
                        }else{
                            intesidadTotal = String.valueOf(Float.parseFloat(voltajeTotal) / Float.parseFloat(resistenciaTotal));
                            circuitoTotal += "Intesidad total: " + intesidadTotal + " A \n";

                            potenciaTotal = String.valueOf(Float.parseFloat(voltajeTotal) * Float.parseFloat(intesidadTotal));
                            circuitoTotal += "Potencia total: " + potenciaTotal + " W \n";

                            resVolTotal1 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia1));
                            resVolTotal2 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia2));
                            resVolTotal3 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia3));
                            resVolTotal4 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia4));
                            resVolTotal5 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia5));
                            resVolTotal6 = String.valueOf(Float.parseFloat(intesidadTotal) * Float.parseFloat(resistencia6));
                            circuitoTotal += "Voltaje de la resistencia 1: " + resVolTotal1 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 2: " + resVolTotal2 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 3: " + resVolTotal3 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 4: " + resVolTotal4 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 5: " + resVolTotal5 + " V \n";
                            circuitoTotal += "Voltaje de la resistencia 6: " + resVolTotal6 + " V \n";

                            resPotTotal1 = String.valueOf(Float.parseFloat(resistencia1) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal2 = String.valueOf(Float.parseFloat(resistencia2) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal3 = String.valueOf(Float.parseFloat(resistencia3) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal4 = String.valueOf(Float.parseFloat(resistencia4) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal5 = String.valueOf(Float.parseFloat(resistencia5) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            resPotTotal6 = String.valueOf(Float.parseFloat(resistencia6) * (Float.parseFloat(intesidadTotal) * Float.parseFloat(intesidadTotal)));
                            circuitoTotal += "Potencia de la resistencia 1: " + resPotTotal1 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 2: " + resPotTotal2 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 3: " + resPotTotal3 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 4: " + resPotTotal4 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 5: " + resPotTotal5 + " W \n";
                            circuitoTotal += "Potencia de la resistencia 6: " + resPotTotal6 + " W \n";
                        }

                }
            break;

        }

    }
     
}
