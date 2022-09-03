package lab7p2_alberthgodoy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author godoy
 */
public class administrarPlantasvsZombis {

    private ArrayList lista = new ArrayList();
    private ArrayList listaZombis = new ArrayList();
    private File archivo = null;

    public administrarPlantasvsZombis(String path) {
        archivo = new File(path);
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarPlantvzZombis{" + "lista=" + lista + ", archivo=" + archivo + '}';
    }

    public void escribirArchivo() throws IOException {

    }

    public void cargarArchivoPlanta() {
        FileReader fr = null;
        BufferedReader br = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String archivoTexto = br.readLine();
                //Agrega cada tipodePlanta
                String[] tiposPlantas = archivoTexto.split("\\|");
                //Recorre esa planta en un for
                for (int i = 0; i < tiposPlantas.length; i++) {
                    tiposPlantas[i] += "|";
                    //obtenemos el indice
                    int indiceInicio = 0;
                    int indiceFinal = 0;
                    //Obtener indice
                    if (tiposPlantas[i].contains("Disparo")) {
                        indiceInicio = tiposPlantas[i].indexOf("Disparo");
                        indiceFinal = indiceInicio + 7;
                    } else if (tiposPlantas[i].contains("Defensa")) {
                        indiceInicio = tiposPlantas[i].indexOf("Defensa");
                        indiceFinal = indiceInicio + 7;
                    } else if (tiposPlantas[i].contains("Explosiva")) {
                        indiceInicio = tiposPlantas[i].indexOf("Explosiva");
                        indiceFinal = indiceInicio + 9;
                    }
                    //Obtener los tipos de plantas
                    String tipoPlanta = tiposPlantas[i].substring(indiceInicio, indiceFinal);
                    //Variables
                    String nombrePlanta = "";
                    int ataquePlanta = 0;
                    int vidaPlanta = 0;
                    String rangoPlanta = "";

                    //Obtenemos el nombre
                    int indiceInicioNombre = 0;
                    int indiceFinalNombre = 0;
                    if (tiposPlantas[i].contains("Nombre=")) {
                        indiceInicioNombre = tiposPlantas[i].indexOf("Nombre=") + 7;
                        if (tiposPlantas[i].substring(indiceInicioNombre).contains(",")) {
                            indiceFinalNombre = tiposPlantas[i].indexOf(",", indiceInicioNombre);
                        } else if (tiposPlantas[i].substring(indiceInicioNombre).contains("_")) {
                            indiceFinalNombre = tiposPlantas[i].indexOf("_", indiceInicioNombre);
                        } else if (tiposPlantas[i].substring(indiceInicioNombre).contains("|")) {
                            indiceFinalNombre = tiposPlantas[i].indexOf("|", indiceInicioNombre);
                        }
                        nombrePlanta = tiposPlantas[i].substring(indiceInicioNombre, indiceFinalNombre);
                    }
                    //Obtenemos la vida de la planta
                    if (tiposPlantas[i].contains("Ataque=")) {
                        indiceInicioNombre = tiposPlantas[i].indexOf("Ataque=") + 7;

                        if (tiposPlantas[i].substring(indiceInicioNombre).contains(",")) {
                            indiceFinalNombre = tiposPlantas[i].indexOf(",", indiceInicioNombre);
                        } else if (tiposPlantas[i].substring(indiceInicioNombre).contains("_")) {
                            indiceFinalNombre = tiposPlantas[i].indexOf("_", indiceInicioNombre);
                        } else if (tiposPlantas[i].substring(indiceInicioNombre).contains("|")) {
                            indiceFinalNombre = tiposPlantas[i].indexOf("|", indiceInicioNombre);
                        }
                        ataquePlanta = Integer.parseInt(tiposPlantas[i].substring(indiceInicioNombre, indiceFinalNombre));
                    }
                    //Agregar la vida de una planta
                    if (tiposPlantas[i].contains("Vida=")) {
                        indiceInicioNombre = tiposPlantas[i].indexOf("Vida=") + 5;
                        if (tiposPlantas[i].substring(indiceInicioNombre).contains(",")) {
                            indiceFinalNombre = tiposPlantas[i].indexOf(",", indiceInicioNombre);
                        } else if (tiposPlantas[i].substring(indiceInicioNombre).contains("_")) {
                            indiceFinalNombre = tiposPlantas[i].indexOf("_", indiceInicioNombre);
                        } else if (tiposPlantas[i].substring(indiceInicioNombre).contains("|")) {
                            indiceFinalNombre = tiposPlantas[i].indexOf("|", indiceInicioNombre);
                        }
                        vidaPlanta = Integer.parseInt(tiposPlantas[i].substring(indiceInicioNombre, indiceFinalNombre));

                    }

                    //Agregamos al tipo de planta
                    if (tiposPlantas[i].contains("Disparo")) {
                        //nombreProyectil
                        String nombreProyectil = "";
                        if (tiposPlantas[i].contains("Proyectil=")) {
                            indiceInicioNombre = tiposPlantas[i].indexOf("Proyectil=") + 10;
                            if (tiposPlantas[i].substring(indiceInicioNombre).contains(";")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf(";", indiceInicioNombre);
                            } else if (tiposPlantas[i].substring(indiceInicioNombre).contains(")")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf(")", indiceInicioNombre);
                            } else if (tiposPlantas[i].substring(indiceInicioNombre).contains("|")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf("|", indiceInicioNombre);
                            }
                            nombreProyectil = tiposPlantas[i].substring(indiceInicioNombre, indiceFinalNombre);

                        }
                        //NombreColor
                        String Color = "";
                        if (tiposPlantas[i].contains("Color=")) {
                            indiceInicioNombre = tiposPlantas[i].indexOf("Color=") + 6;
                            if (tiposPlantas[i].substring(indiceInicioNombre).contains(";")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf(";", indiceInicioNombre);
                            } else if (tiposPlantas[i].substring(indiceInicioNombre).contains(")")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf(")", indiceInicioNombre);
                            } else if (tiposPlantas[i].substring(indiceInicioNombre).contains("|")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf("|", indiceInicioNombre);
                            }
                            Color = tiposPlantas[i].substring(indiceInicioNombre, indiceFinalNombre);
                        }
                        //Agregarlo
                        lista.add(new Disparo(nombreProyectil, Color, nombrePlanta, ataquePlanta, vidaPlanta));
                        System.out.println("Disparo Agregado");
                    } else if (tiposPlantas[i].contains("Defensa")) {
                        //Defensa
                        //Altura
                        int altura = 0;
                        int dureza = 0;
                        int peso = 0;
                        if (tiposPlantas[i].contains("Altura=")) {
                            indiceInicioNombre = tiposPlantas[i].indexOf("Altura=") + 7;
                            if (tiposPlantas[i].substring(indiceInicioNombre).contains(";")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf(";", indiceInicioNombre);
                            } else if (tiposPlantas[i].substring(indiceInicioNombre).contains(")")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf(")", indiceInicioNombre);
                            } else if (tiposPlantas[i].substring(indiceInicioNombre).contains("|")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf("|", indiceInicioNombre);
                            }
                            altura = Integer.parseInt(tiposPlantas[i].substring(indiceInicioNombre, indiceFinalNombre));

                        }
                        //NivelDureza
                        if (tiposPlantas[i].contains("Dureza=")) {
                            indiceInicioNombre = tiposPlantas[i].indexOf("Dureza=") + 7;
                            if (tiposPlantas[i].substring(indiceInicioNombre).contains(";")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf(";", indiceInicioNombre);
                            } else if (tiposPlantas[i].substring(indiceInicioNombre).contains(")")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf(")", indiceInicioNombre);
                            } else if (tiposPlantas[i].substring(indiceInicioNombre).contains("|")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf("|", indiceInicioNombre);
                            }
                            dureza = Integer.parseInt(tiposPlantas[i].substring(indiceInicioNombre, indiceFinalNombre));

                        }
                        //peso
                        if (tiposPlantas[i].contains("Peso=")) {
                            indiceInicioNombre = tiposPlantas[i].indexOf("Peso=") + 5;
                            if (tiposPlantas[i].substring(indiceInicioNombre).contains(";")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf(";", indiceInicioNombre);
                            } else if (tiposPlantas[i].substring(indiceInicioNombre).contains(")")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf(")", indiceInicioNombre);
                            } else if (tiposPlantas[i].substring(indiceInicioNombre).contains("|")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf("|", indiceInicioNombre);
                            }
                            peso = Integer.parseInt(tiposPlantas[i].substring(indiceInicioNombre, indiceFinalNombre));

                        }
                        lista.add(new Defensa(altura, dureza, peso, nombrePlanta, altura, vidaPlanta));
                        System.out.println("Defensa Agregada");
                    } else if (tiposPlantas[i].contains("Explosiva")) {
                        //magnitud
                        int magnitud = 0;
                        if (tiposPlantas[i].contains("Magnitud=")) {
                            indiceInicioNombre = tiposPlantas[i].indexOf("Magnitud=") + 9;
                            if (tiposPlantas[i].substring(indiceInicioNombre).contains(";")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf(";", indiceInicioNombre);
                            } else if (tiposPlantas[i].substring(indiceInicioNombre).contains(")")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf(")", indiceInicioNombre);
                            } else if (tiposPlantas[i].substring(indiceInicioNombre).contains("|")) {
                                indiceFinalNombre = tiposPlantas[i].indexOf("|", indiceInicioNombre);
                            }
                            magnitud = Integer.parseInt(tiposPlantas[i].substring(indiceInicioNombre, indiceFinalNombre));

                        }
                        lista.add(new Explosiva(magnitud, nombrePlanta, ataquePlanta, vidaPlanta));
                    }
                }
                //Obtener 
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void cargarArchivoZombi() {
        FileReader fr = null;
        BufferedReader br = null;
        listaZombis = new ArrayList();
        if (archivo.exists()) {
            try {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String archivoTexto = br.readLine();
                //Agrega cada tipodeZombi
                String[] tiposZombi = archivoTexto.split("\\|");
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
