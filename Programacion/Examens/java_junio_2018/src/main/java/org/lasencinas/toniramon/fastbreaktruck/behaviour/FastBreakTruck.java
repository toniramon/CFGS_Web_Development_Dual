package org.lasencinas.toniramon.fastbreaktruck.behaviour;


import org.lasencinas.toniramon.fastbreaktruck.consumibles.*;
import org.lasencinas.toniramon.fastbreaktruck.domain.Desayuno;

public class FastBreakTruck {

    public FastBreakTruck() {
    }

    public static Desayuno prepararEyeHoles() {

        Eyeholes eyehole = new Eyeholes("Eyeholes", (float) 25.0);
        TurbulentJuice turbulentJuice = new TurbulentJuice("Turbulent juuuuuuice", (float) 30.0);

        Desayuno desayuno = new Desayuno();

        desayuno.setItem(eyehole);
        desayuno.setItem(turbulentJuice);

        return desayuno;
    }

    public static Desayuno prepararSmiggles() {

        Smiggles smiggles = new Smiggles("Smiggles", (float) 50.0);
        FleebJuice fleebJuice = new FleebJuice("Fleeb Juice", (float) 35.0);

        Desayuno desayuno = new Desayuno();

        desayuno.setItem(smiggles);
        desayuno.setItem(fleebJuice);

        return desayuno;

    }

    public static void incluirJuguete(Desayuno eyeDes) {
        Plumbus plumbus = new Plumbus("Plumbus", (float) 100.0);
        eyeDes.setItem(plumbus);
    }
}
