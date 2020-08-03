package org.lasencinas.bowlinGame;

public class Tarjeta {

    /* Declaración variables */

    private String tarjetaPuntos = "";
    private int puntuacionTotal = 0;
    String pines = "-123456789";

    private int STRIKE = 10;
    private int SPARE = 10;
    private int CERO = 0;

    /* Constructores */

    public Tarjeta() {
        this.tarjetaPuntos = "";
    }


    public Tarjeta(String tarjetaPuntos) {
        this.tarjetaPuntos = tarjetaPuntos;
    }



    /* getters y setters */

    public int getStrike() {
        return this.STRIKE;
    }

    public int getSpare() { return this.SPARE; }

    public int getPuntuacionTotal() {
        return this.puntuacionTotal;
    }


    /* Parte privada */

    /* Interfaz Publica */



    public static int computarStrike(char strike) {
        if( strike == 'X' ) {
            return 10;
        } else {
            return 0;
        }

    }


    public int computarSpare(String frame) {

        if (frame.charAt(0) == 'X') {
            return this.CERO;
        }

        try {
            if (frame.charAt(1) == '/') {
                return  this.SPARE;
            } else {
                return this.CERO;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return this.CERO;
        }

    }


    public int computarPines(char pins) {
        return this.pines.indexOf(pins);
    }


    public int computarTarjeta(String tarjeta) {

        // tiramos 18 bolas.
        int lanzamientos = 1;

        for(int bola = 0; bola < tarjeta.length(); bola++) {


            if (lanzamientos > 18) {

                // Sumamos puntos
                if (tarjeta.charAt(bola) == 'X') {
                    this.puntuacionTotal += this.computarStrike(tarjeta.charAt(bola));
                    lanzamientos += 1;
                } else if (tarjeta.charAt(bola) == '/') {
                    // Hacemos un Spare
                    String frame = "" + tarjeta.charAt( bola - 1 ) + tarjeta.charAt( bola );
                    this.puntuacionTotal += this.computarSpare(frame);

                    // Restamos la anterior.
                    this.puntuacionTotal -= this.computarPines(tarjeta.charAt( bola - 1));

                } else {
                    this.puntuacionTotal += this.computarPines(tarjeta.charAt(bola));
                    lanzamientos += 1;
                }

            } else {

                if (tarjeta.charAt(bola) == 'X') {
                    // Ejecutamos Strike
                    this.puntuacionTotal += computarStrike(tarjeta.charAt( bola ) );

                    for (int i = 1; i <= 2; i++) {
                        if ((tarjeta.charAt( bola + i )) == 'X') {
                            this.puntuacionTotal += computarStrike(tarjeta.charAt( bola + i ) );
                        } else if (tarjeta.charAt( bola + i ) == '/') {
                            // Hacemos un Spare
                            String frame = "" + tarjeta.charAt( bola + i - 1 ) + tarjeta.charAt( bola + i );
                            this.puntuacionTotal += this.computarSpare(frame);

                            // Restamos la anterior.
                            this.puntuacionTotal -= this.computarPines(tarjeta.charAt( bola + i - 1));

                        } else {
                            this.puntuacionTotal += this.computarPines(tarjeta.charAt( bola + i ));
                        }
                    }

                    lanzamientos += 2;

                } else if (tarjeta.charAt( bola ) == '/') {

                    // Hacemos un Spare
                    String frame = "" + tarjeta.charAt( bola - 1 ) + tarjeta.charAt( bola );
                    this.puntuacionTotal += this.computarSpare(frame);

                    // Restamos la puntuación anterior
                    this.puntuacionTotal -= this.computarPines(tarjeta.charAt( bola - 1 ));

                    // Sumamos la puntuación posterior.
                    if ((tarjeta.charAt( bola + 1 )) == 'X') {
                        this.puntuacionTotal += computarStrike(tarjeta.charAt( bola + 1 ) );
                    } else {
                        this.puntuacionTotal += this.computarPines(tarjeta.charAt( bola + 1 ));
                    }

                    lanzamientos += 1;

                } else {
                    // Sumamos puntos
                    this.puntuacionTotal += this.computarPines(tarjeta.charAt(bola));
                    lanzamientos += 1;
                }

            }

        }

        return this.puntuacionTotal;

    }


}
