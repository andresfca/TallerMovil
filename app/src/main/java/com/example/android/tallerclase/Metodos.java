package com.example.android.tallerclase;

import android.view.View;

/**
 * Created by Android on 03/10/2017.
 */

public class Metodos {
    public static double calcular(int op_genero, int op_zapato, int op_marca,double cant){
        double resultado=0;

            switch (op_genero){
                case 0:
                    switch (op_zapato){
                        case 0:
                            switch (op_marca){
                                case 0:
                                    resultado=120000*cant;
                                    break;
                                case 1:
                                    resultado=140000*cant;
                                    break;
                                case 2:
                                    resultado=130000*cant;
                                    break;
                            }
                            break;
                        case 1:
                            switch (op_marca){
                                case 0:
                                    resultado=50000*cant;
                                    break;
                                case 1:
                                    resultado=80000*cant;
                                    break;
                                case 2:
                                    resultado=100000*cant;
                                    break;
                            }
                            break;
                    }
                    break;
                case 1:
                    switch (op_zapato){
                        case 0:
                            switch (op_marca){
                                case 0:
                                    resultado=100000*cant;
                                    break;
                                case 1:
                                    resultado=130000*cant;
                                    break;
                                case 2:
                                    resultado=110000*cant;
                                    break;
                            }
                            break;
                        case 1:
                            switch (op_marca){
                                case 0:
                                    resultado=60000*cant;
                                    break;
                                case 1:
                                    resultado=70000*cant;
                                    break;
                                case 2:
                                    resultado=120000*cant;
                                    break;
                            }
                            break;
                    }
                    break;
            }
            return resultado;
    }
}
